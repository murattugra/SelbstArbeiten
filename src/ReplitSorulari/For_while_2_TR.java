package ReplitSorulari;

import java.util.Scanner;

public class For_while_2_TR {

	public static void main(String[] args) {
		/*
         * Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve
         * LCM'yi (En Küçük Ortak Kat) bulmasını isteyin. Input : 30 40 Beklenen Cikti:
         * copied! Beklenen Cikti:
         * 
         * 30 ve 40 icin GCD = 10 30 ve 40 icin LCM = 120
         */
       Scanner scan=new Scanner(System.in);
	   System.out.println("Ebob ve Ekokunu bulmak icin iki tam sayi girininz");
		
		int sayi1=scan.nextInt();
        int sayi2 =scan.nextInt();
        int sayac = 1;
        int ebob = 0;
        int ekok = 1;
        int sayac2=1;
        while (sayac <= sayi1) { // 1 , 2 , 5, 10 ebob =10
            if (sayi1 % sayac == 0 && sayi2 % sayac == 0) {
                ebob = sayac;}
            
            sayac++; }
        System.out.println("ebob :"+ebob);
        
        System.out.println();
        
        while (sayac2 <= sayi1*sayi2) {  
            if (sayac2%sayi1==0 && sayac2%sayi2==0) {  
            	
                ekok=sayac2;
                break;
                }
                 sayac2++;
                             }
        
        System.out.println("ekok :"+ekok);
        
}
}