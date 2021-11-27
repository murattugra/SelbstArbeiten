package ReplitArrayList;

import java.util.Scanner;

public class List_08 {

	public static void main(String[] args) {
		/*Cümleyi parametre olarak kabul eden, 
		 * StringBuilder kullanarak cümleyi tersine çeviren ve 
		 * cümlenin palindrom olup olmadığını (büyük/küçük harf duyarlılığı olmadan) 
		 * kontrol eden bir Java programı yazın. StringBuilder kullanın.
		 

		Giriş :

		Java'yı seviyorum.

		Çıktı:

		Ters çevrilmiş cümle: avaJ evol I. Bu bir palindrom değil"
		
	*/

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Bir cumle girirniz");
		
		String cumle=scan.nextLine();
		
		String ters="";
		
		for (int i = cumle.length()-1; i >=0; i--) {
			ters+=cumle.substring(i, i+1);
		}
		if (cumle.equalsIgnoreCase(ters)) {
			System.out.println("Girdiginiz cumle Palidromdur" );
		} else {
			System.out.println("Girdiginiz cumle palidrom degildir" );
		}
	
		scan.close();
		
	}

}
