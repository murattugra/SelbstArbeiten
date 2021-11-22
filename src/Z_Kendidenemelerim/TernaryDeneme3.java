package Z_Kendidenemelerim;

import java.util.Scanner;

public class TernaryDeneme3 {

	public static void main(String[] args) {
		
		
		//Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin.

		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz");
		
		double sayi=scan.nextDouble();
		
		double mutlakDeger = sayi>=0 ? sayi : (-1)*sayi;

		
		System.out.println(mutlakDeger);
		
		scan.close();
				
	}

}
