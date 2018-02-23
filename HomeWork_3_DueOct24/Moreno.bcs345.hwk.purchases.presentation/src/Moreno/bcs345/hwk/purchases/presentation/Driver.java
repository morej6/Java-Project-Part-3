package Moreno.bcs345.hwk.purchases.presentation;

/**
 * Calls a instance of CustomerPurchaseConsoleUI to show menu
 * 
 * @author Juan Moreno
 * @version 1.1
 * @since 10/23/16
 */
public class Driver {

	/**
	 * Main is where the code is run.
	 * @param args contains the command-line arguments
	 */
	public static void main(String[] args) {
		//Declaring an instance of CustomerPurchaseConsoleUI
		CustomerPurchaseConsoleUI a = new CustomerPurchaseConsoleUI();
		a.ShowUI();	//Calling ShowUI which contains menu
	}

}
