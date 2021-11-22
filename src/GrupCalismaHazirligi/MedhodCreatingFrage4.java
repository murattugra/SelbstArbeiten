package GrupCalismaHazirligi;

import java.util.Scanner;

public class MedhodCreatingFrage4 {

	public static void main(String[] args) {
	
		/*Kullanicidan ismini, soyismini ve bosluk birakmadan 16 hane olarak kredi
		 * karti numarasini alin. Isim ve soyismi ilk harfleri buyuk diger harfler kucuk
		 * olacak sekilde, KK numarasini ise 4 rakamlik 4 blok ve aralarinda bosluk
		 * olacak sekilde duzelten 2 method yazin, ve programda kullanabilmek icin
		 * duzenlenmis hallerini geri dondurun.
		*/
		 Scanner scan =new Scanner(System.in);
	        
	        System.out.print("Lutfen isminizi giriniz: ");
	        
	        String isim = scan.next();
	        
	        System.out.println("Soy isminizi giriniz : ");
	        
	        String soyIsim = scan.next();
	        
	        System.out.println("16 haneli Kredi karti numaranizi aralarinda bosluk birakmadan giriniz : ");
	        
	        String kart = scan.next();
	          
	        duzeltIsim(isim , soyIsim);
	         
	        kart(kart);
	           
	        scan.close();
	               
	    }
	       
	    public static void duzeltIsim(String str1, String str2) {
	              
	        System.out.println("Adiniz: "+ str1.toUpperCase().substring(0,1)+str1.toLowerCase().substring(1,str1.length())+"\nSoyadiniz: "+ str2.toUpperCase().substring(0,1)+str2.toLowerCase().substring(1,str2.length()));
	        
	    }
	    
	    public static void kart(String a) {
	           
	       System.out.println(a.substring(0,4)+ "  " + a.substring(4,8)+ "  "+a.substring(8,12)+ "  "+ a.substring(12,16));
	        
	    }	        
	    
	}