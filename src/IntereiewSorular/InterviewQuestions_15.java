package IntereiewSorular;

import java.util.Scanner;

public class InterviewQuestions_15 {

	public static void main(String[] args) {
		/*

		Ask user to enter the number of lines of a half pyramid.
		Type a program to create the half pyramid.
		For exampleif the number of lines is 5, the pyramid will be  like;
		*
		* *
		* * *
		* * * *
		* * * * *

		Kullanıcının  girdigi satır sayısı kadar yarım piramid sekli yazdıran bir program create ediniz.


		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen satir sayisi giriniz");
		int satir=scan.nextInt();
		
		
		for (int i = 0; i <= satir; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
	}

}
