package Alistirmalar;

public class Alistirma_03 {

	public static void main(String[] args) {
	/*	Soru 3:
			SubtractionSquare:
			   getSumOfSquares adında bir sayı alan ve bu sayıya kadar olan sayıları 
			   toplayıp çıkan sonucun karesini döndüren bir metod yazınız.
			  substSquare isminde 2 adet int parametre alan ve int sonuç döndüren bir metod daha yazınız.
			   main den   substSquare   metoduna 2 tane sayı gönderiniz, bu metodun içinden de 
			   getSumOfSquares metodunu çağırarak gönderilen bu iki sayı için işlem sonuçlarını toplayarak
			   main metodundan yazdırınız.
			Örnek:
			    int 1 = 10;              yazacağınız method 10 u kullanarak 3025 sonucu verir
			    int 2 = 5;                yazacağınız method 5 i kullanarak 225 sonucu verir
			    3025 + 225 = 3250
			    return 3250
*/
		
		System.out.println(substSquare(10,5));
	}
	private static int substSquare(int i, int j) {
		int sonuc2 =getSumOfSquares(i)+getSumOfSquares(j);
		
		return sonuc2;
		
	}

	public static int getSumOfSquares(int i) {
		int toplam=0;
		for (int j = 0; j <=i; j++) {
			toplam+=j;
			
		}
			int sonuc=toplam*toplam;
		
		return sonuc;
		
	}

}
