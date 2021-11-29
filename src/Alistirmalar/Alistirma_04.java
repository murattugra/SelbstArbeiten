package Alistirmalar;

public class Alistirma_04 {

	public static void main(String[] args) {
	/*	Soru 4:
			ThreeEvenOdd
			  threeEvenOrOdd  isminde int Array paramaetre alan bir metod yazınız. Bu metod kendisine
			  gönderilen Array de 3 tane çift veya 3 tane tek var ise true geri döndürsün. Yok ise
			  false göndersin.

			  Örnek:

			   intArray([2, 1, 3, 5]) sonuc  true olmalı
			   intArray([2, 1, 2, 5]) sonuc   false olmalı
			   intArray([2, 4, 2, 5]) sonuc   true olmalı */
		
		int arr[]= {2,3,4,5,6,7,9,11};
		
		System.out.println(threeEvenOrOdd(arr));
		
	}

	private static boolean threeEvenOrOdd(int[] arr) {
		int cift=0;
		int tek=0;
		boolean sonuc=false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0) {
				cift++;
			}else {
				tek++;
			}
			}
		if (cift==3 || tek==3) {
			sonuc=true;
		}
		
		return sonuc;
				
	}

}
