

public class Ex1 {
 public static void main(String[] args){
	 int [] array = new int[9];
	 int count=0;
	 array[8]+=1;
	 for(int y=0;y<=8;y++){
			System.out.print(array[y]);
		 }
		 System.out.println("");
	 for(int i=0;i<=7;i++){
		 int z=array[8];
		 for(int k=7;(k>=(7-count) && k<=(7)) ;k--){
			 array[k]=z+1;
		 }
		 array[8]=z+1;
		 count+=1;
		 for(int y=0;y<=8;y++){
			System.out.print(array[y]);
		 }
		 System.out.println("");

	 }
 }
}