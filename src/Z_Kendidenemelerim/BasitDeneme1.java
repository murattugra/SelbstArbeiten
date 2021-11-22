package Z_Kendidenemelerim;

import java.util.Scanner;

public class BasitDeneme1 {

	public static void main(String[] args) {
		
		//SORU 1

		//Kullanicidan bir tamsayi girmesini isteyin ve sayiyi kendisinden
		//bir kucuk sayi ve bir buyuk sayi ile carpip sonucu yazdirin
		//Ornek 
			//	Input 	: 10
			//	Output : 990 (9*10*11)
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Sayi gir");
		int sayi=scan.nextInt();
		
		int sayi1=(sayi-1);
		int sayi2=(sayi+1);
		
		System.out.println(sayi2*sayi*sayi1);
		
		scan.close();
		
		
		
		
		
		
		
		
	}

}
