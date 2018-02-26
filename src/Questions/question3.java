package Questions;

/**
 * Write a function that takes a character array as input and returns the array reversed.
 * The function should reverse the array in-place and return it as the return value of the function.
 * @author Bhavy
 */

public class question3 {

	public static void main(String[] args) {
		basic_controller cobj = new controller();
		char[] charArray = "Hyland".toCharArray();
		System.out.println(cobj.reverseArray(charArray));
	}

}
