package ReplitArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List_02 {

	public static void main(String[] args) {
	/*	10 elemanlı bir liste oluşturun. 8. öğeyi 3. öğeyle değiştirin.

		GİRİŞ : Dizgi[] isimler={"Ümit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

		Çıktı:

		[Ümit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]
		*/

		String arr[]= {"Ümit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
		
		List<String> lst=new ArrayList<>();
		
		for (String string : arr) {
			lst.add(string);
		}
		System.out.println(lst);
		
		String uc=lst.get(3);
		String sekiz=lst.get(8);
		lst.set(3, sekiz);
		lst.set(8, uc);
		
		System.out.println(lst);
		
		
		
		
		
	}

}
