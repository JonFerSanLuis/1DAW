package matrices;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		
		System.out.println("Introduce los numeros para la matriz");
		
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int col = 0; col < matriz.length; col++) {
				matriz[fila][col] = entrada.nextInt();
			}
		}
		
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int col = 0; col < matriz.length; col++) {
				System.out.println(matriz[fila][col]);
			}
		}
		
		entrada.close();
		
	}

}