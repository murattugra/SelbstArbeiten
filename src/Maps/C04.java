package Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class C04 {

	public static void main(String[] args) {
		// Verilen bir String’deki harfleri ve harflerin
		// kacar kez kullanildigini return eden bir method yaziniz
		// Ornek : Input : Hellooo output : H=1, e=1, l=2, o=3
		
		
		Map<Integer,String> iller=new HashMap<>();

		iller.put(75,"Ardahan Kasar");
		iller.put(41,"Izmit pismaniye");
		iller.put(16, "Bursa iskender");
		
		Map<Integer,String> ilceler=new HashMap<>();
		
		ilceler.put(21,"Gole Cecil");
		ilceler.put(32,"Golcuk  canpismaniye");
		ilceler.put(43, "iznik kofte");
		
		
		System.out.println(iller);
		
		System.out.println(iller.get(75));
		
		System.out.println(iller.keySet());
		
		System.out.println(iller.values());
		
		List<String> valueList=new ArrayList<>(iller.values());
		
		System.out.println(valueList);
		
		for (String each : valueList) {
			System.out.println(each);
		}
		System.out.println(valueList.size());
		
		List<String> isimler= new ArrayList<>();
		
		String arr[]=new String[3];

		for (int i = 0; i < valueList.size(); i++) {
			arr=valueList.get(i).split(" ");
			isimler.add(arr[0]);
		}
		
		System.out.println(isimler);
		
		Map<Integer,Map<Integer,String>> ulke=new HashMap<>();
		
		ulke.put(01, ilceler);
		ulke.put(02, iller);
		
		
		System.out.println(ulke);

	
		Set<Entry<Integer, Map<Integer, String>>> entry=ulke.entrySet();
		
		int sayac=1;
	for (Entry<Integer, Map<Integer, String>> each : entry) {
		System.out.println(sayac+ ". entr : "+each.getKey()+each.getValue());
		sayac++;
	}
	
	//Verilen bir String’deki harfleri ve harflerin
	//kacar kez kullanildigini return eden bir method yaziniz
	//   Ornek : Input : Hellooo  output : H=1, e=1, l=2, o=3
	
	
	String input="Hellooo";
	
	String arr1[]=input.split("");//{H,e,l,l,o,o,o}
	
	Map<String,Integer> map1= new HashMap<>();
	
	for (String each : arr1) {
		if (!(map1.containsKey(each))) {
			map1.put(each, 1);
		}else {
			map1.put(each, map1.get(each)+1);
		}
	}
	System.out.println(map1);
	
	
	/*Soru 3 ) Verilen map’te istenen programlama dilini bilen kisileri list olarak 
	 * donduren bir method yaziniz.
		
		map{ 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
		
		Istenen dil  java
		Sonuc  [Ali, Veli]		*/
	
	Map<Integer,String> map2=new TreeMap<>();
	
	map2.put(101, "Ali, Can, java");
	map2.put(102, "Veli, Yan, java");
	map2.put(103, "Ali, Yan, C#");
	
	
	String istenilenDil="Java";
	
	List<String> lst2=new ArrayList<>(map2.values());
	List<String> ayniBranslar=new ArrayList<>();
	System.out.println(lst2);
	String arr3[]=new String[3];

	for (String each : lst2) {
		
		arr3=each.split(", ");
		
		if (arr3[2].equalsIgnoreCase(istenilenDil)) {
			ayniBranslar.add(arr3[0]);
		}
	}
	
	
	System.out.println(ayniBranslar);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
