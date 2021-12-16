package IntereiewSorular;

import java.util.Arrays;
import java.util.Scanner;

public class InterviewQuestions_11 {

	public static void main(String[] args) {
		/*
		 Create a function that takes an array and returns the difference between
		 and the smallest numbers.
		 Ask user to enter array elements.

		kullanıcının girdigi bir array'in en buyuk elemani ile 
		en kucuk elemanının  farkını bulan bir method create ediniz.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Kac elemanli bir array olusturacaksin");
		int eleman=scan.nextInt();
		
		int arr[]=new int[eleman];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Arrayin "+i+". elemaninin giriniz");
			arr[i]=scan.nextInt();
			
		}
		
		Arrays.sort(arr);
		
		System.out.println("Arrayin en buyuk eemani ile en kucuk elemaninin farki "
						+(arr[arr.length-1]-arr[0]));
						
	}

}
