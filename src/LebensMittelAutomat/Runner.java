package LebensMittelAutomat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner extends Lager{

 	List<String> sepetUrun=new ArrayList<>();
 	List<Double> sepetFiyat=new ArrayList<>();
 	
	public static void main(String[] args) {
		
		
	
			urunList();
			urunsecme();
	
		
		
		
	}

	private static void urunsecme() {
		int secim;
		Runner obj=new Runner();
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen almak istediginiz urunun numarasini giriniz");
		secim=scan.nextInt();
		obj.sepetUrun.add(obj.urunler.get(secim));
		obj.sepetFiyat.add(obj.fiyatlar.get(secim));
	
	}

	

}
