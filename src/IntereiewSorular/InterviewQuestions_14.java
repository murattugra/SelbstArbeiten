package IntereiewSorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class InterviewQuestions_14 {

	public static void main(String[] args) {
		
		/*
		If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
		type a program to create a new array whose elements are like { 3, 5+1, 2+7+9, 2+3+5+7 }

		Verilen bir arayın elemanlarının ardışık artan toplamını hesaplayıp yeni bir array'a atayan bir program cretae ediniz..

		input : { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }

		output : { 3, 5+1, 2+7+9, 2+3+5+7 }

		   */
		
		
		 int arr1 [] ={ 3, 5, 1, 2, 7, 9, 2, 3, 5, 7}; // eleman sayisi dogru sekilde arttirilip azaltilsa da kodumuz dinamik olarak calisacak.
	        
	        int toplam=0;
	        int elemanSayisi = 1;
	        
	        List<Integer> altSinir = new ArrayList<>();
	        List<Integer> ustSinir = new ArrayList<>();
	        List<Integer> cozum = new ArrayList<>();
	        
	        for (int i = 0; i < 1000; i++) {         //verilen arrayin uzunlugundan kac elemanli sonuc cikacagini hesapladik.
	            if (i*(i+1)/2==arr1.length) {       //Orn.10 elemanli array icin 4 elemanli sonuc cikar, bu sayiyi for loop da da kullandik.
	                elemanSayisi=i;
	                break;
	            }
	            if (i>arr1.length) {
	                break;
	            }
	        }
	        int sayi =0;
	        int a=1;
	                            
	        do {                    // bu dongu icinde altSinir ve ustSinir nin elemanlarini urettik, altSinir=[0, 1, 3, 6]   ustSinir=[1, 3, 6, 10]
	                                // elemanlari arasindaki fark 1'er artarak artiyor. ve verilen arrayin uzunluguna gore olusacak sonucun uzunlugu kadar elemana sahip listler uretiyor.
	            altSinir.add(sayi); // buradaki listlerin elemanlarini inner for loop da alt ve ust sinirlari belirlemek icin kullandik.
	            sayi+=a;
	            a++;
	            ustSinir.add(sayi);
	        } while (a!=elemanSayisi+1);
	        
	        
	        for (int i = 0; i < elemanSayisi; i++) {             
	            for (int j = altSinir.get(i); j < ustSinir.get(i); j++) {        
	                toplam+=arr1[j];
	            }   
	            
	            cozum.add(toplam);
	            toplam=0;
	        }       
	        System.out.println(cozum);      
	        
	    }
	    
	    
	}