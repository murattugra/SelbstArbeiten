package IntereiewSorular;

import java.util.ArrayList;
import java.util.List;

public class Questions_04 {

	public static void main(String[] args) {
		/*
	    From a given array find all pairs whose sum is a given number
	verilen bir arraydeki, toplamı belirli bir sayı olan tüm çiftleri bulun
	           For example; 
	           input :  {4, 6, 5, -10, 8, 5, 20} ==> 10
	           Output :  4 + 6 = 10, 5 + 5 = 10, -10 + 20 = 10 
	   
	
	 */
		
		 int arr[]={4, 6, 5, -10, 8, 5, 20};
		List<Integer> lst=new ArrayList<>();
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				lst.add(arr[i]+arr[j]);
				
				
			}
		}
		
		
		
		
	}

}
