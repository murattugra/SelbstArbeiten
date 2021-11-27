package foorEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FoorEachLoop {

	public static void main(String[] args) {
	
	     //Soru 1:
		//Bir integer array olusturunuz ve bu array’deki tum sayilarin carpimini For-each loop
		//kullanarak bulunuz. Sonucu ekrana yazdiriniz.	
		int arr[]= {3,5,7,9};
		int carpim=1;
		for (int i : arr) {
			carpim*=i;
		}
		
		System.out.println(carpim);
	//Soru 2:
	//	Bir integer list olusturunuz ve bu list’deki tum sayilarin karesinin toplamini For-each
	//	loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
		List<Integer> lst=new ArrayList<>();
		lst.add(2);
		lst.add(3);
		
		int toplam=0;
		
		for (Integer i : lst) {
			toplam+=i*i;
		}
		System.out.println(toplam);
		
		/*Soru 3:
			iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For-each loop
			kullanarak bulunuz. Sonucu ekrana yazdiriniz.
			Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz
		*/
		
		String arr3[]= {"Ali","Veli","Deli"};
		
		String[] arr4= {"Can","Veli","Murat"};
		int flag=0;
		Arrays.sort(arr3);
		Arrays.sort(arr4);
		for (String i : arr3) {
			for (String j : arr4) {
				if (i.equalsIgnoreCase(j)) {
					flag++;
				}
			}
		}
		if (flag>0) {
			System.out.println("Ortak eleman var");
		}else {
			System.out.println("Ortak eleman yok");
		}
		
		/*
		Soru 4:
		Bir String olusturunuz, bu String’deki character’leri for-each loop kullanarak
		yazdiriniz. ipucu: split()
		*/
		
		String str="Murat";
		String arr5[]=str.split("");
		
		for (String i : arr5) {
			System.out.print(i);
		}
		
		
		
	}

}
