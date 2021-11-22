package Z_Kendidenemelerim;

import java.util.Scanner;

public class BasitDeneme {

	public static void main(String[] args) {
		/*SORU 5

		Kullaniciya gunde kac saat uyudugunu sorun, ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin

		Ornek :
						Input 	: 8
						Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
		 */

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Gunde kac saat uyuyorsunuz?");
		
		int saat=scan.nextInt();
		
		System.out.println("Ayda uyudugun gun sayisi : " +((saat*30)/24));
		System.out.println("Yilda uyudugun gun sayisi : " +((saat*365)/24));
		System.out.println("40 Yilda uyudugun gun sayisi : " +((saat*14600)/24));
		scan.close();
		
		
	}

}
