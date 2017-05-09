package exInsurance;

public class Health extends Insurance{
	private int medExp;
	private static Health[] healthTable=new Health[10];
	private static int countHealth=1;
	public int getMedExp() {
		return medExp;
	}

	public void setMedExp(int medExp) {
		this.medExp = medExp;
	}
	public String toString(){
		return medExp+" "+super.toString();
	}

	Health(int duration, Customer customer, int medExp) {
		super(duration, customer);
		this.medExp=medExp;
		healthTable[countHealth]=this;
		countHealth+=1;
			}
	public double costCalc(){
		if (this.getCustomer().getSex().equals("male")){ 
			return super.insurance_cost()+7*(2017-this.getCustomer().getYearBirth())+50+2.5/100*this.medExp;			
			}else {
				return super.insurance_cost()+7*(2017-this.getCustomer().getYearBirth())+2.5/100*this.medExp;			

		}
	}
	public void printHealthTable() { 
		for (int i=0; i<=healthTable.length; i++) {       
			System.out.println(healthTable[i].toString());    
			}    
		}
}

