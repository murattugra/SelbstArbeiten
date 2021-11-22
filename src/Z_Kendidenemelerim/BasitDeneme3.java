package Z_Kendidenemelerim;

import java.util.Scanner;

public class BasitDeneme3 {

	public static void main(String[] args) {
		
		//SORU 3

		//Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin 
		//ve vucut kutle endeksini bulun. Sonucu tamsayi ve ondalikli sayi olarak yazdirin
			   
		//VKE= kilo/(boy*boy)   …….. Kilo : kilogram , Boy : metre olmalidir

		//Ornek :
		//				Input 	: 	boy :180  kilo : 80
			//			Output : 	Vucut kutle endeksiniz : 24
//											Vucut kutle endeksiniz : 24.691…

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Boyunuzu cm olarak giriniz \nKilonuzu kg olarak giriniz");
		double boy=scan.nextDouble();
		double kilo=scan.nextDouble();
		double VKE=kilo/(boy/100*boy/100);
		int VKE2=(int)VKE;
		System.out.println("Vucut kutle endeksiniz :"+VKE2 );
		
		System.out.println("Vucut kutle endeksiniz :"+VKE );
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
