package Z_Kendidenemelerim;

import java.util.Scanner;

public class BasitDeneme2 {

	public static void main(String[] args) {
		
		//SORU 2

		//Kullanicidan bir character girmesini isteyin ve girilen karakteri ve ascii degerini yazin

		//Ornek :
					//	Input 	: a
					//	Output : Girdiginiz ‘a’ karakterinin ascii degeri : 95
		 
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir karakter giriniz");
		
		char karakter=scan.next().charAt(0);
		int ascii = (int) karakter;
		System.out.println("Girdiginiz"+karakter+" karakterinin ascii degeri : " + ascii);
		
		scan.close();
		
		
		
		
		
		
	}

}
