package ArrayCalismlari02;

import java.util.Arrays;

public class Array04 {
	public static void main(String[] args) {
		/*
		 * Soru 4) Asagidaki multi dimensional array�in ic array�lerindeki tum
		 * elemanlarin toplamini birer birer bulan ve herbir sonucu yeni bir array�in
		 * elemani yapan ve yeni array�i ekrana yazdiran bir program yaziniz { {1,2,3},
		 * {4,5}, {6,7} } Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==>
		 * output: {6, 9, 13}
		 *
		 * 
		 */

		int ary1[][] = { { 1, 2, 3 }, { 4, 5 }, { 6, 7 } };

		int ary2[] = new int[ary1.length];

		for (int i = 0; i < ary1.length; i++) {
			int toplam = 0;
			for (int j = 0; j < ary1[i].length; j++) {
				toplam += ary1[i][j];
			}
			ary2[i] += toplam;

		}

		System.out.println(Arrays.toString(ary2));
	}
}