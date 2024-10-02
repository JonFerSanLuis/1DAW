package nombreInvertido;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre:");
		String nombre = entrada.next();
		
		for (int i = nombre.length() - 1; i >= 0; i--) {
			System.out.println(nombre.charAt(i));
		}
		
		int numero = (int) (Math.random() * 10) + 1;
		
		while (true) {
			System.out.println("Introduce un  numero:");
			int numeroUsuario = entrada.nextInt();
			
			if (numeroUsuario == numero) {
				System.out.println("Has acertado");
				break;
			} else {
				System.out.println("Has fallado");

			}
		}
		entrada.close();
		
	}

}
