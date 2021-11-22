package Z_Kendidenemelerim;

import java.util.Scanner;

public class IndexCalisma01 {

	public static void main(String[] args) {
		
		 /*  Kullanicidan ismini ve sifresini yazmasini isteyin,
         * Sifreyi icin 8 den az karakter girerse "sifreniz en az 8 karakter icermelidir" yazdirin.
         * 20 karakterden fazla girerse "sifre en fazla 20 karakterden olusabilir" yazdirin.
         * sifre icerisinde kullanicinin ismi geciyorsa "sifre icinde isminizi kullanamazsiniz" yazdirin.
         * 
         */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen isminizi yaziniz");
		
		String isim=scan.next();
		
		System.out.println("Lutfen sirenizi yaziniz");
		
		String sifre=scan.next();
		
		int uzunluk=sifre.length();
		
		if (sifre.contains(isim)) {
			System.out.println("sifre icinde isminizi kullanamazsiniz");
		} else {
			if (uzunluk>=8 &&uzunluk<=20) {
				System.out.println("Sifreniz ve isminiz kaydedildi");
			} else {
				System.out.println("sifreniz en az 8 enfazla 20 karakter icermelidir");
			}
		}
		
		scan.close();
		
	}

}
