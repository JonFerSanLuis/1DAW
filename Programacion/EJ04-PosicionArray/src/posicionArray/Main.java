package posicionArray;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
Scanner entrada = new Scanner (System.in);
		
		System.out.println("Numero 1:");
		int num1 = entrada.nextInt();
		
		System.out.println("Numero 2:");
		int num2 = entrada.nextInt();
		
		System.out.println("Numero 3:");
		int num3 = entrada.nextInt();
		
		System.out.println("Numero 4:");
		int num4 = entrada.nextInt();
		
		System.out.println("Numero 5:");
		int num5 = entrada.nextInt();
		
		System.out.println("Numero 6:");
		int num6 = entrada.nextInt();
		
		System.out.println("Numero 7:");
		int num7 = entrada.nextInt();
		
		System.out.println("Numero 8:");
		int num8 = entrada.nextInt();
		
		int arrayNumeros[] = {num1, num2, num3, num4, num5, num6, num7, num8};
		
		System.out.println("Numero adicional:");
		int numAdicional = entrada.nextInt();
		
		for (int i = 0; i < arrayNumeros.length; i++) {
			if (arrayNumeros[i] == numAdicional) {
				System.out.println(i);
				break;
			}
		}
	}

}
