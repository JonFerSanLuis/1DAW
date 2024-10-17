package numMaximoArray;

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
		
		int arrayNumeros[] = {num1, num2, num3, num4, num5};
		
		int num = arrayNumeros[0];
		
		for (int i = 0; i < arrayNumeros.length; i++) {
			if (arrayNumeros[i] > num) {
				num = arrayNumeros[i];
			}
		}
		System.out.println(num);
		
		entrada.close();
	}

}
