package GrupCalismaHazirligi;

import java.util.Scanner;

public class day12Contain2 {

	public static void main(String[] args) {
		
		//Soru 2) Kullanicidan bir cumle isteyin. Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak, 
        //“kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin, iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.
        
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Lutfen bir cumle giriniz:");
        
        String cumle = scan.nextLine();
        
        if (cumle.contains("buyuk") && cumle.contains("kucuk")) { //girilen cumlenin icinde kucuk VE buyuk kelimeleri varsa alt satirda kullaniciya soru soracak.
            
            System.out.println("Cumle buyuk harfle mi kucuk harfle mi yazilsin? B/K?");
            
            String soru = scan.next().toUpperCase();    // kullanicidan gelen cevabi (B/K) burada buyuk harf olarak aldik.
            
            if (soru.equals("B")) { // gelen cevap B ise alt satirda cumleyi buyuk yazdiracak. 
                                
                System.out.println(cumle.toUpperCase());
                
                
            } else if(soru.equals("K") ) { // gelen cevap K ise cumleyi kucuk yazdiracak.
                System.out.println(cumle.toLowerCase());
            }
            
            
        } else if (cumle.contains("buyuk")) { //cumle sadece buyuk kelimesini iceriyorsa alt satir calisacak ve buyuk harflerle yazdiracak.
            
            System.out.println(cumle.toUpperCase());
        } else if(cumle.contains("kucuk")) { //cumle sadece kucuk kelimesini iceriyorsa alt satir calisacak ve kucuk harflerle yazdiracak
            System.out.println(cumle.toLowerCase());
        }else {
            
            System.out.println("buyuk yada kucuk kelimesi icermiyor"); // diger tum durumda yani buyuk veya kucuk kelimelerini icermiyorsa bu satir calisacak.
        }
        
        
        scan.close();
    }


	}


