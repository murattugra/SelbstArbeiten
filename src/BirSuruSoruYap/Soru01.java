package BirSuruSoruYap;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
	/*	  1---Sayının Sayı değerlerinin toplamasını yapan Java kodu yazınız.
			​
			    Test Data
			    34
			    Beklenen Çıktı
			    7
			    */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Basamak toplamak icin bir sayi giriniz");
		int sayi=scan.nextInt();
		
		int toplam=0;
		int sayac=0;

		while(sayi!=0  ) {
			
			toplam+=sayi%10;
			sayi/=10;
			
			sayac++;
			
		}
		
		System.out.println("Basamak toplami : "+toplam);
		
	}

}
