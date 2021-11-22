package ReplitCalismalar02;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Method_Array_3 {

	public static void main(String[] args) {
		/*
		 * Bir String'i parametre olarak kabul eden ve verilen string'de bulunan
		 * rakamların toplamını yazdıran bir metot yazın.
		 * 
		 * girdi: ade1r4d3
		 * 
		 * çıktı : 8
		 * 
		 * İpucu : Karakter.isDigit() kullanın Tamsayı.değerOf()
		 */

		String girdi = "ade1r4d3";

		girdi = girdi.replaceAll("\\D", "");
		
		String ary[] = girdi.split("");
		System.out.println(Arrays.toString(ary));
	
		int ary2[]=new int[2];
		for (int i = 0; i < ary.length; i++) {
			ary2[i]=ary[i];
			
			
		}
	}

}
