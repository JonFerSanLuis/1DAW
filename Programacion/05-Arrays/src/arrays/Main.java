package arrays;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Numero de mes");
		int numMes = entrada.nextInt();
		
		String[] a�o = new String[12];
		a�o[0] = "Enero";
		a�o[1] = "Febrero";
		a�o[2] = "Marzo";
		a�o[3] = "Abril";
		a�o[4] = "Mayo";
		a�o[5] = "Junio";
		a�o[6] = "Julio";
		a�o[7] = "Agosto";
		a�o[8] = "Septiembre";
		a�o[9] = "Octubre";
		a�o[10] = "Noviembre";
		a�o[11] = "Diciembre";
		
		System.out.println(a�o[numMes]);
		
		entrada.close();
	}
}