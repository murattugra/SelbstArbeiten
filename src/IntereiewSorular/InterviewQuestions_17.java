package IntereiewSorular;

import java.util.Scanner;

public class InterviewQuestions_17 {

	public static void main(String[] args) {
		/*
		  Ask user to enter the number of lines of a inverted half pyramid .
		  Type a program to create the inverted half pyramid.
		  For example if the number of lines is 5, the pyramid will be like;

		  * * * * *
		  * * * *
		  * * *
		  * *
		  *

		  Kullanıcının  girdigi satır sayısı kadar * ile ters yarım piramid sekli yazdıran bir program create ediniz.

		  */
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		
		for (int i = 0; i < sayi; i++) {
			for (int j = sayi; j > i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
