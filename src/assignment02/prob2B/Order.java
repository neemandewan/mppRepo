package assignment02.prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private int oderNum;
	private List<OrderLine> orderLines;
	
	public Order() {
		super();
		orderLines = new ArrayList<OrderLine>();
		orderLines.add(new OrderLine(this));
	}
	
	public Order(OrderLine ol) {
		orderLines = new ArrayList<OrderLine>();
		orderLines.add(new OrderLine(this));
	}
	
	public int getOderNum() {
		return oderNum;
	}
	public void setOderNum(int oderNum) {
		this.oderNum = oderNum;
	}
	public List<OrderLine> getOrderLines() {
		return orderLines;
	}
	public void setOrderLines(List<OrderLine> orderLines) {
		this.orderLines = orderLines;
	}
	
	@Override
	public String toString() {
		return "Order [oderNum=" + oderNum + ", orderLines=" + orderLines + "]";
	}
	
	
}
