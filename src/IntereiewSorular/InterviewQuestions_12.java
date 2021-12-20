package IntereiewSorular;

import java.util.Scanner;

public class InterviewQuestions_12 {

	public static void main(String[] args) {
		/*
		Crteate a program checks if a String is PALINDROME or not.
		If a word, phrase, or sequence that reads the same backword as forward then it is called "palindrome",
		For Example : "madam" or "nurses run" .


		Kuulanıcının girdiği bir  String'in PALINDROME olup olmadığını kontrol eden bir method create ediniz
		polindrome :Palindrom, tersten okunuşu da aynı olan cümle
		ornek : Ey edip Adana`da pide ye,  Traş niçin şart
		 */
		
		
		palidrom();
		
		
		
	}

	private static void palidrom() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Palidrom olup olmadigini ogrenmek icin cumle giriniz");
		String cumle=scan.nextLine().toLowerCase().replaceAll("\\s", "");
		StringBuilder ters=new StringBuilder(cumle);
		ters.reverse();
		System.out.println(ters);
		if (cumle.toString().equalsIgnoreCase(ters.toString())) {
			System.out.println("Girdiginiz cumle Plindrom'dur");
		}else {
			System.out.println("Girdiginin Palidrom degildir");
		}
		
	}

}
