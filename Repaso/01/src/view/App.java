package view;

import java.util.Scanner;

public class App {
	/*Ejercicio 1
Crear un programa que pida al usuario de cuantas posiciones quiere crear un array (de enteros) e inicializarlo a 0.

Consola ejemplo:
De cuantas posiciones quieres crear tu array?
5
Se ha creado tu array [0,0,0,0,0]
*/

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("¿De cuantas posiciones quiere crear el array?");
		int numPos = entrada.nextInt();
		
		int[] arrayVariable = new int[numPos];
		
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
