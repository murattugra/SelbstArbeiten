package IntereiewSorular;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class InterviewQuestions_10 {

	public static void main(String[] args) {
		/*
        Create  a list by getting the list elements from user
        if there is duplicated elements remove them from the list.
​
        Kullanıcıdan aldıgınız elemanlardan oluşan bir listede tekrarlanan elemanları silen bir program create ediniz.
        */
		
		List<String> lst=new ArrayList<>();
		Scanner scan=new Scanner(System.in);
	
		String secim;
		do {
			
	
			System.out.println("Lutfen karakterler giriniz islemi bitirmek icin 'q' ya basiniz"  );
			secim=scan.next();
			lst.add(secim);
			lst.remove("q");
			lst.remove("Q");
		} while (!secim.equalsIgnoreCase("q"));
			System.out.println(lst);
			
			
			for (int i = 0; i < lst.size(); i++) {
				
				for (int j = i+1; j < lst.size(); j++) {
					if (lst.get(i).equals(lst.get(j))) {
						lst.remove(j);
						j--;
					}
				} 
			}
			
			System.out.println(lst);
			
			
			
		
	}

}
