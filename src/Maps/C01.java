package Maps;

import java.util.HashMap;
import java.util.Map;

public class C01 {

	public static void main(String[] args) {
		// Verilen bir String’deki harfleri ve harflerin
		// kacar kez kullanildigini return eden bir method yaziniz
		// Ornek : Input : Hellooo output : H=1, e=1, l=2, o=3

		String input = "Hellooo";

		
		System.out.println(harfSay(input));
		
		
	
	}

	private static Map<String,Integer> harfSay(String input) {
	  Map<String,Integer> kackez=new HashMap<>();
	
	  String arr[]=input.split("");
	  
	  
	for (String each : arr) {
		if (!kackez.containsKey(each)) {
			kackez.put(each, 1);
		} else {
			kackez.put(each, kackez.get(each)+1);
		}
	}
	  
	  
	  
	  return kackez;
	  
		
	}
}
