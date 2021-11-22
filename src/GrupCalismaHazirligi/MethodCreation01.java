package GrupCalismaHazirligi;

public class MethodCreation01 {

	public static void main(String[] args) {
	
// verilen iki sayinin toplamini ve carpimini yapip yazdiran iki ayri method olusturun
        
        // method olusturmak icin 4 adim takip edelim
        // 1. adim method call yazalim
        // 2. adim method'a arguman yazacak miyiz karar vermeliyiz
	    // 3. adim 1. ve 2. adimi yaptiktan sonra java'dan yardim alip method'u olustururuz
		// 4.adim erisim duzenleyici ve return type'a karar vermeliyiz
        //  erisim duzenleyici axcess modifier : public yaptik
        //  return type : bizden sadece yazdirma istedigi icin void kalabilir
	
		int sayi1=50;
		int sayi2=70;
		
		int sayi5=40;
		int sayi6=90;
		int sayi8=100;
		
		ahmet(sayi1,sayi2);
		
			

	}

	public static void ahmet(int sayi1, int sayi2) {
	
		System.out.println(sayi1+sayi2);
		
	}

}
