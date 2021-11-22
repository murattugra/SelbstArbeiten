package Tag12_TekrarCozumlerim;

import java.util.Scanner;

public class Contains_06 {

	public static void main(String[] args) {
		
		
		//  Soru 1) Kullanicidan email adresini girmesini isteyin, 
        //         - mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”, 
        //         - @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ , 
        //         - @gmail.com ile bitmiyorsa "lutfen yazimi kontol edin" yazdirin 
        
		
		Scanner scan=new Scanner(System.in);//once kullanicidan veri alabilmemiz icin scan olusturduk 
		
		System.out.println("Lufen email adresi giriniz");//kullaniciya mesaj verdik yazmasi icin	
		
		String email=scan.next();//kullaniinin yazdigi emaili String  Variable sine atadik
		
		int uzunluk=email.length();//burada girilen email in kac inex ten olustugu yani uzunlugunu int a atadik
		int index=email.lastIndexOf("@gmail.com");//burada girilen adreste @gmail.com kelimesinin sondan indeksini bulduk
		
		if (index==(-1)) {	//tespit ettigimiz index degerinin eger -1 ise girilen emailde @gmail.com kelimesinin olup 
							//almadigini tespit ettik
			System.out.println("lutfen gmail adresi giriniz");//eger yoksa bunu yazmasini istedik
		} else if(index==uzunluk-10){//@gmail.com un indeksinin uzunluk-10 esit ise emailin sonunda olmadigini tespit ettik	
			System.out.println("Email adresiniz kaydedildi");//esit iese bunn yazdir
		}else {
			System.out.println("lutfen yazimi kontol edin");//butun diger durumlarda yazi hasi vardir
		}
		scan.close();
		
	}

}
