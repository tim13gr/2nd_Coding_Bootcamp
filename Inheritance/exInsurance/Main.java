package exInsurance;

public class Main {
	public static void main (String[] args){
		Customer cost1 = new Customer(2000, "male");
		Customer cost2 = new Customer(2011, "male");
		Customer cost3 = new Customer(1952, "female");
		Customer cost4 = new Customer(1700, "male");
		Customer cost5 = new Customer(1988, "female");
		Customer cost6 = new Customer(2012, "female");
		Customer cost7 = new Customer(2001, "female");
		Customer cost8 = new Customer(2002, "male");
		Customer cost9 = new Customer(2005, "male");
		Customer cost10 = new Customer(2009, "male");
		
		
		Life life1= new Life(24,cost1,1000);
		Life life2= new Life(8,cost2,1000);
		Life life3= new Life(24,cost3,500);
		Life life4= new Life(8,cost4,1500);
		Life life5= new Life(8,cost4,2500);
		Health health1= new Health(48,cost5,1000);
		Health health2= new Health(8,cost6,2000);
		Health health3= new Health(12,cost7,1000);
		Health health4= new Health(8,cost6,2000);
		Health health5= new Health(4,cost7,3000);
		Insurance.printIns();
		
			}

}
