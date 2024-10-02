package palindromo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduzca nombre:");
		String nombre = entrada.next();
		/*
		StringBuilder builder=new StringBuilder(nombre);
		String reversa = builder.reverse().toString();
		
		if (reversa.equals(nombre)) {
			System.out.println("Palindromo");
		} else {
			System.out.println("No palindromo");
		}
		*/
		String alReves = "";
		for (int i = nombre.length() - 1; i >= 0; i--) {
			alReves = alReves + nombre.charAt(i);
		}
		if (alReves.toUpperCase().equals(nombre.toUpperCase())) {
			System.out.println("Palindromo");
		} else {
			System.out.println("No palindromo");
		}
		entrada.close();
	}

}
