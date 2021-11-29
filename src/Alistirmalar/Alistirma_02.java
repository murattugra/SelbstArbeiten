package Alistirmalar;

public class Alistirma_02 {

	public static void main(String[] args) {
		/*
		 * Soru 2: getPopulation: main de aşağıdaki isimlerle Array leri
		 * tanımlayınız.Verilen örnek değerleri kullanabilirsiniz. countryNames Ülke
		 * isimleri countryPopulations Ülke nüfusları populationOfCountry adında bir
		 * metod yaznız. Bu method 1 String array(countryNames) , 1 int array
		 * (countryPopulations) ve 1 String (ulkeAdi) alacak Eğer Ülke adı countryNames
		 * de var ise, aynı sıradaki ülke nüfusunu diğer Array den bulup geri göndersin.
		 * Ornegin; countryNames = {"USA" ,"Mexico" ,"Canada"} countryPopulations =
		 * {100000 , 120000 , 130000} str = "Mexico" return 120000 olmali NOT : eger
		 * (ulkeAdi) icin verilen ulke countryNames icinde yoksa return -1 olmali
		 */

		String countryNames[] = { "USA", "Mexico", "Canada" };
		int countryPopulations[] = { 100000, 120000, 130000 };
		String str = "Mexico";
		nufus(countryNames, countryPopulations, str);
		System.out.println(nufus(countryNames, countryPopulations, str));

	}

	public static int nufus(String[] countryNames, int[] countryPopulations, String str) {
		int donus = 0;
		for (int i = 0; i < countryNames.length; i++) {
			if (countryNames[i].equals(str)) {
				donus = countryPopulations[i];
				break;
			} else {
				donus = -1;
			}

		}
		return donus;

	}

}
