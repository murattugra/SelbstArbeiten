package ArrayCalismlari02;

import java.util.Arrays;
import java.util.Iterator;

public class Array06 {

	public static void main(String[] args) {
		// Soru 6) Verilen bir Array’den isten degere esit olan elamanlari kaldirip,
		// kalanlari yeni bir
		// Array olarak yazdiran bir method yaziniz

		int istenmeyen = 5;

		int ary[] = { 5, 2, 8, 6, 1, 5, 8 };

		int sayac = 0;

		for (int i = 0; i < ary.length; i++) {
			if (ary[i] == istenmeyen) {
				sayac++;
			}

		}

		int ary2[] = new int[ary.length - sayac];
		System.out.println(Arrays.toString(ary2));
		int index = 0;

		for (int i = 0; i < ary.length; i++) {
			if (ary[i] != istenmeyen) {
				ary2[index] = ary[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(ary2));
	}

}