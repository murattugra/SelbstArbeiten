package IntereiewSorular;

import java.util.Iterator;
import java.util.Scanner;

public class InterviewQuestions_09 {

	public static void main(String[] args) {
		/*
		Ask user enter a positive number and check if it is prime or not

		Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Bir pozitif sayi giriniz");
		
		int sayi=scan.nextInt();
		boolean a=false;
		for (int i = 2; i < sayi; i++) {
			if (sayi%i==0) {
				a=true;
				break;
			}
		}
		if (a==true) {
			System.out.println("Asal sayi deil");
		}else {
			System.out.println("Asal sayi ");
		}
		
		
		
		
	}

}
