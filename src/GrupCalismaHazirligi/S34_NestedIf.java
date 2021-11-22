package GrupCalismaHazirligi;

import java.util.Scanner;

public class S34_NestedIf {

	public static void main(String[] args) {
		
		        //Soru36-2)Kullanicidan 4 basamakli bir sayi girmesini isteyin. Girdiği sayi 5’e 
				//bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana “5’e bölünen  çift sayı” yazdırın. 
				//Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın. 
				//Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
				
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen 4 basamakli pozitif bir sayi girin");
		
		int sayi=scan.nextInt();
		
		
		if (sayi>=1000 && sayi<=9999) {// burada sadece 4 basamakli sayilar alinir
			
			if (sayi%5==0) {//burada sadeece 4 basamakli sayilardan  5 e tam bolunen sayilar alinir
				if (sayi%10==0) {//burada sadeece 4 basamakli sayilardaki  5 e tam bolunen sayilarin cift sayi olanlari alir
					System.out.println("bese tam bolunen cift sayi");
				} else {
					System.out.println("bese tam bolunebilen tek sayi");
				}
				
			} else {
				System.out.println("tekrar deneyin");
			}
				
			
		} else {
			System.out.println("Sayiniz 4 basamakli olmali");
		}
		
		
	}

}
