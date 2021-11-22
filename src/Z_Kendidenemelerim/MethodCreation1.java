package Z_Kendidenemelerim;

import java.util.Scanner;

public class MethodCreation1 {

	public static void main(String[] args) {

		// kullanicidan ismini ve soyismini isteyin
        // iki farkli method olusturun methodlardan biri girilen kelimeleri 
        //   ilk harf buyuk, digerleri kucuk olacak sekilde birlestirsin
        // Ikinci method Isim ve soyismin ilk harfleri buyuk harf,
        //   kalan harfler * olacak sekilde birlestirsin
        
        // kullaniciya isminin acik olarak yazilmasi veya gizlenmesi tercihi sorun
        // ve programin kalan ksminda isim ve soyismi kullanicinin istedigi sekilde kullanin
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen isminizi ve soyisminizi giriniz");
		
		String isim=scan.next();
		
		String soyisim=scan.next();
		
		
		
		
		
		
		System.out.println("Isminizin acik sekilde yazilmasini istiyorsaniz 1 istemiyorsaniz 2 yazin");
		int tercih=scan.nextInt();
		
		if (tercih==1) {
			acik(isim,soyisim);
			
		} else if(tercih==2){
			gizli(isim,soyisim);
		}else {
			System.out.println("Lutfen 1 yada 2 yaziniz");
		}
			
		
	}

	private static void acik(String isim, String soyisim) {
	
		System.out.println(isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()+" "+
							soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase());
							
	}

	
	private static void gizli(String isim, String soyisim) {
		
		System.out.println(isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*")+" "+
							soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).replaceAll("\\w", "*"));
	}

}
