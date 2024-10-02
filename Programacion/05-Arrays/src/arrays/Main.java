package arrays;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Numero de mes");
		int numMes = entrada.nextInt();
		
		String[] año = new String[12];
		año[0] = "Enero";
		año[1] = "Febrero";
		año[2] = "Marzo";
		año[3] = "Abril";
		año[4] = "Mayo";
		año[5] = "Junio";
		año[6] = "Julio";
		año[7] = "Agosto";
		año[8] = "Septiembre";
		año[9] = "Octubre";
		año[10] = "Noviembre";
		año[11] = "Diciembre";
		
		System.out.println(año[numMes]);
		
		entrada.close();
	}
}