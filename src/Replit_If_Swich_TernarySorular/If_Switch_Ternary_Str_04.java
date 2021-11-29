package Replit_If_Swich_TernarySorular;

import java.util.Scanner;

public class If_Switch_Ternary_Str_04 {

	public static void main(String[] args) {
	/*	Char değişken yanıtının değerini test eden ve aşağıdaki işlemleri gerçekleştiren bir switch ifadesi yazın:
		yanıt a ise,
		"Talebiniz işleniyor" mesajı yazdırılır
		yanıt b ise,
		"yine de ilgilendiğiniz için teşekkür ederiz" mesajı yazdırılır yanıt c ise,
		"Üzgünüz, şu anda herhangi bir yardım yok" mesajı yazdırılır
		başka herhangi bir yanıt değeri için,
		"Geçersiz giriş, lütfen tekrar deneyin!" yazdırılır
			*/
		 
		boolean kontrol=true;
		while(kontrol) {
			
			Scanner scan=new Scanner(System.in);
			System.out.println("Lutfen a , b yada c giriniz");
			char harf=scan.next().charAt(0);
			
			switch(harf) {
			
			case 'a':
				System.out.println("Talebiniz işleniyor");
				kontrol=false;
			break;
			case 'b':
				System.out.println("Talebiniz işleniyor");
				kontrol=false;
			break;
			case 'c':
				System.out.println("Talebiniz işleniyor");
				kontrol=false;
			break;
			default:
			
			
			}
		
		}

	    }
	}