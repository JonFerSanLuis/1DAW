package view;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		/*
		System.out.println("Columnas");
		int col = entrada.nextInt();
		
		System.out.println("Filas");
		int fil = entrada.nextInt();
		*/
		
		int matriz[][] = new int[5][5];
		
		rellenarMatriz(matriz);
		
		mostrarMatriz(matriz);
		
		entrada.close();
		
	}
	
	public static void rellenarMatriz(int matriz[][]) {
		int col = 0;
		int fila = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = Math.random() < 0.5 ? 0 : 1;
				col = i;
				fila = j;
			}
		}
		estadoCelula(matriz, fila, col);
	}
	
	public static void mostrarMatriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	public static void estadoCelula(int matriz[][], int col, int fila) {
		for (int i = 0; i < matriz.length; i++) {
			
		}
	}
	
}
