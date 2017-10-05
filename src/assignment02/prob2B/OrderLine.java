package assignment02.prob2B;

public class OrderLine {
	private Order order;

	protected OrderLine(Order order) {
		this.order = new Order(this);
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "OrderLine [order=" + order + "]";
	}
	
}
