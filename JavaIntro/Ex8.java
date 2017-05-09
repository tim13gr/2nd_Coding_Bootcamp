


import java.util.Scanner;
public class Ex8{
	public static void main(String[] args){
		System.out.println("Enter a 10 digit number:");
		Scanner input=new Scanner(System.in);
		int digit = input.nextInt();
		int [] array = new int[10];
		for(int i=9;i>=0;i--){
			int a=digit/10;
			int b= digit%10;
			digit = a;
			array[i]=b;
		}
		for(int i=0;i<=9;i+=2){
			System.out.print(array[i]+" ");				
		}
		System.out.println("");
		for(int i=1;i<=9;i+=2){
			System.out.print(" "+array[i]);
	}
}
}