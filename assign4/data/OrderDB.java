package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class OrderDB {
	
	private Order[] orders = new Order[50];
	private int count = 0;
	
	
	public void loadOrders(String fileName) throws FileNotFoundException {
		Scanner input = new Scanner (new File(fileName));
		if (input.hasNextLine()) {
			input.nextLine();
		}
		
		while (input.hasNextLine() && count < orders.length) {
			String line = input.nextLine();
			String[] parts = line.split(",");
			int orderID = Integer.parseInt(parts[0]);
			String product = parts[1];
			double totalAmt = Double.parseDouble(parts[2]);
			orders[count] = new Order(orderID, product, totalAmt);
			count ++;
		}
		
		input.close();

		
	}
	
	public void showOrders() {
		
		System.out.printf("%-10s %-20s %10s%n", "Order ID", "Product", "Total" );
		
		for (int i =0; i < count; i++) {
			System.out.printf("%-10d %-20s $%9.2f%n", orders[i].getOrderID(), orders[i].getProduct(), orders[i].getTotalAmt());
		}

		
	}
}
