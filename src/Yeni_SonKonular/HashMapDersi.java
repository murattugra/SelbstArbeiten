package Yeni_SonKonular;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class HashMapDersi {

	public static void main(String[] args) {
	
		
		
		HashMap<String, String> b =new HashMap<String, String>();
		
		b.put("Turkiye", " Ankara");
		b.put("Fransa", "Paris");
		b.put("Ingiltere","Londra");
		
		
		
		Set<?> s = b.entrySet();  
		
		HashMap<Integer, List> map= new HashMap<>();
		
		List<String> lst=new ArrayList<>();
		lst.add("Ali");
		lst.add("Veli");
		lst.add("Hasan");
		lst.add("Demet");
		
		map.put(101, lst);
		
		System.out.println(map);
		
		HashMap<Object, Object> map2= new HashMap<>();
		
		map2.putAll(b);
		System.out.println(map2);
	}

}
