package Z_Kendidenemelerim;

import java.util.Scanner;

public class ArtikYilSorusu {

	public static void main(String[] args) {
	//  Kullanıcıdan artik yil olup olmadıgını kontrol etmek için yıl girmesini isteyin.
        // Kurallar :::
 //  4 ile bölünemeyen yillar artık yıl degildir
 //  4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır.
 //  4'ün katı olmasına rağmen 100 ile bölünebilen yıllardan sadece
 //       400'ün katı olan yıllar artık yıldır.
		
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir yil giriniz");
		
		int yil=scan.nextInt();
		
		if (yil%4==0) {// buradan itibaren sadece 4 e bolunebilen yillar alinir
			if (yil%100!=0) {//burada 4 e bolunup 100 bolunemeyen yillar alinir
				System.out.println("Artik yil");
			} else {
				if (yil%400==0) {// burada hem 4 e bolunup hemde 100 bolunebilen yillardan 400 kati olan yillar alinir
					System.out.println("Artik yil");
				} else {
					System.out.println("Artil yil degil");
				}
			}
			
			
		} else {
			System.out.println("Artik yil degildir");//4 e bolunameyen yillar artik yil degildir
		}
		
		
	}

}
