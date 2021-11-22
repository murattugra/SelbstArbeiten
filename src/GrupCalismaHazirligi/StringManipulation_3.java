package GrupCalismaHazirligi;

import java.util.Scanner;

public class StringManipulation_3 {

	public static void main(String[] args) {
		
	/*Soru 3) Kullanicidan isim isteyin. Eger
	- isim “a” harfi iceriyorsa “Girdiginiz isim a harfi iceriyor”
    - isim “Z” harfi iceriyorsa “Girdiginiz isim Z harfi iceriyor”
	- ikisi de yoksa “Girdiginiz isim a veya Z harfi icermiyor” yazdirin
	*/
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("isim giriniz");
		
		String isim=scan.next();
		
		if (isim.contains("a")) {
			System.out.println("Girdiginiz isim a harfi iceriyor");
		} else if(isim.contentEquals("Z")){
			System.out.println("Girdiginiz isim Z harfi iceriyor");
		}else {
			System.out.println("Girdiginiz isim a veya Z harfi icermiyor");
		}
		
		
		
		
	}

}
