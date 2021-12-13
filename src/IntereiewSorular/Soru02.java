package IntereiewSorular;

import java.util.Iterator;

public class Soru02 {

	public static void main(String[] args) {
		/*
		Mauntain Array--> [0, 2, 5, 3, 1] It is constantly increasing 
		to the maximum value, decreasing constantly after the maximum value
		Not Mauntain Array--> [5, 2, 7, 1, 4] 

		Bir array elemanlari en buyuk degerine kadar surekli artan, en 
		buyuk degerinden sonra surekli azalan deger aliyorsa Mauntain Array'dir
		 */
		
		
		int arr[]= {0, 2, 5, 3, 4};
		int max = 0;
		int maxindex=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>max) {
				max=arr[i];
				maxindex=i;
			}
		}
		boolean mauntain=false;
		for (int i = 0; i < maxindex; i++) {
			if (arr[i]<arr[i+1]) {
				mauntain=true;
			}else {
				break;
			}
		}
		for (int j = maxindex; j <arr.length; j++) {
			if (arr[j]>arr[j+1]) {
				mauntain=true;
			}else {
				break;
			}
		}
		
		if (mauntain==true) {
			System.out.println("Mauntain Array");
		}else {
			System.out.println("Mauntain Array degil");
		} 
			
	}

}
