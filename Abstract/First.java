package Abstract;

import java.util.Scanner;

public class First {
	public static void main(String args[]){
		//System.out.println("Hello World!");
		
		Scanner input = new Scanner(System.in);
		Second sec = new Second();
		System.out.print("Enter name of your GF: ");
		String temp = input.nextLine();
		sec.setname(temp);
		sec.print();
		
		input.close();// Needed to suppress the warning "Resource Leak: input is never closed
	}
}