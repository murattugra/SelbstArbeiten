package Z_Kendidenemelerim;

import java.util.Scanner;

public class TernaryDeneme2 {

	public static void main(String[] args) {
		
		//Kullanicidan bir tam sayi ali ve sazinin 
		//tek veya cift oldugunu yazdirin
		
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir tam sayi giriniz");
		
		int sayi=scan.nextInt();
		
		System.out.println(sayi%2==0 ? "cift sayi" : "tek sayi");
		
		
		scan.close();
		
		
	}

}
