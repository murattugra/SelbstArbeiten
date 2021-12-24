package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class C03 {

	public static void main(String[] args) {
		
		
		Map<Integer,String> map=new HashMap<>();
		map.put(101, "Ali,Can,java");
		map.put(102, "Veli,Yan,java");
		map.put(103, "Ali,Yan,C#");
		
		
		Set<Entry<Integer,String>> entry1=map.entrySet();
		
	for (Entry<Integer, String> entry : entry1) {
		System.out.println(entry);
	}
		
	
	
	
	System.out.println(map.getOrDefault(110, "girilen key yok"));
	
	
	
		
		
	}

}
