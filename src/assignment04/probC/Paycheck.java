package assignment04.probC;

public final class Paycheck {
	private float grossPay;
	private float fica;
	private float state;
	private float local;
	private float medicare;
	private float socialSecurity;
	
	public Paycheck() {
		// TODO Auto-generated constructor stub
		this.fica = 23;
		this.state = 5;
		this.local = 1;
		this.medicare = 3;
		this.socialSecurity = 7.5f;
	}

	public float getGrossPay() {
		return grossPay;
	}



	public float getFica() {
		return fica;
	}



	public float getState() {
		return state;
	}



	public float getLocal() {
		return local;
	}



	public float getMedicare() {
		return medicare;
	}



	public float getSocialSecurity() {
		return socialSecurity;
	}

	public void print() {
		
	}
	
	public void getNetPay() {
		
	}
}
