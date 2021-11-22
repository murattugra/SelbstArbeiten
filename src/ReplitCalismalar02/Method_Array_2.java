package ReplitCalismalar02;

import java.util.Arrays;

public class Method_Array_2 {



	public static void main(String[] args) {
	
		/*Array (tüm boşluklar ve özel karakterlerle) 
		 * kullanarak bir cümleyi tersine çeviren bir Java programı yazın.

		Girdi : Kodlama harika.

		Çıktı: .harika Kodlama
		*/
		
		String girdi="Kodlama harika";
		
		String ary[]=girdi.split(" ");
		
		System.out.println(ary[1]+" "+ary[0]);
		System.out.println(Arrays.toString(ary));
	}

}
