package model;
import view.Cancion;

public class App {
	public static void main(String[] args) {
		/*
		String nombre = "Jon";
		int edad = 20;
		System.out.println("Hola te llamas " +nombre + " y tienes " +edad + " años");
		*/
		// Crear objetos: NombreClase NombreObjeto = new nombreClase();
		Cancion c1 = new Cancion();
		c1.nombre = "Ayer";
		c1.duracion = 225;
		c1.letra = "Letra";
		System.out.print(c1.nombre +" ");
		System.out.print(c1.duracion +" ");
		System.out.print(c1.letra);
	}

}