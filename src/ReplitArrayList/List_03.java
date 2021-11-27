package ReplitArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class List_03 {
	public static void main(String[] args) {
	/*	Kullanıcıdan bir cümle alın. Kullanıcıdan alınan cümleyi parametre olarak kabul edin,
	 *  Array kullanarak cümleyi ters çevirin ve sonucu ana metoda String olarak döndüren bir Method yazın.

		Not: Büyük ve küçük harfler, boşluklar ve özel karakterler değiştirilmeyecektir.

		Giriş :

		Kod yazmak çok güzel.

		Çıktı :

		.edoc etirw ot ecin yrev si tI
		*/
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Cumle giriniz");

		String cumle=scan.nextLine();
		
		String arr[]=cumle.split("");
		
		
		
		int sayac=0;
		String ters="";
		for (int i = arr.length-1; i >=0; i--) {
			
			ters+=arr[i];
	
		}
			System.out.println(ters);
			}

}
