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
		
		int menu = 0;
		
		while (menu != 11) {
		
			System.out.println("todo el array (1), cambiar un valor (2), reiniciar (3), mostrar(4), Suma(5), Multiplicación(6), Media(7), Factorial de cada valor(8), Ordenar de menor a mayor(9), Ordenar de mayor a menor(10), salir(11):");
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
				// sumar
				int resultado = 0;
				for (int i = 0; i < arrayVariable.length; i++) {
					resultado = resultado + arrayVariable[i];		
				}
				System.out.println("El resultado de la suma es: " + resultado);
				
			}else if (menu == 6) {
				// multiplicar
				int resultado = 1;
				for (int i = 0; i < arrayVariable.length; i++) {
					resultado = resultado * arrayVariable[i];		
				}
				System.out.println("El resultado de la multiplicacion es: " + resultado);
				
			}else if (menu == 7) {
				// media
				int media = 0;
				for (int i = 0; i < arrayVariable.length; i++) {
					media = media + arrayVariable[i];		
				}
				System.out.println("La media es: " + media / arrayVariable.length);
				
			}else if (menu == 8) {
				// factorial de cada valor
				int factorial = 1;
				for (int i = 0; i < arrayVariable.length; i++) {
					factorial = 1;
					for (int j = 1; j <= arrayVariable[i]; j++) {
						factorial = factorial * j;
					}
					System.out.println(factorial);
				}
				
			}else if (menu == 9) {
				// ordenar de menor a mayor
				for (int i = 0; i < arrayVariable.length - 1; i++) {
		            for (int j = 0; j < arrayVariable.length - 1 - i; j++) {
		                if (arrayVariable[j] > arrayVariable[j + 1]) {
		                    int temp = arrayVariable[j];
		                    arrayVariable[j] = arrayVariable[j + 1];
		                    arrayVariable[j + 1] = temp;
		                }
		            }
		            System.out.println(arrayVariable[i]);
		        }

				
			}else if (menu == 10) {
				// ordenar de mayor a menor
				for (int i = 0; i < arrayVariable.length - 1; i++) {
		            for (int j = 0; j < arrayVariable.length - 1 - i; j++) {
		                if (arrayVariable[j] < arrayVariable[j + 1]) {
		                    int temp = arrayVariable[j];
		                    arrayVariable[j] = arrayVariable[j + 1];
		                    arrayVariable[j + 1] = temp;
		                }
		            }
		            System.out.println(arrayVariable[i]);
		        }
			}else if (menu == 11) {
				// salir
			}else {
				System.out.println("Opcion incorrecta");
			}
		}
		entrada.close();
	}

}
