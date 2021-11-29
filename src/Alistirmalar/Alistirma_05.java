package Alistirmalar;

import java.util.Arrays;

public class Alistirma_05 {

	public static void main(String[] args) {
		 /*Soru 5:
        UpdateRange
           URange isminde bir metod yazınız,
           Bu metod parametre olarak int Array ve 2 adet int almalı.
           Metod kendisine gönderilen Array ın içindeki elemanlardan, yine kendisine gönderilen
           rakamlar arasında olanlarına -1 değerini atasın.oluşan yeni diziyi göndersin.main de yazdırınız.
           Örnek:
            int array = 1,6,12,15,22,18,30,16
            int 1 = 10
            int 2 = 20
            sonuc  1,6,-1,-1,22,-1,30,-1  olmalı.
        */
              int arr1 [] = {1,5,9,14,15,2,17,21};
                int sayi =10;
                int sayi2 =20;
             
                System.out.println(Arrays.toString(uRange(arr1,sayi,sayi2)));
                
            }
            private static int[] uRange(int[] arr1, int a, int b) {
                int buyuk=0;
                int kucuk=0;
                
        if (a>b) {
            buyuk=a;
            kucuk=b;
        }else if(b>a) {
            buyuk=b;
            kucuk=a;
        }
                
                for (int i = 0; i < arr1.length; i++) {
                    
                    if (arr1[i]<buyuk && arr1[i]>kucuk) {
                        arr1[i]=-1;
                    }
                    
                }
            
                return arr1;
            }
        }
