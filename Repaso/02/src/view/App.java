package view;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("¿De cuantas posiciones quiere crear el array?");
		int numPos = entrada.nextInt();
		
		System.out.println("Ceros, Aleatorios o Manual? (0, A, M)");
		String tipo = entrada.next();
		
		
		
		int[] arrayVariable = new int[numPos];
		
		if (tipo.equals("A")) {
				for (int i = 0; i < arrayVariable.length; i++) {
					arrayVariable[i] = (int) (Math.random() * 101);
				}
		} else if (tipo.equals("M")) {
				for (int i = 0; i < arrayVariable.length; i++) {
					System.out.println("Inserte siguiente numero:");
					int numArray = entrada.nextInt();
					arrayVariable[i] = numArray;			
				}
		}
		
		
		System.out.print("Se ha creado tu array: [");
		
		for (int i = 0; i < arrayVariable.length; i++) {
			if (i == arrayVariable.length -1) {
				System.out.print(arrayVariable[i]);
			} else {
				System.out.print(arrayVariable[i]+", ");
			}
			
		}
		System.out.println("]");
		
		
		
		entrada.close();
	}

}
