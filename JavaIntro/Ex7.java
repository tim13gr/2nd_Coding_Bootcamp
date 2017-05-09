

	import java.util.Arrays;
	import java.util.Scanner;
	public class Ex7 {
		public static void main(String[] args){
		 System.out.println("Enter 8bit number: ");
		 Scanner input = new Scanner(System.in); 
		 int a = input.nextInt();  
		 int lastdig=a%10;
	     int seven=a/10;
	     int []array= new int[7];
	     int sum7=0;
		 for(int i=6;i>=0;i--){
			 array[i]=seven%10;
			 seven=seven/10;
			 sum7=sum7+array[i];
		 }
		 if (lastdig==0 && (sum7==1 || sum7==3 || sum7==5 || sum7==7)){
			 System.out.println("Parity check not OK.");
			 }else if(lastdig==1 && (sum7==0 || sum7==2 || sum7==4 || sum7==6)){
				 System.out.println("Parity check not OK.");
			 }else{
			 System.out.println("Parity check OK.");
		 }
	}
	}
