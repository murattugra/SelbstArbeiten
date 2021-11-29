package Replit_If_Swich_TernarySorular;

import java.util.Scanner;

public class If_Switch_Ternary_Str_02 {

	public static void main(String[] args) {
	/*	Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.
		Input :
		John White
		1234234534561478
		Output : Name :
		J* W**
		CCN : ** ** **** 1478
		Ilk Harfler Buyuk harf ile baslamalidir.
	*/	
		
Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen adinizi giriniz");
		String ad=scan.nextLine();
		ad=ad.toUpperCase();
		System.out.println("Lutfen soyadinizi giriniz");
		String soyad=scan.nextLine();
		soyad=soyad.toUpperCase();
		System.out.println("Lutfen sifrenizi giriniz");
		String sifre=scan.nextLine();
		System.out.println(ad.charAt(0)+"* "+soyad.charAt(0)+"**");
		System.out.println("CNN : "+"** **** **** "+sifre.substring(sifre.length()-4));
		
		
		
		
		
		
		
	}

}
