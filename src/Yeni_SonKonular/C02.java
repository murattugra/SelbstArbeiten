package Yeni_SonKonular;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C02 {

	public static void main(String[] args) {
	
		/*  Soru 2 : Ilk soruya 3.bir islem ekleyelim, set’i Hashset olarak olusturup elemanlari 
          ekleyelim ve sonra TreeSet’e cevirip yazdiralim
          Long time=System.currentTimeMilis() method’unu kullaninız 
		*/

		
		
		Set<Integer> ts =new TreeSet<>();
		Set<Integer> hs= new HashSet<>();
		
		
		Random r=new Random();
		
		
		Long basTree=System.currentTimeMillis();
		
		for (int i = 0; i <=100; i++) {
			hs.add(r.nextInt());
		}
		Long bitisTree=System.currentTimeMillis();
		
		
		for (Integer i : hs) {
			ts.add(i);
		}
		
		
	}

}
