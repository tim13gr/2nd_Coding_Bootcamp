

import java.util.Scanner;
public class Ex2{
	public static void main(String args[]){
		int [] banknotes={50,20,10,5,2,1};
		int [] totals = new int[6];
		int counter = 0;
		for(int x : banknotes){
			System.out.println("Enter number of "+x+ " euro");
			Scanner input= new Scanner(System.in);
			int poso=input.nextInt();
			//System.out.println(x+"eura "+ poso);
			totals[counter]= poso;
			counter +=1;}

		int sum=0;
		for(int i=0; i<totals.length; i++){
			sum=sum+(totals[i]*banknotes[i]);
			}
			System.out.print("You have "+sum+" euro \n");

	}
	}
