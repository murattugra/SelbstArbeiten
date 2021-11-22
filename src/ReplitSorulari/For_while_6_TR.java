package ReplitSorulari;

public class For_while_6_TR {

	public static void main(String[] args) {
		/*Konsolda Alfabeyi Yazdıran programi yaziniz.

		OUTPUT :

		a b c .. .. .. .. y z
		*/
		
		char bas='a';
		char bit='z';
		String alfabe="";
		
		while(bas<=bit) {
			alfabe+=bas+" ";
			bas++;
		}
		
		System.out.println("Alfabe : "+alfabe);
	}

}
