package ReplitSorulari;

public class For_while_3_TR {

	public static void main(String[] args) {
		/*Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)

		Input :

		String str=“Javaisalsoeasy”

		Output: a s
*/
		
		String metin = "Javaisalsoeasy";
		char karakter = 'a';
		char karakter1 = 's';
		       
		 
		for(int i = 0; i < metin.length(); i++) {
		if(karakter == metin.charAt(i)) {
		}
		}
		 
		System.out.print( karakter);
		        
		for(int i = 0; i < metin.length(); i++) {
		if(karakter1 == metin.charAt(i)) {
		}
		}
		 
		System.out.println( " "+ karakter1 );
		  }
		}