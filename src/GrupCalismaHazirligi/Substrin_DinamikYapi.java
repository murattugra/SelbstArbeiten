package GrupCalismaHazirligi;

import java.util.Scanner;

public class Substrin_DinamikYapi {

	public static void main(String[] args) {
		
		// Kullanıcıdan ismini isteyiniz. İSminin son harfini yazdırınız.
        
		Scanner scan=new Scanner(System.in);
		
		System.out.println("isim gir");
		
		String isim=scan.next();
		
		System.out.print(isim.substring(isim.length()-1, isim.length())); // son karakteri String olarak aliyor.
		
		
	}

}
