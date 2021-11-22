package ForLoopCalismalar;

public class Calisma_03 {

	public static void main(String[] args) {
		/*
        
        *
       * * 
      * * * 
     * * * * 
    * * * * * 
   * * * * * * 
    * * * * * 
     * * * * 
      * * * 
       * * 
        * 
  
  */

		for (int satir = 6; satir >= 1; satir--) {

			for (int bosluk = 1; bosluk <= satir; bosluk++) {
				System.out.print(" ");
			}

			for (int sutun = satir; sutun <= 6; sutun++) {
				System.out.print("*" + " ");

			}
			System.out.println("");

		}
		for (int satir = 1; satir <= 6; satir++) {

			for (int bosluk = 0; bosluk <= satir; bosluk++) {
				System.out.print(" ");

			}
			for (int sutun = 5; sutun >= satir; sutun--) {
				System.out.print("*" + " ");

			}
			System.out.println("");

		}

	}

}
