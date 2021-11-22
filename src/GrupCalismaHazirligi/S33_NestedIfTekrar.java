package GrupCalismaHazirligi;

import java.util.Scanner;

public class S33_NestedIfTekrar {

	public static void main(String[] args) {
		
		
		//Soru 36) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
        // Kullanicidan bir sifre girmesini isteyin
        //Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. Ilk harf A ise 
		//“Gecerli Sifre”     degilse “Gecersiz Sifre” yazdirin.
        //Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk harf z ise  
		//“Gecerli Sifre”     degilse “Gecersiz Sifre” yazdirin.
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir sifre giriniz");
		
		char ilkharf=scan.next().charAt(0);
		
		if (ilkharf>='A'&& ilkharf <='Z') {
			if (ilkharf=='A') {
				System.out.println("Gecerli sifre");
			} else {
				System.out.println("Gecersiz sifre");
			}
			
		} else if(ilkharf>='a'&& ilkharf <='z') {
			if (ilkharf=='z') {
				System.out.println("Gecerli sifre");
			} else {
				System.out.println("Gecersiz sifre");
			}
			
		}else {
			System.out.println("Sifreniz harf ile baslamali");
		}
		
		

	}

}
