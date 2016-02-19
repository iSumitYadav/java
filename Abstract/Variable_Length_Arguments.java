package Abstract;

public class Variable_Length_Arguments {
	public static void main(String args[]){
		System.out.println(average(1,2,30,4,5,18));
	}
	
	public static double average(int...numbers){/**3 dots tells the compiler 
		to take care of variable length parameter*/
		int total = 0;
		for(int x : numbers)
			total += x;
		
		//System.out.printf("%d, %d\n", total, numbers.length);
		System.out.println("Return statement Explicitly Type-Casted to double");
		return (double)total/numbers.length;//Explicitly type-casted to double
	}
}
