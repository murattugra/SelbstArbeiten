package ArrayCalismlari02;

public class Array02 {

	public static void main(String[] args) {
		/* int array [][]= {{1,2,3} , {4,5,6}};  tum elemanlarinin carpimini 
		 * ekrana yazdiran bir method yaziniz.
		 */
		
		int array [][]= {{1,2,3} , {4,5,6}};
		
		int carpim=1;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				carpim*=array[i][j];
			}
		}
		System.out.println(carpim);
	}

}
