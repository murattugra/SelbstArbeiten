package ReplitArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class List_05 {

	public static void main(String[] args) {
		/*Girdi olarak bir tamsayı kabul eden ve girdiden 
		 * büyük ilk 10 asal sayıyı ekrana yazdıran bir program yazınız.

		Giriş : 5

		Çıktı : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
		*/

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Baslangic sayisi giriniz:");
		
		ArrayAsal(scan.nextInt());

		scan.close();
	}
	
	
	public static String[] ArrayAsal(int sayi) {
		int sayac=0;
		
		boolean kontrol =true;
		String bos ="";
		
		for (int i = sayi + 1; i < Integer.MAX_VALUE; i++) {

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					kontrol = false;
					break;
				}

			}

			if (kontrol) {
				bos += i + " ";
				sayac++;
			}
			kontrol = true;
			if (sayac == 10) {
				break;
			}

		}
		
		String arr1[] = bos.split(" ");
		System.out.println(Arrays.toString(arr1));
		return arr1;
		
		
	}
	
	
	
}


