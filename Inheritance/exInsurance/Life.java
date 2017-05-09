package exInsurance;

public class Life extends Insurance{
	private int custInvest;
	private static Life[] lifeTable=new Life[10];
	private static int countL=0;

	public int getCustInvest() {
		return custInvest;
	}

	public void setCustInvest(int custInvest) {
		this.custInvest = custInvest;
	}
	
	public String toString(){
		return custInvest+" "+super.toString();
	}
	Life(int duration, Customer customer,int custInvest){
		super (duration,customer);
		this.custInvest=custInvest;
		lifeTable[countL]=this;
		countL += 1;
			
	}
	public double costCalculation(){
		return super.insurance_cost()+5*this.getDuration()+5/100*this.custInvest;
	}
	public void printLifeTab() { 
		for (int i=0; i<=countL; i++) {       
			System.out.println(lifeTable[i].toString());    
			}    
		}
	}

