package Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C02 {

	public static void main(String[] args) {
		/*Soru 3 ) Verilen map’te istenen programlama dilini bilen kisileri list olarak 
		 * donduren bir method yaziniz.
 		
 		map{ 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
 		
 		Istenen dil  java
 		Sonuc  [Ali, Veli]		*/
		
		Map<Integer,String> map=new HashMap<>();
		map.put(101, "Ali,Can,java");
		map.put(102, "Veli,Yan,java");
		map.put(103, "Ali,Yan,C#");
		
		String istenenDil="java";
		
	
		
		
		
		System.out.println(bransDondur(map, istenenDil));
		
		
		
	}

	private static List<String> bransDondur(Map<Integer, String> map, String istenenDil) {
		
		List<String> istenenDilListi=new ArrayList<>();
		
		List<String> valueList=new ArrayList<>(map.values());
		
		String arr[]=new String[3];
		//	map{ Ali, Can, java,    Veli, Yan, java,    Ali, Yan, C#}
		for (String each : valueList) {
			arr=each.split(",");
			if (arr[2].equalsIgnoreCase(istenenDil)) {
				istenenDilListi.add(arr[0]);
			}
			
		}
		return istenenDilListi;
		
		
		
		
		
	}

	
		
		
		
		
		
	}


