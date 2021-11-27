package ReplitArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List_09 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan girdi olarak bir Dize almak için bir Java programı yazın ve bu
		 * dizede oluşan maksimum karakteri bulun. (Büyük/küçük harf duyarlılığını
		 * yoksay)
		 * 		 * giriş:
		 * 		 * Java öğrenmek kolaydır
		 *		 * çıktı:
		 *		 * oluşan maksimum karakter: a
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Cumle giriniz");

		String cumle = scan.nextLine();

		String arr[]=cumle.split("");
		
		
		String encok="";
		
		int sayac=0;
		int max=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 1; j < arr.length; j++) {
				
				if (arr[i].equals(arr[j])) {
					
					sayac++;
				}
				if (max<sayac) {
					max=sayac;
					encok=arr[i]+" "+sayac;
				
				}
			}
		sayac=0;
		}
		System.out.println(encok);
		
		scan.close();

}
}