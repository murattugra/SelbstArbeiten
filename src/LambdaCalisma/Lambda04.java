package LambdaCalisma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda04 {

	public static void main(String[] args) {
	
		 	TechPro trGunduz = new TechPro("yaz", "TR gunduz", 97, 124);
	        TechPro engGunduz = new TechPro("kis", "ENG gunduz", 95, 131);
	        TechPro trGece = new TechPro("bahar", "TR gece", 98, 143);
	        TechPro engGece = new TechPro("sonbahar", "ENG gece", 93, 151);

	        List<TechPro> list = new ArrayList<>(Arrays.asList(trGunduz, engGunduz, trGece, engGece));

		
	        System.out.println(ortDoksanIkiBuyuk(list));
	        System.out.println(ogrYuzOnAz(list));
	        
		  //task 03-->batch'lerde herhangi birinde "bahar" olup olmadigini  kontrol eden pr create ediniz.
		
		//task 04-->batch'leri ogr sayilarina gore b->k siralayiniz.
		
		
		//task 05-->batch'leri batch ort gore  b->k siralayip ilk3 'unu yazdiriniz.
		
	    //task 06--> ogrc sayisi en az olan 2. batch'i  yazdiriniz.
		
		 //task 07--> batch ort 95 'den buyuk olan batch'lerin ogrc sayilarini toplamini yazdiriniz
		
		//task 08--> Ogrenci sayisi 130'dan buyuk olan Batch'lerin batchOrt'larinin ortalamasini bulunuz.
		
		
	}

	//task 01--> batch ort'larinin 92 den buyuk oldg kontrol eden pr create ediniz.
	
	
	public static boolean ortDoksanIkiBuyuk(List<TechPro> list ) {
		
		return list.stream().allMatch(t->t.getBatchOrt()>92);
	
		
	}
	
	
	//task 02-->ogrc sayilarinin   110 den az olmadigini  kontrol eden pr create ediniz.
	
	
	public static boolean ogrYuzOnAz(List<TechPro> list ) {
		
		return list.stream().allMatch(t->t.getOgrcSayisi()>=110);
		
		
		
		
		
	}
	
	
	
	
	
	
}
