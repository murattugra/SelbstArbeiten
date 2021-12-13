package Encapsulation01;

public class ArabaMain {

	
	public static void  main(String[] args) {
		
		Araba honda=new Araba();
		
	//	honda.setMotor(1300);
	//	honda.setMode("civic");
	//	honda.setYil(2021);
		
	//	honda.getModel();
	//	System.out.println(honda.getYil());
		
		
		Araba volvo = new Araba("xc90","Beyaz",20,-2020);
		Araba ww = new Araba("Passat","Kirmizi",1600,-2021);
		
		System.out.println("Sectiginiz arac -->"+"Yili : "+volvo.getYil()+"  Model: "+volvo.getModel()+"  Renk: " +volvo.getRenk()+"  Motor: "+volvo.getMotor());
		System.out.println("Sectiginiz arac -->"+"Yili : "+ww.getYil()+"   Model: "+ww.getModel()+"  Renk: "+ww.getRenk()+"  Motor: "+ww.getMotor());
		
		
		
		
		
		
		
		
		
	}
	
}
