package compra;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Nombre:");
		String nombre = entrada.next();
		
		System.out.println("Introduzca tipo de cliente (Normal, Socio, VIP)");
		String tipo_cliente = entrada.next();
		
		if (tipo_cliente.equals("Normal") || tipo_cliente.equals("Socio") || tipo_cliente.equals("VIP")) {
			System.out.println("Introduzca el importe de la compra:");
			double importe_compra = entrada.nextDouble();
			
					switch (tipo_cliente) {
					case "Socio":
						importe_compra = importe_compra * 0.95;
						System.out.println("El cliente " + nombre + " tiene que pagar un importe de " + importe_compra + " euros");
						break;
						
					case "VIP":
						importe_compra = importe_compra * 0.80;
						System.out.println("El cliente " + nombre + " tiene que pagar un importe de " + importe_compra + " euros");
						break;
		
					default:
						System.out.println("El cliente " + nombre + " tiene que pagar un importe de " + importe_compra + " euros");
						break;
					}
		} else {
			System.out.println("Tipo de cliente no válido");
		}
	}

}
