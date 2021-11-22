package GrupCalismaHazirligi;

public class StringManipulation_2 {

	public static void main(String[] args) {
		
		/*Soru 2) String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
	String str1 = “$13.99”
	String str2 = “$10.55”
		ipucu : Double.parseDouble() methodunu kullanabilirsiniz.
		*/
		
		String str1 = "$13.99";
		String str2 = "$10.55";
		
	str1=str1.replace("$", "");
	str2=str2.replace("$", "");
		
	double toplam=Double.valueOf(str1)+Double.valueOf(str2);
	System.out.println(toplam);
		
		
		
		
		
		
		
	}

}
