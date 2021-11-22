package GrupCalismaHazirligi;

import java.util.Scanner;

public class MedhodFrage3 {

	public static void main(String[] args) {
		
		/*Email kontrolu yapan bir program yazin, kullanicini girdigi sifre
		 * @ icermiyirsa gecersiz mail yazdirin
		 * @gmail.com icermiyirsa “Lutfen gmail adresinizi giriniz” yazdir
		 * @gmail.com ile bitmiyorsa “Yazimda bir sorun var, maili kontrol ediniz”
	*/
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen email giriniz");
		
		String str1 =scan.next();
		
		kontrol(str1);
		
	}

	private static void kontrol(String str1) {
		
		if (!str1.contains("@")) {
			System.out.println("gecersiz email");
		} else if(!str1.contains("@gmail.com")){
			System.out.println("lutfen gmail adresinizi giriniz");
		}else if(!str1.endsWith("@gmail.com")){
			System.out.println("Yazimda bir sorun var, maili kontrol ediniz");
			
	}	else
		System.out.println("Mail kaydedildi");
		
	


	}
}

	
