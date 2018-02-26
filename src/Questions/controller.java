package Questions;

public class controller implements basic_controller {
	
	@Override
	public void checkDivisible(int start, int end) {
		for(int i = start; i <= end; i++){
			boolean flag_three = false;
			boolean flag_seven = false;
			if (i % constants.THREE == 0) {
				flag_three = true;
			}
			if (i % constants.SEVEN == 0) {
				flag_seven = true;
			}

			if (flag_three && flag_seven) {
				System.out.println("Number="+ i + " Output=" + constants.ONBASE);
			} else if (flag_three) {
				System.out.println("Number="+ i + " Output=" + constants.ON);
			} else if (flag_seven) {
				System.out.println("Number="+ i + " Output=" + constants.BASE);
			}
		}
	}

	@Override
	public void printPrime(int limit) {
		for(int i = 0; i < limit; i++){
			boolean flag_prime = true;
			if (i < 2) flag_prime = false;
			for (long j = 2; j*j <= i; j++) {
	            if (i % j == 0) {
	            	flag_prime = false;
	                continue;
	            }
	        }
			if(flag_prime){
				System.out.print(i);
				System.out.print(" ");
			}
		}
		
	}

	@Override
	public char[] reverseArray(char[] array) {
		int start = 0;
		int end = array.length - 1;
		for(int i = start; i <= end/2; i++){
			char temp = array[i];
			array[i] = array[end - i];
			array[end - i] = temp;
		}
		return array;
	}

}
