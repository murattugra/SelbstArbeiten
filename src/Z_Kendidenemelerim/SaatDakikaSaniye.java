package Z_Kendidenemelerim;

import java.util.Scanner;

public class SaatDakikaSaniye {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Saniyeye cevirmek istediginiz saati yaziniz");		
		
		int saat=scan.nextInt();
		
		
		
		int dakika=60;
		
		int saniye=1;
		
		
		System.out.println(saat +" Saat "+(saat*3600)+" saniyeye esitir");
		
		

}
}