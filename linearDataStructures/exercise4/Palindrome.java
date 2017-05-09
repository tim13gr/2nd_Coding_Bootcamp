package exercise4;
import java.util.Scanner;
public class Palindrome {
	public static void main (String[] args){
		System.out.println("Check if a word is palindrome.(enter the word)");
		Scanner input = new Scanner(System.in);
		String word = input.next();
		char[] array=word.toCharArray();
		for(int i=0; i <((array.length/2)-1);i++){
			if(array[i]!=array[array.length-1-i]){
				System.out.println("Not a palindrome word");
				break;
			}else{
			System.out.println("This is a palindrome word");
			break;
		}
 	}
 }
}
