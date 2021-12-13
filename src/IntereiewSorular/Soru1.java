package IntereiewSorular;

import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {
		/* 
	      Check if the integer is an Armstrong numbers
	       Armstrong sayi:herhangi bir sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
	​
	         153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
	         370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
	*/

		Scanner scan=new Scanner(System.in);

		System.out.println("Armstrong olup olmadigini gormek icin bir sayi giriniz");
		
		String sayi=scan.next();
		String[] arr=sayi.split("");
		int arr1[]=new int[arr.length];
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = Integer.valueOf(arr[i]);
		}
		
		int kupler=0;
		
		for (int i = 0; i <arr1.length; i++) {
			kupler+=(arr1[i]*arr1[i]*arr1[i]);
			
		}
		System.out.println(kupler);
		int sayi1 = Integer.parseInt(sayi);
		if (sayi1==kupler) {
			System.out.println("Girdiginiz sayi Armstrong sayidir");
		}else {
			System.out.println("Girdiginiz sayi Armstrong sayidir degildir");
		}
		
		

	}

}
