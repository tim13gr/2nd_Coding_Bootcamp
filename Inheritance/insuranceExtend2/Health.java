package insuranceExtend2;

public class Health extends Insurance {
	private int medExp;
	private static int countHealth = 0;
	private static int sumMedExp;

	public int getMedExp() {
		return medExp;
	}

	public static int getSumMedExp() {
		return sumMedExp;
	}

	public static void setSumMedExp(int sumMedExp) {
		Health.sumMedExp = sumMedExp;
	}

	public static int getCountHealth() {
		return countHealth;
	}

	public static void setCountHealth(int countHealth) {
		Health.countHealth = countHealth;
	}

	public void setMedExp(int medExp) {
		this.medExp = medExp;
	}

	public String toString() {
		return "Medical Expense:" + medExp + " " + super.toString();
	}

	Health(int duration, Customer customer, int medExp) {
		super(duration, customer);
		this.medExp = medExp;
		countHealth += 1;
		sumMedExp+=medExp;
	}

	public double costCalculation() {
		if (this.getCustomer().getSex().equals("male")) {
			return 80 + 7 * (2017 - this.getCustomer().getYearBirth()) + 50 + 2.5 / 100 * this.medExp;
		} else {
			return 80 + 7 * (2017 - this.getCustomer().getYearBirth()) + 2.5 / 100 * this.medExp;

		}
	}

}
