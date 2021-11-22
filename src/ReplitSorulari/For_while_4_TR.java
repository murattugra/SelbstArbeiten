package ReplitSorulari;

import java.util.Scanner;

public class For_while_4_TR {

	public static void main(String[] args) {
		
		/*Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.

		Input : 6

		Output: 6!=65432*1=720
		*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("faktöriyel bulmak icin sayi giriniz");
			
		int sayi=scan.nextInt();
		int faktoriel=1;
		int baslangic=1;
		String fak="";
		while(baslangic<=sayi) {
			faktoriel*=baslangic;
			baslangic++;
			
		}
		for (int i = sayi; i >=2; i--) {
			fak+=i+"*";
		}
		System.out.println(sayi+"!:"+fak+"1=" +faktoriel);

	}

}
