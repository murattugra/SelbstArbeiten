package Replit_If_Swich_TernarySorular;

import java.util.Scanner;

public class If_Switch_Ternary_Str_07 {

	public static void main(String[] args) {
	/*	Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın
		Kullanicidan alinan isim uzunluğu en az 2 olacaktır.
		INPUT : Mustafa
		OUTPUT : fafafa	
	*/	
		Scanner scan=new Scanner(System.in);
		System.out.println("isim giriniz");
		String isim=scan.next();
		
		System.out.println(isim.substring(isim.length()-2)+isim.substring(isim.length()-2)+isim.substring(isim.length()-2));
		
		
	}

}
