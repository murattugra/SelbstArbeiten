package IntereiewSorular;

import java.util.Scanner;

public class InterviewQuestions_08 {

	public static void main(String[] args) {
		/*
		Ask user to enter  2 Srtrings.
		If the characters and the numbers of characters of the Strings are same then print "Anagram"
		otherwise, print "Not Anagram" on the console.
		Ignore cases
		For example : "Mary" and "army" and "RAMY" are Anagrams

		Kullanıcıdan 2 String girmesini isteyin. String'lerin buyuk-kucuk harf duyarliligi olmadan
		karakterleri ve karakter sayıları aynıysa "Anagram" yazdırın,   aksi takdirde konsolda "Anagram Değil" yazdırın.
		Ornek : "Pide" ve"EDİP" anagram ifadelerdir..

		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen iki kelime giriniz");
		String kelime1=scan.nextLine();
		String kelime2=scan.nextLine();
		kelime1=kelime1.toLowerCase();
		kelime2=kelime2.toLowerCase();
		int index=kelime2.length()-1;
		boolean tespit=false;
		for (int i = 0; i <= kelime1.length()-1; i++) {
				if (kelime1.charAt(i)==kelime2.charAt(index)) {
					tespit=true;
					index--;
				}else {
					tespit=false;
					break;
				}
				
			
		}
		if (tespit==true) {
			System.out.println("Anagram");
		}else {
			System.out.println("Anagram degil");
		}
		
	}

}
