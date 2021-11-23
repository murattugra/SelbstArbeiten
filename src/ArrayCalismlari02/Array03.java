package ArrayCalismlari02;

public class Array03 {

	public static void main(String[] args) {
		/*		Asagidaki multi dimensional array�lerin ic array�lerinde ayni index�e sahip
		elemanlarin toplamini ekrana yazdiran bir program yaziniz. (Zor soru) 
		arr1 = { {1,2,4},{3,4,5}, {6} }         ve       arr2 = { {7,8,9}, {10,11}, {12} }


/*Bu ornek icin asagidaki sonuclari verecek.
 *  * arr1[0][0]   +	arr2[0][0]	=	8
 *  * arr1[0][1]	+	arr2[0][1]	=	10	
 *  * arr1[1][0]	+	arr2[1][0]	=	13
 *  * arr1[1][1]	+	arr2[1][1]	=	15
 * * arr1[2][0]	+	arr2[2][0]	=	18
  */

		int arr1[][]= {{1,2,4},{3,4,5},{6}};
		
		int arr2[][]={{7,8,9}, {10,11}, {12}};
		
		for (int i = 0; i < arr2.length; i++) {
			int toplam=0;
			for (int j = 0; j < arr2[i].length; j++) {
				toplam=arr1[i][j]+arr2[i][j];
				System.out.println("arr1["+i+"]["+j+"]   +	arr2["+i+"]["+j+"]	= "+toplam);
			}
			
		}
		
	}

}
