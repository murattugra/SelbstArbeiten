package ArrayCalismlari02;

import java.util.Scanner;

public class Array05 {

	public static void main(String[] args) {

		//Soru 5) Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir cumle giriniz");
		
		String cumle=scan.nextLine();
		
		String ary[]=cumle.split(" ");
		
		System.out.println("Girdiginiz Cumle "+ary.length+" kelimeden olusur");
	}

}
