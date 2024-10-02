package Variables;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// Tipos primitivos en Java
			// int, short, long, double, float, boolean, byte, char
		// Tipos Referencia
			// Integer, Short, Long, Double, Float, Boolean, Byte, Character, String
		int num = 1;
		
		char caracter = 'a';
		double numero = 3;
		Double numero2 = 2.0;
		String cadena = "Joni";
		
		for (int i = 0; i < cadena.length(); i++) {
			System.out.println(cadena.charAt(i));
		}
	}

}