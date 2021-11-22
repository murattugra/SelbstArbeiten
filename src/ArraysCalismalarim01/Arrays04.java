package ArraysCalismalarim01;

import java.util.Arrays;

public class Arrays04 {

	public static void main(String[] args) {
		/*Soru 1: Verilen 3 elemanli bir array’in tum elemanlarini bir soldaki 
		konuma tasiyacak bir program yazin
		. Ornek; array [1,2, 3] ise output [2, 3, 1] olacak.*/
		
		int ary[]= {4,6,3,8,7};
		int a1=ary[0];
		
		for (int i = 0; i <ary.length-1; i++) {
			ary[i]=ary[i+1];
			
		}
		ary[ary.length-1]=a1;
		System.out.println(Arrays.toString(ary));

	}

}
