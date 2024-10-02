package scanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca un numero");
		int num1 = entrada.nextInt();

		System.out.println("Introduzca operacion");
		String operacion = entrada.next();

		System.out.println("Introduzca otro numero");
		int num2 = entrada.nextInt();

		if (operacion.equals("+")) {
			System.out.println(num1 + num2);
		} else if (operacion.equals("-")) {
			System.out.println(num1 - num2);
		} else if (operacion.equals("*")) {
			System.out.println(num1 * num2);
		} else if (operacion.equals("/")) {
			System.out.println(num1 / num2);
		} else {
			System.out.println("Operacion no valida");
		}
		
		entrada.close();
	}

}
