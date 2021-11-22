package ReplitSorulari;

import java.util.Scanner;

public class For_while_7_TR {

	public static void main(String[] args) {
		/*Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.
		Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse, herhangi
	    bir sayı Mükemmel Sayı olarak bilinir.
		Input :
		6   1 + 2 + 3  = 6
		Output:
		6 Mukemmel Sayidir.
		======================
		Input
		7
		Output:
		7 Mukemmel Sayidir degildir.
		*/

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Sayinin Mukemmel olup olmadigini ogrenmek icin bir sayi giriniz");
		
		int sayi=scan.nextInt();
		
		int bas=1;
		
		int top=0;
		while(bas<sayi) {
		if (sayi%bas==0) {
			top+=bas;
		}	
			bas++;
			
		}
		if (top==sayi) {
			System.out.println("Girdiginiz sayi mukemmel sayidir");
		} else {
			System.out.println("Girdiginiz sayi mukemmel sayi degildir");
		}
		
		
		scan.close();
		
	}

}
