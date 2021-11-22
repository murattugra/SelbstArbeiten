package Z_Kendidenemelerim;

import java.util.Scanner;

public class Deneme_NestedIf {

	public static void main(String[] args) {
		
		 // Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir, 
        // calisan erkekse 65 yasindan buyukse emekli olabilir
        

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen cinsiyetinizi E yada K olarak giriniz");
		
		char cinsiyet=scan.next().toUpperCase().charAt(0);
		
		System.out.println("Lütfen yasinizi giriniz");
		
		double yas=scan.nextDouble();
		
		if (cinsiyet=='E') {
			if (yas>65) {
				System.out.println("Emekli olabilirsiniz");
			} else {
				System.out.println("Emekli olamazsiniz");
			}
			
		} else if(cinsiyet=='K'){
			
			if (yas>60) {
				System.out.println("Emekli olabilirsiniz");
			} else {
				System.out.println("Emekli olamazsiniz");
			}
			
		} else {
			System.out.println("Lütfen gecerli bir deger giriniz");
		}
		
		
		
		
		scan.close();
		
		
		
		
	}

}
