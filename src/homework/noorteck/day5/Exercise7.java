package homework.noorteck.day5;

public class Exercise7 {

	public static void main(String[] args) {

		double num1 = 20;
		double num2 = 0;
		double result = 0;
		char oper = '/';
		boolean exst = true;
		String mess="";

		if (oper == '+') {
			result = num1 + num2;
			exst = true;

		}
		else if (oper=='/') {
			result = num1 / num2;
			exst = true;
		}
		
		else if (oper=='/'&& num2==0) {
			
			exst=false;
			mess="error";
		}
		
		if (exst==true) {
			System.out.println(result);
		}
		else if (exst==false) {
			
			System.out.println(mess);
		}

	}

}
