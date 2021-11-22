package GrupCalismaHazirligi;

import java.util.Scanner;

public class StringMani_TesrtenYazdirma {

	public static void main(String[] args) {
		
		//Soru 5) Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.
	   //String Manipulation / Methods

		 Scanner scan = new Scanner(System.in);
	        
	        System.out.println("4 harfli bir kelime giriniz:");       
	        
	        String kelime = scan.next();
	        
	        
	        if (kelime.length()!=4) {
	            
	            System.out.println("Lutfen 4 haneli kelime giriniz");     //1234
	            
	        } else {
	        //                                                                              4                       3                   2                       1
	            System.out.println("girilen 4 harfli kelimenin tersten yazilisi: " + kelime.substring(3,4)+kelime.substring(2,3)+kelime.substring(1,2)+kelime.substring(0,1));
	        }
	        
	    
	        scan.close();
	        
	
		
		
	}

}
