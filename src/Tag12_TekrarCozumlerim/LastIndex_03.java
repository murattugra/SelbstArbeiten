package Tag12_TekrarCozumlerim;

import java.util.Scanner;

public class LastIndex_03 {

	public static void main(String[] args) {
		
		// Kullanicidan bir cumle ve bir harf isteyin, 
        // harfin cumlede var olup olmadigini yazdirin

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir cumle giriniz");
		
		String cumle=scan.nextLine().toLowerCase();
		
		System.out.println("Lutfen bir haf giriniz");
		
		char krter=scan.next().toLowerCase().charAt(0);
		
		int index=cumle.lastIndexOf(krter);
		
		if (index==(-1)) {
			System.out.println("Bu karakter cumlede yoktur");
		} else {
			System.out.println("Bu karakter cumlede vardir");
		}
		
		scan.close();
		
	}

}
