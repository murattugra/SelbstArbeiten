package Z_Kendidenemelerim;

import java.util.Scanner;

public class TernaryDeneme4 {

	public static void main(String[] args) {
		
		
		//	Soru4 ) Kullanicidan bir sayi alin. Sayi pozitifse 
		//“Sayi pozitif” yazdirin,
		//negatifse  sayinin karesini yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir  sayi giriniz");
		
		double sayi=scan.nextDouble();
		
		
		
			System.out.println(sayi>0 ? "sayi fozitif" :( sayi*sayi));
		
		scan.close();
		
		
		
		
		
		
	}

}
