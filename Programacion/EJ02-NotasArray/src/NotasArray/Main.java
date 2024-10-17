package NotasArray;

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
		
		System.out.println("Numero 9:");
		int num9 = entrada.nextInt();
		
		System.out.println("Numero 10:");
		int num10 = entrada.nextInt();
		
		int arrayNumeros[] = {num1, num2, num3, num4, num5, num6, num7, num8, num9, num10};
		
		double media = 0;
		
		for (int i = 0; i < arrayNumeros.length; i++) {
			media += arrayNumeros[i];
		}
		
		System.out.println(media / arrayNumeros.length);
		
		entrada.close();
	}

}
