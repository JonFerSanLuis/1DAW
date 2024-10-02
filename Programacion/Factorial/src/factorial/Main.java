package factorial;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduce un numero");
		int numeroUser = entrada.nextInt();
		
		int numFinal = 1;
		
		for (int i = 1; i <= numeroUser; i++) {
			numFinal = numFinal * i;
			System.out.println(numFinal);
		}
	
		entrada.close();
	}
}