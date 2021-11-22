package GrupCalismaHazirligi;

import java.util.Scanner;

public class LengtheMethod {

	public static void main(String[] args) {
		
	//Soru 4) Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen isim giriniz");
		
		String isim=scan.next();
		
		System.out.println("Lutfen soyisim giriniz");
		
		String soyisim=scan.next();
		
		
		System.out.println(   isim.length()>soyisim.length()? "isim uzundur"  :
							(isim.length()<soyisim.length()? "soyisim buyukdur" : "esittir")       );
		
		
		
		/*int isimuzunluk=isim.length();
		
		int soyisimuzunluk=soyisim.length();
		
		
		if (isimuzunluk>soyisimuzunluk) {
			System.out.println("isim soyisimden daha uzundur");
		} else if(isimuzunluk<soyisimuzunluk){
			System.out.println("soyisim isimden daha uzundur");
		}else {
			System.out.println("ikiside esittir");
		}
		
		
		
		if ( (isim.length())>(soyisim.length()) ) {
			System.out.println("İsim soyisminden uzundur");
		} else if ( (isim.length())<(soyisim.length()) ) {
			System.out.println("Soyisim isimden uzundur");
		}
		else {
			System.out.println("her ikside aynıdır");

		}

		*/
	
		
		
		
	}

}
