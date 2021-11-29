package Constructor;

public class Araba {

	
	int yil;
	String renk;
	String model;
	int km;
	boolean satilikMi;

	Araba(){
		
	}

	public Araba(int km1, String model1, int yil1) {
		km=km1;
		model=model1;
		yil=yil1;
			
	}

	public Araba(int km, String model, int yil, boolean b) {
		this.km=km;
		this.model=model;
		this.yil=yil;
		satilikMi=false;
		
	}

	public  void hiz(int hiz) {
		System.out.println("Araba saatte "+hiz + "km yapar");
	}
	
	public void yakit(String yakit) {
		
		System.out.println("Araba yakit olarak "+yakit+ " kullanir");
	}
	
	
	
	
	
	
	
}
