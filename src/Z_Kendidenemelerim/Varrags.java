package Z_Kendidenemelerim;

public class Varrags {

	public static void main(String[] args) {
	//  verilen Stringleri birlestiren concat isimli bir method olusturunuz
			// input : "m", "e", "r", "v", "e";
			// output : merve

			concat("m", "e", "r", "v", "e");
					
			
			
				
		}

		private static void concat(String... string) {
			String topla="";
			
			for (String i : string) {
				topla+=i;
				
			}
			System.out.println(topla);
		}

	

	}


