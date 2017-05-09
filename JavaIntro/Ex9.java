

import java.util.Scanner;
	public class Ex9{
		public static void main(String[] args){
			System.out.println("Enter a 9 digit number:");
			Scanner input=new Scanner(System.in);
			int digit = input.nextInt();
			int [] array = new int[9];
			for(int i=8;i>=0;i--){
				int a=digit/10;
				int b= digit%10;
				digit = a;
				array[i]=b;
			}
			for(int i=0;i<=8;i+=3){
				System.out.print(array[i]+" ");				
			}
			System.out.println("");
			for(int i=1;i<=8;i+=3){
				System.out.print(" "+array[i]);
		}
			System.out.println("");
			System.out.print(" ");
			for(int i=2;i<=8;i+=3){
				System.out.print(" "+array[i]);
		}
	}
	}

