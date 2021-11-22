package Z_Kendidenemelerim;

import java.util.Scanner;

public class SwitchCase_AyDenemesi {

	public static void main(String[] args) {
		
		// Girilen bir ay numarasina gore , 
		//ayin kac gun oldugunu sayi ile yazdiriniz

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir ay numarasi giriniz");
		
		int ay=scan.nextInt();
		
		
		switch(ay) {
		
		case 1:
			System.out.println("31 gun");
			break;
		case 2:
			System.out.println("28 gun");
			break;
		case 3:
			System.out.println("31 gun");
			break;
		case 4:
			System.out.println("30 gun");
			break;
		case 5:
			System.out.println("31 gun");
			break;
		case 6:
			System.out.println("30 gun");
			break;
		case 7:
			System.out.println("31 gun");
			break;
		case 8:
			System.out.println("31 gun");
			break;
		case 9:
			System.out.println("30 gun");
			break;
		case 10:
			System.out.println("31 gun");
			break;
		case 11:
			System.out.println("30 gun");
			break;
		case 12:
			System.out.println("31 gun");
			break;
		default:
			
			System.out.println("Lutfen dogru sayi giriniz");
		
		
		
		}
		

		
	}

}
