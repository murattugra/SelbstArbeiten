package GrupCalismaHazirligi;

import java.util.Scanner;

public class S34 {

	public static void main(String[] args) {
		
		//Soru36-2)Kullanicidan 4 basamakli bir sayi girmesini isteyin. Girdiği sayi 5’e 
		//bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana “5’e bölünen  çift sayı” yazdırın. 
		//Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın. 
		//Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen 4 basamakli bir sayi grin");
		
		int sayi=scan.nextInt();
		
		if (sayi>=1000 && sayi<=9999) {
			
			if (sayi%5==0) {
				
				if (sayi%10==0) {
					
					System.out.println(" Sayi 5 e bolunensayi cift sayi");
				} else {
					
					System.out.println("Sayi 5 e bolunenTek sayi");
				}
				
			} else {
				
				System.out.println("Sayi 5 e bolunmez");
				
			}
							
		} else {
					
			System.out.println("Sayi 4 basamakli olmali");
		}
		scan.close();		
	}

}
