package exInsurance;

public class Insurance {
	private int insuranceCode;
	private int duration;
	private Customer customer;
	public static int idcodeCount=0;
	private static Insurance[] insuranceTable=new Insurance[10];
	
	
	public int getIdcodeCount() {
		return idcodeCount;
	}
	public int getInsuranceCode() {
		return insuranceCode;
	}
	public void setInsuranceCode(int insuranceCode) {
		this.insuranceCode = insuranceCode;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
		
	public String toString(){
		return insuranceCode +" "+ duration +" "+ customer;	
	}
	Insurance(int duration,Customer customer){
		this.insuranceCode=idcodeCount;
		this.duration=duration;
		this.customer=customer;
		insuranceTable[(idcodeCount)]=this;
		idcodeCount+=1;
		
	}
	public int insurance_cost(){
		int price = 100;
		return price;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public void storedInsuranses(){
		for(int i=0; i <insuranceTable.length;i++){
			System.out.println(insuranceTable[i].toString());
		}
	}
	public void searchInsurance(int insuranceCode){
		for(int i=0; i <insuranceTable.length;i++){
			if(insuranceCode==insuranceTable[i].getInsuranceCode()){
				System.out.println(insuranceTable[i].toString());
			}
		}
	}
	public static void printIns(){
		for(int i=0;i<idcodeCount;i++)
		System.out.println(insuranceTable[i].toString());
	}
}
