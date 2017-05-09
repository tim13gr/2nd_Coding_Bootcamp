package insuranceExtend1;

import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		Customer cust1 = new Customer(2000, "male");
		Customer cust2 = new Customer(2011, "male");
		Customer cust3 = new Customer(1952, "female");
		Customer cust4 = new Customer(1700, "male");
		Customer cust5 = new Customer(1988, "female");
		Customer cust6 = new Customer(2012, "female");
		Customer cust7 = new Customer(2001, "female");
		Customer cust8 = new Customer(2002, "male");
		

		Life life1 = new Life(24, cust1, 1000);
		Life life2 = new Life(8, cust2, 1000);
		Life life3 = new Life(24, cust3, 500);
		Life life4 = new Life(8, cust4, 1500);
		Life life5 = new Life(8, cust5, 2500);
		Health health1 = new Health(48, cust6, 1000);
		Health health2 = new Health(8, cust7, 2000);
		Run();
	}

	public static void Run() {
		while (true) {
			System.out.print(
					"      ***** Menu ***** \n1. Print all Insurances\n2. Search insurances by customer code\n3. Search insurances by insurance code\n4. Create customer\n0. Press 0 to exit\n");
			Scanner menu = new Scanner(System.in);
			int num = menu.nextInt();
			switch (num) {
			case 1:
				Insurance.printIns();
				break;
			case 2:
				System.out.print("Give a customer code");
				Scanner cc = new Scanner(System.in);
				int x = cc.nextInt();
				Insurance.particularCustomer(x);
				break;
			case 3:
				System.out.print("Give a insurance code");
				Scanner ic = new Scanner(System.in);
				int y = ic.nextInt();
				Insurance.searchInsurance(y);
				break;
			case 4:
				System.out.print("1. Update a customer.\n2. Create new customer\n");
				Scanner cho= new Scanner(System.in);
				int updCreate = cho.nextInt();
				switch (updCreate){
				case 1: System.out.print("Enter customer code\n");
						Scanner ccode = new Scanner(System.in);
						int code = ccode.nextInt();
						Customer customer= Insurance.returnCostumer(code);
						addInsurance(customer);
						break;
				
				case 2: System.out.print("Create a new customer. (yearBirth, sex)\n");
						Scanner newc = new Scanner(System.in);
						int yearBirth = newc.nextInt();
						String sex2 = newc.next();
						Customer newcustomer2 = new Customer(yearBirth, sex2);
						addInsurance(newcustomer2);
						break;
						default:
							System.out.println("Wrong");
							break;
				}	break;	
			case 0:
				return;
			default:
				System.out.println("Wrong");
				break;
			}
		}
	}
	public static void addInsurance(Customer newcustomer){
		System.out.println("Type of Insurance");
		Scanner newI = new Scanner(System.in);
		String typeI = newI.next();
		if (typeI.equals("Life") || typeI.equals("life")) {
			System.out.println("Enter Life Insurance details. (duration, investment amount)\n");
			Scanner newd = new Scanner(System.in);
			int duration = newd.nextInt();
			int Invest = newd.nextInt();
			Life life = new Life(duration, newcustomer, Invest);
		} else if (typeI.equals("Health") || typeI.equals("health")) {
			System.out.println("Enter Health Insurance details. (duration, medical expense)\n");
			Scanner newd = new Scanner(System.in);
			int duration = newd.nextInt();
			int medExp = newd.nextInt();
			Health health = new Health(duration, newcustomer, medExp);
		}
	}
}
