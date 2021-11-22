package ArraysCalismalarim01;

import java.util.Arrays;

public class Arrays05 {

	public static void main(String[] args) {

		// Soru 2: Verilen bir array’in tum elemanlarini toplayan bir program yazalim.
		
		int ary[]= {6,4,2,10,8};
		
		int toplam= 0;
		
		for (int i = 0; i <ary.length; i++) {
			toplam+=ary[i];
		}
		
		System.out.println("Elementlerin toplami = "+toplam);
		
		// array'in tum elemanlarini once klucukten buyuge
		
		Arrays.sort(ary);
		System.out.println(Arrays.toString(ary));
		
		//  buyukten kucuge yazdirin
		
		
		
			int	tersary[]=new int[ary.length];
	
		for (int i = 0; i < tersary.length; i++) {
		tersary[i]=ary[ary.length-1-i];
			
		}
		System.out.println(Arrays.toString(tersary));
	}

}
