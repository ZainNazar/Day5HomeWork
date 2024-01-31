package homework.noorteck.day5;

public class Calculator {
	public static void main(String[] args) {

		char mathOperation = '/';
		double numOne = 22;
		double numTwo = 0;
		double result = 0;
		String message = "NONE";
		boolean isCorrectOperation = true;

		if (mathOperation == '+') {

			result = numOne + numTwo;
			isCorrectOperation = true;
		} else if (mathOperation == '-') {
			result = numOne - numTwo;
			isCorrectOperation = true;
		} else if (mathOperation == '*') {
			result = numOne * numTwo;
			isCorrectOperation = true;
		} else if (mathOperation == '/') {
			result = numOne / numTwo;
			isCorrectOperation = true;
		}
		 else if ((numTwo==0 )&& (mathOperation =='/' )) {
				message="error";
				isCorrectOperation = false;
			} else if (mathOperation == '%') {
			result = numOne % numTwo;
			isCorrectOperation = true;
		} else {
			message = "WRONG INPUT DATA";
			isCorrectOperation = false;
		}
		if (message == "WRONG INPUT DATA" && isCorrectOperation == false) {

			System.out.println("                          " + message);
			System.out.println("                                " + isCorrectOperation);
		}

		else if (isCorrectOperation==true) {
			System.out.println(numOne + " " + mathOperation + " " + numTwo + " = " + result);
		}
		else {
			System.out.println(message + "Cannot divided by zero");
		}

	}

}
