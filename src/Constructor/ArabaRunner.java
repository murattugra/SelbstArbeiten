package Constructor;

public class ArabaRunner {

	public static void main(String[] args) {
		
		
		Araba araba1=new Araba();
		
		System.out.println(araba1.km);
		System.out.println(araba1.model);
		
		Araba araba2= new Araba();
		
		araba2.renk="mavi";
		araba2.satilikMi=true;
		
		System.out.println(araba2.renk+" "+araba2.satilikMi);
	
		Araba araba3=new Araba(130000,"Arstra",2005);
		
		System.out.println(araba3.km+" "+araba3.model+" "+araba3.yil);
	
		Araba araba4=new Araba(40000,"Mondeo",2008,false);
		
		System.out.println("Km : "+araba4.km);
		System.out.println("Model : "+araba4.model);
		System.out.println("Yil : "+araba4.yil);
		System.out.println("Satilikmi : "+araba4.satilikMi);
		
		YedekParca parca=new YedekParca();
		parca.garanti=false;
		parca.lastik="Var";
		parca.lastikAdet=4;
	
		System.out.println(parca.garanti);
		System.out.println(parca.lastik);
		System.out.println(parca.lastikAdet);
		
		YedekParca parca1=new YedekParca(2,"Yok",false);
		
		System.out.println("Garanti : "+parca1.garanti);
		System.out.println("Lastik : "+parca1.lastik);
		System.out.println("Lastik Adeti : "+parca1.lastikAdet);
		
		
		
	}

}
