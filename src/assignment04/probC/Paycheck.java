package assignment04.probC;

public final class Paycheck {
	private float grossPay;
	private final float FICA = 0.23f;
	private final float STATE = 0.05f;
	private final float LOCAL = 0.01f;
	private final float MEDICARE = 0.03f;
	private final float SOCIALSECURITY = 0.075f;

	protected Paycheck(float grossPay) {
		super();
		this.grossPay = grossPay;
	}
	
	public float getGrossPay() {
		return grossPay;
	}

	public void print() {
		System.out.println("Paycheck [getGrossPay()="+ getGrossPay() +", getNetPay()=" + getNetPay() + "]");
	}
	
	public float getNetPay() {
		return grossPay-(FICA*grossPay + STATE*grossPay + LOCAL*grossPay + MEDICARE*grossPay + SOCIALSECURITY*grossPay);
	}

}
