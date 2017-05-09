package exercises1to4;

import java.util.Arrays;
import java.util.Scanner;
	public class Ex3{
		public static void main(String[] args){
			System.out.println("Enter the length of table:");
			Scanner scan1 = new Scanner(System.in);
			int input= scan1.nextInt();
			int [] array = new int[input];
			for(int z=0;z<array.length;z++){
				array[z]=z+1;
			}
				rightShift(array);
		}
			public static void rightShift(int[] array){
				for(int i=0; i<array.length;i++){
				int z= array[(array.length-1)];
				for(int y=0;y<(array.length-1);y++){
					array[((array.length-1)-y)]=array[((array.length-2)-y)];
				}
				array[0]=z;
				System.out.println(Arrays.toString(array)); 
					
				}
			}
		}
