package colecciones;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		Persona p1 = new Profesor();
		Persona p2 = new Alumno();
		
		p1.andar();
		p2.andar();
		
		
		// crear array
		String[] dias = new String[7];
		
		// dar valor
		dias[0] = "Lunes";
		
		// obtener valor
		System.out.println(dias[0]);
		
		// recorrer
		for (int i = 0; i < dias.length; i++) {
			System.out.println(dias[i]);
		}
		
		// no se puede ampliar
		
		// ArrayList - implementa la interfaz List con lo que es un Iterable, Collection y List.
		// definicion
		ArrayList<String> lista = new ArrayList<>();
		
		// Cuando usar Array y cuando ArrayList?
			// Son lo mismo, no hay diferencia. Pero un array se utilizara cuando tengamos un conjunto de datos fijo, como dias de la semana etc.
			// Cuando esa cantidad de datos sea indefinida y pueda ser escalable, se guardará en un ArrayList, para poder ampliar su tamaño.
	}

}
