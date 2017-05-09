package insuranceExtend2;

public class Life extends Insurance {
	private int custInvest;
	private static int countL = 0;
	private static int sumInvest;
	private static int sumAge;
	
	public static int getSumAge() {
		return sumAge;
	}
	public static int getSumInvest() {
		return sumInvest;
	}

	public static void setSumInvest(int sumInvest) {
		Life.sumInvest = sumInvest;
	}

	public static int getCountL() {
		return countL;
	}

	public static void setCountL(int countL) {
		Life.countL = countL;
	}

	public int getCustInvest() {
		return custInvest;
	}

	public void setCustInvest(int custInvest) {
		this.custInvest = custInvest;
	}

	public String toString() {
		return "Starting Investment:" + custInvest + " " + super.toString();
	}

	Life(int duration, Customer customer, int custInvest) {
		super(duration, customer);
		this.custInvest = custInvest;
		countL += 1;
		sumInvest+=custInvest;
		sumAge+=(2017 - this.getCustomer().getYearBirth());
		

	}

	public double costCalculation() {
		return 5 * (2017 - this.getCustomer().getYearBirth()) + 5 / 100 * this.custInvest;
	}

}
