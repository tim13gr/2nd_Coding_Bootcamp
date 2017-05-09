package exercises1to4;

import java.util.Arrays;
import java.util.Scanner;
	public class Ex4{
		public static void main(String[] args){
			System.out.println("Enter the length of table:");
			Scanner scan1 = new Scanner(System.in);
			int input= scan1.nextInt();
			Double [] array = new Double[input];
			for(int i=0;i<array.length;i++){
				array[i]= i+1.0;
			}
			rightShift(array);}
		public static void rightShift(Double[] array){  		
			for(int i=0; i<array.length;i++){
				double z= array[(array.length-1)];
				for(int y=0;y<(array.length-1);y++){
					array[(array.length-1)-y]=array[(array.length-2)-y];
				}
				array[0]=z;
				System.out.println(Arrays.toString(array)); 
					
				}
			}
		}
