package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C01_Calisma {

	public static void main(String[] args) {
	/*	1) Elemanlari A, C, E, ve F olan bir String ArrayList olusturup ekrana yazdiriniz.
	2) indexsiz add() methodunu kullanarak, B’yi ekleyiniz.
	index’li add() methodunu kullanarak, L’yi 1 numarali index’e ekleyiniz.
	ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, E, F, B.
	3) set() methodu kullanarak, E’yi D yapiniz.
	ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, F, B.
	4) remove() methodu kullanarak, F’yi siliniz.
	ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, B.
	5) sort() methodu kullanarak, elemanlari alfabetik siraya diziniz.
	ArrayList’i ekrana yazdiriniz, list goyle olmali; A, B, C, D, L.
	6) contains() methodu kullanarak, L’nin list’de var oldugunu ve M’nin list’de var
	olmadigini dogrulayiniz.
	7) size() methodu kullanarak, list’in kac eleman oldugunu ekrana yazdiriniz.
	8) clear() methodu kullanarak, list’deki tum elemanlari siliniz.
	9) isEmpty() methodu kullanarak, list’deki tum elemanlarin silindigini dogrulayiniz
	Sorular
*/
		List<String> lst=new ArrayList<>();
		
		lst.add("A");
		lst.add("C");
		lst.add("E");
		System.out.println(lst);
		lst.add("B");
		lst.add(1, "L");
		System.out.println(lst);
		lst.set(0, "T");
		System.out.println(lst);
		lst.remove("E");
		System.out.println(lst);
		Collections.sort(lst);
		System.out.println(lst);
		System.out.println(lst.contains("L"));
		System.out.println(lst.contains("R"));
		System.out.println(lst.size());
		lst.clear();
		System.out.println(lst);
		System.out.println(lst.isEmpty());
		
	}

}
