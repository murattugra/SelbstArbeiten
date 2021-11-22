package ReplitSorulari;

import java.util.Scanner;

public class SoruWhileLoop01 {
	/*	Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
	 *  ardından isimdeki döngüleri kullanarak karakterin isimde kaç 
	 *  kez tekrarlandığını kontrol edin.

		Örneğin:

		char ch1= 'a' ;

		String name="John geç geldi"

		Beklenen Çıktı: a sayısı = 2

*/
	  
	    public static void main(String[] args) {
	    
	    char ch1= 'a' ;
	     String name="John came late";
	  
	     harfbulma(name,ch1);

	    }

	private static void harfbulma(String name, char ch1) {
		
		int sayac=0;
		for (int i = 0; i <name.length(); i++) {
			
			if (name.charAt(i)==ch1) {
				sayac++;
			}
			
		}
		System.out.println(sayac);
		
	}
	}