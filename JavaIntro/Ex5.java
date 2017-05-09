

import java.util.Scanner;
public class Ex5{
	public static void main(String args[]){
		System.out.println("Enter number of pronic numbers  :");
		Scanner input= new Scanner(System.in);
		int poso=input.nextInt();
		for(int x=1; x<=poso ; x++){
			int z= x*(x+1);
			System.out.println(x+" * "+ (x+1) + " = " + z);
		}
		}
}