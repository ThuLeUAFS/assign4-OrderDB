package data;

public class Order {
	
	private int orderID;
	private String product;
	private double totalAmt;
	
	public Order() {
		orderID = 0;
		product = "";
		totalAmt = 0.0;
		
	}
	public Order(int orderID, String product, double totalAmt) {
		this.orderID = orderID;
		this.product = product;
		this.totalAmt = totalAmt;
	}
	public int getOrderID() {
		return orderID;
	}
	public String getProduct() {
		return product;
	}
	public double getTotalAmt() {
		return totalAmt;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public void setTotalAmt(double totalAmt) {
		this.totalAmt = totalAmt;
	}

	
}



