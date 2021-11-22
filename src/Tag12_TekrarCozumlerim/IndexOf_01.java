package Tag12_TekrarCozumlerim;

import java.util.Scanner;

public class IndexOf_01 {

	public static void main(String[] args) {
		
		
		//Kullanicidan bir cumle ve bir harf isteyin
		//harfin cumlede var olup olmadigini yazdirin
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir cumle yaziniz");
		
		String cumle=scan.nextLine();
		
		System.out.println("Lutfen bir harf giriniz");
		
		char karakter=scan.next().toLowerCase().charAt(0);
		
		int index=cumle.indexOf(karakter);
		
		if (index==(-1)) {
			System.out.println("Bu karakter cumle icinde yoktur");
		} else {
			System.out.println("Bu karakter cumle icinde vardir");
		}
		
		
		scan.close();
	}

}
