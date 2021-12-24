package BirSuruSoruYap;

public class Soru05 {

	public static void main(String[] args) {
	/*	 5-----Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
		    Test Data:
		    Yarım elmas uzunluğu : 7
		    Beklenen Çıktı:
		          *
		         ***
		        *****
		       *******
		      *********
		     ***********
		    *************
		     ***********
		      *********
		       *******
		        *****
		         ***
		          *
		          *
		*/
		
		for (int i = 0; i < 7; i++) {

			for (int j = 7; j >i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <=i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i <7; i++) {
			for (int j =0; j <=i; j++) {
				System.out.print(" ");
			}for (int j = 7; j >i; j--) {
				System.out.print("*");
			}
			for (int j = 6; j >i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
