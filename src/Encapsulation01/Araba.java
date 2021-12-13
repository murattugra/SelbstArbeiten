package Encapsulation01;

public class Araba {

	private String model;
	private String renk;
	private int motor;
	private int yil;
	
	public Araba() { //Alttaki contructor default u sildigi icin bunu olusturduk
		
	}
	
	public Araba(String mode, String renk, int motor, int yil) {
	
		this.model = mode;
		this.renk = renk;
		setMotor(motor);
		setYil(yil);
	}

	public String getModel() {
		return model; 
	}

	public void setMode(String mode) {
		this.model = mode;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public int getMotor() {
		return motor;
	}

	public void setMotor(int motor) {
		if (motor>=100) {
			this.motor = motor;
			System.out.println("Motor beygiri degistirildi");
		}else {
			System.out.println("100 Altinda Beygir Gucu Mevcut Degil");
		}
		
	}

	public int getYil() {
		return yil;
	}

	public void setYil(int yil) {
		if (yil<0) {
			System.out.println("Negatif yil girimezsiniz");
			this.yil = -yil;
		}else {
			this.yil = yil;
		}
		
		
		
	}
	
	
	
	
	
}
