package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		/*
	     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
	     1-1-2-3-5-8-13-21-34....
	     */

	    	Scanner scan=new Scanner (System.in);
	    	System.out.println("Bir sayi giriniz");
	    	int sayi=scan.nextInt();
	    	List<Integer> fibonacci=new ArrayList<>();
	    	fibonacci.add(1);
	    	fibonacci.add(1);
	    	int sayac=0;
	    	while(!(fibonacci.get(fibonacci.size()-1)>sayi)) {
	    		fibonacci.add(fibonacci.get(fibonacci.size()-1)+fibonacci.get(fibonacci.size()-2));
	    		sayac++;
	    	}
	    	fibonacci.remove(fibonacci.size()-1);
	    	System.out.println(fibonacci);
	    }
	}
