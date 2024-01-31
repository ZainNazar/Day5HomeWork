package homework.noorteck.day5;

public class ClaculatorSecond {

	public static void main(String[] args) {

		char mathOPeration = '/';
		double numOne = 20;
		double numTwo = 0;
		double result = 0;
		String message = "NONE";
		boolean isCorrectOperation = true;

		if (mathOPeration == '+') {
			result = numOne + numTwo;
			isCorrectOperation = true;
		}

		else if (mathOPeration == '-') {

			result = numTwo - numOne;
			isCorrectOperation = true;
		}

		else if (mathOPeration == '*') {

			result = numOne * numTwo;
			isCorrectOperation = true;

		}

		else if (mathOPeration == '/') {

			result = numOne / numTwo;
			isCorrectOperation = true;
		}
		else if (mathOPeration == '/'&& numTwo==0) {

			message="Error";
			isCorrectOperation = false;
		}

		else if (mathOPeration == '%') {

			result = numOne % numTwo;
			isCorrectOperation = true;
		}

		else {
			message = "Wrong Input";
			isCorrectOperation = false;
		}

		if (isCorrectOperation == true) {

			System.out.println(numOne + " " + mathOPeration + " " + numTwo + " = " + result);
		}

		else {
			System.out.println(" wrong input data ");
			System.out.println(isCorrectOperation);
		}

	}

}
