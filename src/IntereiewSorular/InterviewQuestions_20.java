package IntereiewSorular;

import java.util.ArrayList;
import java.util.List;

public class InterviewQuestions_20 {

	public static void main(String[] args) {
		/*

        We are organizing a horse race with horses having distinct strengths.
        The strength of the horses is represented by an array of integers.
        In order to make the race competitive,  your program should find out the pair of
        horses with similar str
        Farklı güçleri olan atlarla bir at yarışı düzenliyor. Atların gücü bir tamsayı dizi assign  edilirse.
        bir birine yakın güçlere sahip at çiftlerini bulunuz.
        For example :{3, 67, 9, 46, 55, 48}
        output : 46,48

         */
		
		
		
		int arr[]= {3, 67, 9, 46, 55, 48};
		
		List<Integer> lst=new ArrayList<>();
		lst.add(0);
		lst.add(0);
		int kova=1000000000;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
				if (arr[i]-arr[j]<kova) {
					kova=arr[i]-arr[j];
					lst.set(0,arr[i]);
					lst.set(i, arr[j]);
				}
					
							
				} else {
					if (arr[j]-arr[i]<kova) {
						kova=arr[j]-arr[i];
						lst.set(0,arr[j]);
						lst.set(1, arr[i]);
					}
		
				
				}
		}
			
			
			
		}
		
		System.out.println(lst);
		
		
		
	}
}
			
		
		
		
		
		
	


