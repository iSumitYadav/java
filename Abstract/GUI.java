package Abstract;

import javax.swing.*;

public class GUI {
	public static void main(String args[]){
		String Name = JOptionPane.showInputDialog("Enter Your Name");
		String age = JOptionPane.showInputDialog("Enter Your Age");
		String Id = JOptionPane.showInputDialog("Enter Your Id");
		
		int age_int = Integer.parseInt(age);
		
		JOptionPane.showMessageDialog(null, "Your Name is " + Name + "\nYour Age is " + age_int + "\nYour Id is " + Id, "Details", JOptionPane.PLAIN_MESSAGE);
	}
}