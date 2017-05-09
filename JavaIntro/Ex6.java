

import java.util.Scanner;
import java.util.Arrays;
	public class Ex6{
		public static void main(String[] args){
			System.out.println("Enter a 9 digit TIN:");
			Scanner input=new Scanner(System.in);
			int tin = input.nextInt();
			int checkd=tin%10;
			int num=tin/10;
			int[] array=new int[8];
			for(int i=0; i<8;i++){
				int x = num/10;
				int y = num%10;
				num = x;
				array[i]=y;
			}
			int total=0;
			for(int i=0;i<8;i++){
				total+= array[i]*(Math.pow(2,(i+1)));				
			}
			total=(total%11)%10;
			if(checkd==total){
				System.out.println("Tax Identification Number valid.");
			}else{
				System.out.println("Tax Identification Number not valid.");
			}
		}
}