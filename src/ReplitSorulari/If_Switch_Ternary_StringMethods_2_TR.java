package ReplitSorulari;

import java.util.Scanner;

public class If_Switch_Ternary_StringMethods_2_TR {

	public static void main(String[] args) {
		/*Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.

Input :
John White
1234234534561478
Output : Name :J* W**
CCN : ** ** **** 1478
Ilk Harfler Buyuk harf ile baslamalidir.*/

		
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Kullanici adi giriniz");
		String isim=scan.nextLine();
		System.out.println("Soyisim giriniz");
		String soyisim=scan.nextLine();
		System.out.println("Kredi karti numarasi  giriniz");
		String kk=scan.nextLine();
		
		System.out.println("Name : "+isim.charAt(0)+isim.replaceAll(isim.substring(0),"* "+soyisim.charAt(0)+
				soyisim.replaceAll(soyisim.substring(0), "**")));
		System.out.println("CNN : ** ** **** "+kk.substring(kk.length()-4));
		
		scan.close();
		
	}

}
