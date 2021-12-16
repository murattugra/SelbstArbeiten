package IntereiewSorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Soru04 {

	public static void main(String[] args) {
		   /*
	     Create method that finds repeated characters in a String
	     Bir String'de tekrarlanan karakterleri bulan method create ediniz
	          */
		String str1 = "Yinelenen karakterler";
        List<String> tekrarEden = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            for (int j = i + 1; j < str1.length(); j++) {
                if (str1.charAt(i) == str1.charAt(j) && !tekrarEden.contains(str1.substring(i, i + 1))) {
                    tekrarEden.add(str1.substring(i, i + 1));
                }
            }
        }
        System.out.println(tekrarEden);
    }
}