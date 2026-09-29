package data;

import java.io.FileNotFoundException;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
		OrderDB db = new OrderDB ();
		db.loadOrders("oders.txt");
		db.showOrders();

		
	}

}
