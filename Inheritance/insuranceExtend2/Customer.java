package insuranceExtend2;

public class Customer {
	private int customerCode;
	private int yearBirth;
	private String sex;
	public static int custCount=0;
	public static Customer[] customerTable=new Customer[10];
	
	public int getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(int customerCode) {
		this.customerCode = customerCode;
	}
	public int getYearBirth() {
		return yearBirth;
	}
	public void setYearBirth(int yearBirth) {
		this.yearBirth = yearBirth;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String toString(){
		return "Customer Code :"+customerCode +" "+"Year of Birth:"+yearBirth+" "+"Gender:"+sex+" ";
	}
	Customer(int yearBirth, String sex){
		this.yearBirth=yearBirth;
		this.sex=sex;
		this.customerCode=custCount;
		customerTable[(custCount)]=this;
		custCount+=1;
	}	
	
}
