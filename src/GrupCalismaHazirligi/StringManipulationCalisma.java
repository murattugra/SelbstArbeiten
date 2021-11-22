package GrupCalismaHazirligi;

public class StringManipulationCalisma {

	public static void main(String[] args) {
			
		// String methodlarini kullanarak ” Java ogrenmek123 Cok guzel@ ”
		// “Java ogrenmek cok guzel” sekline getirin
		
		
		String str="    Java ogrenmek123 Cok guzel@       ";
		
	str=str.trim().replaceAll("\\d", "").replace("C", "c").replace("@", "");
	System.out.println(str);
	
	
	}

}
