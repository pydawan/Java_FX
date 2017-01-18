package application;

public class Controle {

	public float calculator(long number1, long number2, String oper) {

		switch (oper) {
			case "/":
				if (number2 == 0) {
					return 0;
				}
				return number1 / number2;
			case "-":
				return number1 - number2;
			case "+":
				return number1 + number2;
			case "*":
				return number1 * number2;
			default:
			return 0;
		}
	}

}
