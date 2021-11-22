package GrupCalismaHazirligi;

import java.util.Scanner;

public class MedthodCreatin_3 {

	public static void main(String[] args) {
	
		/*
         * Kullaniciya kac sayi toplamak istedigini sorun. Kullanici 2,3 veya 4 degerini
         * girerse, kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini
         * yazdirin. Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse “Cok
         * sayi girdiniz, ben toplayamam” yazdirin.
         */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Kac sayi toplamak isiyorsunuz");

		int sayi=scan.nextInt();
		
		if (sayi==2) {
			System.out.println("Lutfen 2 sayilari giriniz");
			int deger1=scan.nextInt();
			int deger2=scan.nextInt();
			System.out.println("Sayilarin Toplami : "+(deger1+deger2));
		} else if(sayi==3){
			System.out.println("Lutfen  3 sayilari giriniz");
			int deger1=scan.nextInt();
			int deger2=scan.nextInt();
			int deger3=scan.nextInt();
			System.out.println("Sayilarin Toplami : "+(deger1+deger2+deger3));
		}else if (sayi==4) {
			System.out.println("Lutfen  4 sayilari giriniz");
			int deger1=scan.nextInt();
			int deger2=scan.nextInt();
			int deger3=scan.nextInt();
			int deger4=scan.nextInt();
			System.out.println("Sayilarin Toplami : "+(deger1+deger2+deger3+deger4));
		}else{
			System.out.println("Bu sayilari toplayamam");
		}
		
		
		
	}

}

