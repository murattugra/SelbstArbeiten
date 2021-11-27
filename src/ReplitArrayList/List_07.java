package ReplitArrayList;

import java.util.ArrayList;
import java.util.List;

public class List_07 {

	public static void main(String[] args) {
		
		/*bir diziden belirli bir elemanı çıkarmak 
		 * ve kalan elemanları yeni bir diziye koymak ve yeni diziyi basmak için bir Java programı yaz

		Giriş :{1,2,3,4,5,6}

		eleman:6

		Çıkış : [1,2,3,4,5]
		*/

			int arr[]= {1,2,3,4,5,6};
			
			List<Integer> lst=new ArrayList<>();
				
			for (Integer each : arr) {
				lst.add(each);
			}
			
			
			System.out.println(lst.remove(5));
	
	System.out.println(lst);
	
	}

}
