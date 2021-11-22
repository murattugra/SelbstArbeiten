package GrupCalismaHazirligi;

import java.util.Scanner;

public class day12Contains_01 {

	public static void main(String[] args) {

		
		//  0 1 2 3 4 5 6 7 8 9         indexOf("3") = 3      lastIndexOf("3") = 3  
        
        //Soru 1) Kullanicidan email adresini girmesini isteyin, 
        //mail @gmail.com icermiyorsa “lutfen gmail adresi giriniz”, 
        //@gmail.com ile bitiyorsa “Email adresiniz kaydedildi “ , 
        //@gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
        
        Scanner scan=new Scanner(System.in);
                System.out.println("Lutfen email adresinizi giriniz");
                
                String email=scan.next();
                
                int uzunluk=email.length(); // girilen e mailin tioplam uzunlugu int olarak atandi.
                int index=email.lastIndexOf("@gmail.com"); // girilen e mail adresi icerisinde @gmail.com  kelimesinin olup olmadigina, varsa hangi index de oldugu.
                                                        // last index ile sondan bulup index degerini ine atadi    ///Beispiel : abcdef@gmail.com  index = 6
                
                if (!email.contains("@gmail")) { //girilen mail adresinde @gmail kelimesi yoksa bu blok calisacak.
                    System.out.println("Lutfen gmail adresini giriniz");
                    
                    
                } else if(index==uzunluk-10){  //@gmail.com 10 harften olusuyor bu nedenle eksi 10 yaptik// yani tolam email uzunlugu 20 ise - 10 yaptiimizda sondan
                									//basa dogru 10 sayip index i bulur bu da @gmail.com intex sini bulur
                    System.out.println("Email adresiniz kaydedildi");
                
                }else {
                    System.out.println("Lutfen yazimi kontrol edin");
            
                }
        
    
        
    }

	}


