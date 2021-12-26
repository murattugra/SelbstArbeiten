package Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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
	System.out.println(entry.containsAll(isimler));
		
	}

}
