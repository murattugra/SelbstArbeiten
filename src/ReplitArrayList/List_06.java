package ReplitArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_06 {

	public static void main(String[] args) {
	/*	İki String Dizisi arasındaki ortak öğeleri
	 *  bulan bir program yazın (büyük/küçük harf duyarlılığı olmadan)

		Girdi1 : {John,Brad,Ange,Sofia,Emily}

		Girdi2 : {sofya,brad,zarafet,emily,hazel}

		Çıktı: [sofya,brad,emily]
		*/

	String arr[]= {"John","Brad","Ange","Sofia","Emily"};
	String arr2[]= { "sofya","brad","zarafet","emily","hazel"};
	
	List<String> lst=new ArrayList<>();
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr2.length; j++) {
			if (arr[i].equalsIgnoreCase(arr2[j])) {
				lst.add(arr[i]);
			}
		}
	}

	System.out.println(lst);
	}

}
