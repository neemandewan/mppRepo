package assignment04.probC;

import java.time.LocalDate;

public class Order {
	private int orderNo;
	private LocalDate orderDate;
	private float orderAmount;
	
	protected Order(int orderNo, LocalDate orderDate, float orderAmount) {
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}
	
	public int getOrderNo() {
		return orderNo;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public float getOrderAmount() {
		return orderAmount;
	}
	
	
}
