package insuranceExtend1;

public class Health extends Insurance{
	private int medExp;
	private static int countHealth=1;
	public int getMedExp() {
		return medExp;
	}

	public void setMedExp(int medExp) {
		this.medExp = medExp;
	}
	public String toString(){
		return "Medical Expense:"+medExp+" "+super.toString();
	}

	Health(int duration, Customer customer, int medExp) {
		super(duration, customer);
		this.medExp=medExp;
		countHealth+=1;
			}
	
	public double costCalculation(){
		if (this.getCustomer().getSex().equals("male")){ 
			return /*super.insurance_cost()*/80+7*(2017-this.getCustomer().getYearBirth())+50+2.5/100*this.medExp;			
			}else {
				return /*super.insurance_cost()*/80+7*(2017-this.getCustomer().getYearBirth())+2.5/100*this.medExp;			

		}
	}
	/*public void printHealthTable() { 
		for (int i=0; i<=healthTable.length; i++) {       
			System.out.println(healthTable[i].toString());   
			}    
		}*/ 
}

