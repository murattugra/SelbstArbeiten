package Z_Kendidenemelerim;

import java.util.Scanner;

public class TernarzDeneme {

	public static void main(String[] args) {
		
		
		//Kullanicidan iki sayi alin buyuk olmayani yazdirin
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz");
		
		double sayi1=scan.nextDouble();
		
		System.out.println("Lutfen bir daha sayi giriniz");
		
		double sayi2=scan.nextDouble();
		
		System.out.println(sayi1>sayi2 ? sayi2 : sayi1);
		scan.close();
		
	}

}
