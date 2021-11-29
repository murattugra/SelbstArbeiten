package Alistirmalar;

import java.util.Scanner;

public class Alistirma_01 {

	public static void main(String[] args) {
	/*	Soru 1:
			CamelCase : camelcase adında Kendisine gönderilen bir cümledeki kelimelerin ilk karakterlerini
			            büyük harfe çevirip geri döndüren metodun yazınız.

			            Örnek:  bugün hava çok güzel    Result : Bugün Hava Çok Güzel
		*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle=scan.nextLine();
	   
		camelcase(cumle);
		System.out.println(camelcase(cumle));
		scan.close();
	}
	public static String camelcase(String cumle) {
		String arr[]=cumle.split("[ ]+");	//["bugun"," hava" , "cok" , "guzel" ]
		String yeni="";
		for (String i : arr) {
			yeni+=i.substring(0, 1).toUpperCase()+i.substring(1).toLowerCase()+" ";	;	//Bugun Hava Cok Guzel
		}
		return yeni;
	
	}

}
