package Replit_If_Swich_TernarySorular;

import java.util.Scanner;

public class If_Switch_Ternary_Str_01 {

	public static void main(String[] args) {
	/*	Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazın (BMI)
		IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)
		BMI 18,5'in altındaysa zayıfsınız
		BMI 18,5 ile 25 arasında ise kilonuz idealdir
		BMI 25-30 arasındaysa şişmansınız
		BMI 30'dan büyük veya eşitse, obez
		Input:
		Output:
		Agirlik : 71
		Boy : 1,72
		BMI : 23.99945916711736
		Zayifsiniz.
	
		*/
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen Metre Cinsinden Boyunuzu Giriniz");
		double boy=scan.nextDouble();
		System.out.println("Lutfen kilonuzu giriniz");
		double kilo=scan.nextDouble();
		double BMI=kilo/(boy*boy);
		if (BMI>=30) {
			System.out.println(BMI+" Obez");
		} else if(BMI<30&&BMI>25){
			System.out.println(BMI+" Sismansiniz");
		}else if (BMI<=25 && BMI>=18.5) {
			System.out.println(BMI+" Kilonuz ideal");
		}else {
			System.out.println(BMI+" Zayifsiniz");
		}
		
		
		
	}

}
