package Z_Kendidenemelerim;

import java.util.Scanner;

public class AtmAlinti {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 //DATA
		 String kull_adi = "Murat";
		 String sifre = "1234";
		 //*DATA
		//GiRiS BiLGiSi İNPUT
		 System.out.print("Kullanıcı Adı: ");
		 String kull = scan.nextLine();
		 System.out.print("Şifre: ");
		 String sif = scan.nextLine();
		//GiRiS BiLGiSi İNPUT
		 if(kull_adi.equals(kull) && (sifre.equals(sif))){
		  int bakiye = 1000;
		  System.out.println("Hoşgeldiniz | İşlem Seçiniz..");
		  System.out.println("1.Bakiye Sorugulama");
		  System.out.println("2.Para Çekme");
		  System.out.println("3.Para Yükleme");
		  System.out.println("4.Çıkış");
		  int islem = scan.nextInt();
		  
		  switch(islem){
		  case 1:
		   System.out.println(bakiye);
		  break;
		  
		  case 2:
		   System.out.println("Mevcut Bakiyeniz: " + bakiye + "TL'dir.");
		   System.out.println("Çekeceğiniz tutar:");
		   int tutar = scan.nextInt();
		   if(tutar>bakiye){
		    
		    System.out.println("Bakiye Yetersiz!");
		    
		   }
		   else{
		    System.out.println("Bu işlemden sonraki bakiyeniz: " + (bakiye-tutar) + "TL Olacaktır..");
		    System.out.println("İşlemi Onaylıyormusunuz?");
		    System.out.println("1.Onaylıyorum");
		    System.out.println("2.Onaylamıyorum");
		    int onay = scan.nextInt();
		    
		    switch(onay){
		     case 1: 
		    System.out.println("İşlem Gerçekleştirildi!");
		    System.out.println("Yeni Bakiyeniz: " + (bakiye-tutar) + "TL");
		     break;
		    
		     case 2:
		    System.out.println("İşlem Reddedildi!");
		     break;
		     default: 
		    System.out.println("Geçersiz İşlem!");
		    }
		   }
		  break;
		  
		  case 3:
		   System.out.println("Mevcut Bakiyeniz: " + bakiye + "TL'dir.");
		   System.out.println("Yatıracağınız tutar:");
		   tutar = scan.nextInt();
		   System.out.println("Bu işlemden sonraki bakiyeniz: " + (bakiye+tutar) + "TL Olacaktır..");
		   System.out.println("İşlemi Onaylıyormusunuz?");
		   System.out.println("1.Onaylıyorum");
		   System.out.println("2.Onaylamıyorum");
		   int onay2 = scan.nextInt();
		   switch(onay2){
		   case 1: System.out.println("İşlem Gerçekleştirildi!");
		  System.out.println("Yeni Bakiyeniz: " + (bakiye+tutar) + "TL");
		   break;
		   case 2: System.out.println("İşlem Reddedildi!");
		   break;
		   default: System.out.println("Geçersiz İşlem!");
		   break;
		   }
		  break;
		  
		  case 4:
		   System.out.println("Çıkış Yapıldı. | Tekrar Bekleriz");
		   break;
		   
		  default: System.out.println("Geçersiz işlem tekrar deneyiniz..");
		  break;
		 }
		 }
		 else{
		  System.out.println("Kullanıcı Adı veya Şifre Yanlış!");
		 }
		 }
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


