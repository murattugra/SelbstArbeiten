package IntereiewSorular;

public class InterviewQuestions_13 {

	public static void main(String[] args) {
		/*
	     Write a Java Program to swap two numbers
	         
	     Swap (takas) islemini --> a=3, b=5 iken  a=5, b=3 degerlerini alması islemidir.
	     iki yoldan yaptiginiz java kodunu yaziniz.
	     1.Yol: 3. degisken kullanarak
	     2.Yol: 3. degisken kullanmadan
	*/
		
		//1. yol
		
		int a=5;
		int b=3;
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("a :"+a+","+" b :"+b);
		
		
		//2 . yol
		
		
		int d=5;
		int e=3;
		
		e=e-d;
		d=d+e;
		e=d-e;
		
		System.out.println("d :"+d+","+" e :"+e);
		
		
		/*	
		
	sayi1= sayi1-sayi2;

	sayi2=sayi1+sayi2;
	
	sayi1=sayi2-sayi1;*/
	}

}
