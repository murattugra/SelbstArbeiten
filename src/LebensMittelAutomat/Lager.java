package LebensMittelAutomat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lager {
	
List<String>no=new ArrayList(Arrays.asList("0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"));
List<String> urunler=new ArrayList(Arrays.asList("Negro","Tutku","Biskrem","Krovasan","Cizi","Albeni","Burcak",
		 									"Kraker","Sakiz","Kola","Fanta","Soda","IceTee","MeyveSuyu","Su"));
	
List<Double>fiyatlar=new ArrayList(Arrays.asList(1.20,1.40,1.60,1.0,0.90,0.80,1.50,0.50,
													0.50,1.20,1.20,1.00,1.10,0.90,0.50));

public List<String> getUrunler() {
	return urunler;
}

public List<Double> getFiyatlar() {
	return fiyatlar;
}	
	
	
	protected static void urunList() {
	Lager obj=new Lager();
	System.out.println("***********H O S G E L D I N I Z***********");
	System.out.println("**********U R U N  L I S T E M I Z**********");
	System.out.println();
	System.out.println("NO\tURUN LISTESI\tURUN LISTESI");
	System.out.println("==\t============\t============");
	for (int i = 0; i < obj.getUrunler().size(); i++) {
		System.out.println(obj.no.get(i)+"\t"+obj.getUrunler().get(i)+"\t"+"\t"+obj.getFiyatlar().get(i)+" TL");
	
	}
	System.out.println();
}

	public List<String> getNo() {
		return no;
	}
	
	
}
