package notas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Nombre alumno:");
		String nombre_alumno = entrada.next();
		
		System.out.println("Matemáticas");
		double nota_mate = entrada.nextDouble();
		
		System.out.println("Historia");
		double nota_hist = entrada.nextDouble();
		
		System.out.println("FOL");
		double nota_fol = entrada.nextDouble();
		
		System.out.println("Inglés");
		double nota_ing = entrada.nextDouble();
		
		System.out.println("Gimnasia");
		double nota_gym = entrada.nextDouble();
		
		double media;
		
		if (nota_mate >= 5 && nota_hist >= 5 && nota_fol >= 5 && nota_ing >= 5 && nota_gym >= 5) {
			media = (nota_mate + nota_hist + nota_fol + nota_ing + nota_gym) / 5;
			System.out.println("El alumno " + nombre_alumno + " pasará de curso con una media de " + media);
		} else {
			System.out.println("Todas las notas no superan el 5.");
		}
		
		entrada.close();
	}

}
