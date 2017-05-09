package insuranceExtend2;

public abstract class Insurance {
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
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
		
	public String toString(){
		return "Insurance Code:"+insuranceCode +" "+"Insurance Duration:"+ duration +" "+ customer;	
	}
	Insurance(int duration,Customer customer){
		this.insuranceCode=idcodeCount;
		this.duration=duration;
		this.customer=customer;
		insuranceTable[(idcodeCount)]=this;
		idcodeCount+=1;
				
	}
	Insurance(int duration){
		this.insuranceCode=idcodeCount;
		this.duration=duration;
		insuranceTable[(idcodeCount)]=this;
		idcodeCount+=1;
	}
	public int insurance_cost(){
		int price = 100;
		return price;
	}
	
	public static void storedInsuranses(){
		for(int i=0; i <idcodeCount;i++){
			System.out.println(insuranceTable[i].toString());
		}
	}
	public static void searchInsurance(int insuranceCode){
		for(int i=0; i <insuranceTable.length;i++){
			if(insuranceCode==insuranceTable[i].getInsuranceCode()){
				System.out.println(insuranceTable[i].toString());
			}
		}
	}
		
	public static void particularCustomer(int customerCode) {
				for (int i=0; i<idcodeCount; i++) {
			if (customerCode == Customer.customerTable[i].getCustomerCode()){
				System.out.println(insuranceTable[i].toString());
			}
		}
	}
		
	public static Customer returnCostumer(int customerCode){    
		Customer customer=null;   
		for (int z=0; z<idcodeCount; z++) {    
			if (customerCode == Customer.customerTable[z].getCustomerCode())
		return  customer=Customer.customerTable[z];    
			}        return customer;  
		}

	public abstract double costCalculation();
	
	public static void overview(){
		int numLife = Life.getCountL();
		int numHealth = Health.getCountHealth();
		int averageInvest= Life.getSumInvest()/numLife;
		int averageMedExp= Health.getSumMedExp()/numHealth;
		int averageAge= Life.getSumAge()/numLife;
		
		System.out.println(numLife+" "+numHealth+" "+averageInvest+" "+averageMedExp+" "+averageAge);
		}
	}


