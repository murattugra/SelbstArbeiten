package Tag12_TekrarCozumlerim;

import java.util.Scanner;

public class IndexOf_02 {

	public static void main(String[] args) {
	
		// Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki 
				//kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
				 //- Girilen kelime cumlede kullanilmamis.
				 //- Girilen kelime cumlede 1 kere kullanilmis.
				 //- Girilen kelime cumlede 1�den fazla kullanilmis.


		Scanner scan=new Scanner(System.in);
	
		System.out.println("Bir cumle giriniz");
	
		String cumle=scan.nextLine().toLowerCase();
		
		System.out.println("bir kelime giriniz");
	
		String kelime=scan.next().toLowerCase();
		
		
		int index=cumle.indexOf(kelime);
		
		if (index<0) {
			
			System.out.println("Girilen kelime cumlede kullanilmamis");
			
		} else if(cumle.indexOf(kelime, index+1)==(-1)){

			System.out.println("Girilen kelime cumlede 1 kere kullanilmis");
			
		}else {
			System.out.println("Girilen kelime cumlede 1�den fazla kullanilmis");
			
		}
	
	scan.close();
	
	
	}

}
