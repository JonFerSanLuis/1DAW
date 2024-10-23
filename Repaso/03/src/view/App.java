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
		
		
		
		/*
			Cambiar valores de todo el array
			Cambiar un valor del array
			Reiniciar el array
			Mostrar Array
			Salir
			
			
			El primero debe pedir números para todas las posiciones del array.
			 
			El segundo pide una posición y un número y se modifica por el anterior. 
			
			En el tercer caso se ponen todos los valores del array a 0, antes de reiniciar se te tiene que avisar al usuario 
			que va a borrar todos los datos y si dice que no quiere borrar volver al menú. 
			
			La cuarta opción muestra los valores del array. Después de cada una de estas opciones debe mostrarse el mismo menú otra vez.
			 
			Por último para finalizar el programa tenemos la opción 5.


		 */
		int menu = 0;
		
		while (menu != 5) {
		
			System.out.println("todo el array (1), cambiar un valor (2), reiniciar (3), mostrar(4), salir(5):");
			menu = entrada.nextInt();
			
			if (menu == 1) {
				for (int i = 0; i < arrayVariable.length; i++) {
					System.out.println("Inserte siguiente numero:");
					int numArray = entrada.nextInt();
					arrayVariable[i] = numArray;			
				}
				
			}else if (menu == 2) {
				System.out.println("Que posicion quieres cambiar?");
				int pos = entrada.nextInt();
				
				System.out.println("Inserte numero:");
				int numArray = entrada.nextInt();
				arrayVariable[pos] = numArray;		
				
			}else if (menu == 3) {
				System.out.println("Se va a reiniciar el array, esta seguro (S / N)");
				String confirmar = entrada.next();
				if (confirmar.equals("S")) {
					for (int i = 0; i < arrayVariable.length; i++) {
						arrayVariable[i] = 0;			
					}
				}
			}else if (menu == 4) {
				
				System.out.print("Se ha creado tu array: [");
				
				for (int i = 0; i < arrayVariable.length; i++) {
					if (i == arrayVariable.length -1) {
						System.out.print(arrayVariable[i]);
					} else {
						System.out.print(arrayVariable[i]+", ");
					}
					
				}
				System.out.println("]");
				
			}else if (menu == 5) {
				
			}
		}
		entrada.close();
	}

}
