package exercise2;

import java.util.Arrays;
import java.util.Stack;

public class ReverseStack {

    public static Stack<Integer> reverse(Stack<Integer> initial) {
    	Stack<Integer> myStack2 = (Stack<Integer>) initial.clone();
    	Stack<Integer> myStack3 = new Stack<>();
    	while(!myStack2.empty()){
    		myStack3.push(myStack2.pop());
    		
    	}    	return myStack3;
     }

    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.addAll(Arrays.asList(new Integer[]{0,1,2,3,4,5,6,7,8,9,10}));
        System.out.println("initial stack: " + myStack);
        System.out.println("reversed stack: " + reverse(myStack));
        System.out.println("initial stack: " + myStack);

    }
}
