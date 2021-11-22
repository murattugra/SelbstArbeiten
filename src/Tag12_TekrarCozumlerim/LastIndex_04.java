package Tag12_TekrarCozumlerim;

import java.util.Scanner;

public class LastIndex_04 {

	public static void main(String[] args) {
		
		// Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, 
        //      kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //      - Girilen kelime cumlede kullanilmamis.
        //      - Girilen kelime cumlede 1 kere kullanilmis.
        //      - Girilen kelime cumlede 1’den fazla kullanilmis.
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("cumle gir");
		
		String cumle=scan.nextLine().toLowerCase();
		
		System.out.println("kelime gir");
		
		String kelime=scan.next().toLowerCase();
		
		int index1=cumle.indexOf(kelime);
		int index2=cumle.lastIndexOf(kelime);
		
		
		if (index1<0) {
			System.out.println("Bu kelime cumlede yok");
		} else if(index1==index2){
			System.out.println("Kelime cumlede bir kere kullanilmis");
			
		}else {
			System.out.println("Kelime cumlde birden fazla kullanilmis");
			
		}
		scan.close();
	}

}
