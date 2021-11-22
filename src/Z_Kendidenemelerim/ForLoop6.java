package Z_Kendidenemelerim;

import java.util.Scanner;

public class ForLoop6 {

	public static void main(String[] args) {
		// Soru 11 ) Interview Question Kullanicidan 10’dan kucuk bir  tamsayi isteyin
        //           ve girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
        
		Scanner scan=new Scanner(System.in);
		
		System.out.println("10 dan bir kucuk sayi giriniz");
		
		int sayi=scan.nextInt();
		
		for (int i = sayi; i > 1; i--) {
			System.out.print(i+"!="+i);
		}
		
		
		
		
		
	}

}
