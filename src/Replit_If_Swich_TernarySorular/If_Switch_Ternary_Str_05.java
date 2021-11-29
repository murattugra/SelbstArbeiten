package Replit_If_Swich_TernarySorular;

import java.util.Scanner;

public class If_Switch_Ternary_Str_05 {

	public static void main(String[] args) {
	/*	Kullanıcıdan bir isim yazmasını isteyin, 
	 * adın uzunluğu 3 olmalıdır. Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.
		Eger aynı karakterlere sahipse
		"isim ayni karakterlere sahiptir." yazdirin.
		Eger ayni kaakterlere sahip degilse
		"Dizenin benzersiz karakterleri var" yazdirin.
		Ternary kullanin.
		*/
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir uc harfden olusan bir isim yazin");
		String isim=scan.nextLine();
		
		System.out.println(isim.charAt(0)==isim.charAt(1)||isim.charAt(0)==isim.charAt(2)||isim.charAt(1)==isim.charAt(2)
							? "isim ayni karakterlere sahiptir." : "Dizenin benzersiz karakterleri var");
		
		
		
		
		
		
		
		
	}

}
