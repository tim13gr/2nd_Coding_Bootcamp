package exercise1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		System.out.println("Enter your message to encrypt and a possitive integer");
		Scanner input = new Scanner(System.in);
		String msg = input.next();
		int shift = input.nextInt();
	    System.out.println("Ciphered: "+cipher(msg,shift));
		System.out.println("Diciphered: "+ dicipher(msg,shift));
		
	}
			
	public static StringBuilder cipher(String msg, int shift){
		    StringBuilder s = new StringBuilder();
		    int len = msg.length();
		    for(int x = 0; x < len; x++){
		        char c = (char)(msg.charAt(x) + shift);
		        if (c > 'z')
		            s.append((char)(msg.charAt(x) - (26-shift)));
		        else
		            s.append((char)(msg.charAt(x) + shift));
		    }
		    return s;
		}
	public static StringBuilder dicipher(String msg, int shift){
	    StringBuilder s = new StringBuilder();
	    int len = msg.length();
	    for(int x = 0; x < len; x++){
	        char c = (char)(msg.charAt(x) - shift);
	        if (c < 'a')
	            s.append((char)(msg.charAt(x) + (26-shift)));
	        else
	            s.append((char)(msg.charAt(x) - shift));
	    }
	    return s;
	}

}
