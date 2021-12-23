package Z_Kendidenemelerim;

import java.util.HashMap;
import java.util.Map;

public class MapCalisma {

	public static void main(String[] args) {
		
		
		Map<Integer,String> MarmaraIller=new HashMap<>();
		MarmaraIller.put(34,"Istanbul");
		MarmaraIller.put(41,"Kocaeli");
		MarmaraIller.put(18,"Canakkale");
		MarmaraIller.put(16,"Bursa");
		
		Map<Integer,String> EgeIller=new HashMap<>();
		MarmaraIller.put(35,"Izmir");
		MarmaraIller.put(45,"Manisa");
		MarmaraIller.put(9,"Aydin");
		MarmaraIller.put(48,"Mugla");

		
		Map<Integer,String> IcAnadoluIller=new HashMap<>();
		MarmaraIller.put(26,"Eskisehir");
		MarmaraIller.put(6,"Ankara");
		MarmaraIller.put(42,"Konya");
		MarmaraIller.put(38,"KAyseri");

		Map<Integer,String> KaradenizIller=new HashMap<>();
		MarmaraIller.put(55,"Samsun");
		MarmaraIller.put(61,"Trabzon");
		MarmaraIller.put(57,"Sinop");
		MarmaraIller.put(37,"Kastamonu");

		
		Map<Integer,String> AkdenizdenizIller=new HashMap<>();
		MarmaraIller.put(7,"Antalya");
		MarmaraIller.put(33,"Mersin");
		MarmaraIller.put(1,"Adana");
		MarmaraIller.put(31,"Hatay");

		Map<Integer,String> DoguAnadoluIller=new HashMap<>();
		MarmaraIller.put(75,"Ardahan");
		MarmaraIller.put(25,"Erzurum");
		MarmaraIller.put(35,"Kars");
		MarmaraIller.put(4,"Agri");
		
		
		Map<Integer,String> GuneyDoguAnadoluIller=new HashMap<>();
		MarmaraIller.put(21,"Diyarbakir");
		MarmaraIller.put(47,"Mardin");
		MarmaraIller.put(63,"SanliUrfa");
		MarmaraIller.put(73,"Sirnak");
		
		
		
		Map<String,Map> bolgeler=new HashMap<>();
		
		bolgeler.put("Marmara", MarmaraIller);
		bolgeler.put("Ege", EgeIller);
		bolgeler.put("IcAnadolu", IcAnadoluIller);
		bolgeler.put("Akdeniz", AkdenizdenizIller);
		bolgeler.put("DoguAnadolu", DoguAnadoluIller);
		bolgeler.put("GuneyAnadolu", GuneyDoguAnadoluIller);
		
		Map<String,Map> turkiye=new HashMap<>();
		
		turkiye.put("turkiye", bolgeler);
		
		System.out.println(turkiye.keySet());
		
		
		
	}

}
