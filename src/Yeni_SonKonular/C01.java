package Yeni_SonKonular;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C01 {

	public static void main(String[] args) {
		/* Soru 1 : Bir TreeSet ve HashSet’e random 100 sayi ekleyin, islem surelerini kiyaslayin
		 
		       Long time=System.currentTimeMilis() method’unu kullaninız 
		        */
		
		Set<Integer> ts =new TreeSet<>();
		Set<Integer> hs= new HashSet<>();
		
		
		Random r=new Random();
		
		
		Long basTree=System.currentTimeMillis();
		
		for (int i = 0; i <=100; i++) {
			ts.add(r.nextInt());
		}
		Long bitisTree=System.currentTimeMillis();
		

		Long basHash=System.currentTimeMillis();
		
		for (int i = 0; i <=100; i++) {
			hs.add(r.nextInt());
		}
		Long bitisHash=System.currentTimeMillis();
		
		
		long tsIslemSure=bitisTree-basTree;
		long hsIslemSure=bitisHash-basHash;
		
		
		if (tsIslemSure>hsIslemSure) {
			System.out.println("HashSet daha hizlidir");
		}else if(hsIslemSure>tsIslemSure){
			System.out.println("TreeSet daha hizlidir");
		}else {
			System.out.println("Hizlari aynidir");
		}
			
		
		
	}

}
