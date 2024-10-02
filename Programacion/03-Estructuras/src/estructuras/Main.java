package estructuras;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
	// If
		
		System.out.println("Introduzca su edad:");
		int edad = entrada.nextInt();
		
		if (edad >= 16 && edad < 18) {
			System.out.println("Entrada permitida con tutor");
		} else if (edad >= 18) {
			System.out.println("Entrada permitida");
		} else {
			System.out.println("Entrada denegada");
		}
		
		
	
	// Switch
		System.out.println("Introduce la inciar del dia de la semana:");
		
		String dia = entrada.next();
		
		switch (dia) {
		case "l":
			System.out.println("Lunes");
			break;
		case "m":
			System.out.println("Martes");
			break;
		case "x":
			System.out.println("Miercoles");
			break;
		case "j":
			System.out.println("Jueves");
			break;
		case "v":
			System.out.println("Viernes");
			break;
		default:
			System.out.println("Finde");
		}
		entrada.close();
		
	}

}
