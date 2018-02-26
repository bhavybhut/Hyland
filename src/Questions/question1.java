package Questions;

/**
 * Write a function that will output the numbers from one to one-hundred. 
 * However, for numbers evenly divisible by three print “On” instead and numbers evenly divisible by seven print “Base”. 
 * For those numbers that are evenly divisible by both three and seven print “OnBase”.
 * @author Bhavy
 */

public class question1 {

	public static void main(String[] args) {
		basic_controller cobj = new controller();
		cobj.checkDivisible(1, 100);
	}
	
}
