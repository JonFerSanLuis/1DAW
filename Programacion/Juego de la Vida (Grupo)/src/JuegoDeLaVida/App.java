package JuegoDeLaVida;

import java.util.Scanner;

public class App {
	/** 
	 * Este método devuelve si una celula vive o muere en la próxima generación, para una posición concreta del tablero
	 *  
	 * @param matriz Tablero de juego
	 * @param x Posición x
	 * @param y Posición y
	 * @return int vive (valor 1: vive, valor 0: muere) 
	 */
	
	public static int proximaCelula(int[][] matriz, int x, int y) {
		int celulasVivas = 0;
		for(int i=x-1; i<=x+1; i++) {
			for(int j=y-1; j<=y+1; j++) {
				if(matriz[i][j] == 1 && !(i==x && j==y) ) { //No contar la casilla central
					celulasVivas++;
				}
			}
		}
		int vive = 0;
		if(celulasVivas <2 || celulasVivas >3) { //Muere por aislamiento o sobrepoblacion
			vive = 0;
		} else if(celulasVivas ==  2 || celulasVivas == 3) { //Vive
			vive = 1;
		}
		return vive;
	}
	/**
	 * Este metodo genera una nueva matriz, recorriendo cada elemento y calculando su estado para la próxima generación (usando el método proximaCelula())
	 * 
	 * @param tablero
	 * @return int[][] la próxima generación del tablero
	 */
	public static int[][] crearProximaGeneracion(int[][] tablero) {
		int[][] proxGen = new int[tablero.length][tablero[0].length];
		
		for(int i=0; i<tablero.length; i++) {
			for(int j=0; j<tablero[i].length; j++) {
				if(i==0 || j==0 || i==tablero.length-1 || j== tablero[i].length-1) { //Mantiene los bordes con 0s
					proxGen[i][j] = 0;
				}else {
					proxGen[i][j] = proximaCelula(tablero, i, j); // Para cada posicion del tablero llama al metodo proximaCelula que devuelve el valor de esa casilla en la proxima generacion
				}
			}			
		}
		return proxGen;
	}
	/***
	 * Este método recorre un tablero y devuelve el número de células vivas que hay en él
	 * 
	 * @param matriz
	 * @return int poblacion viva del tablero
	 */
	public static int contarPoblacion(int[][] matriz) {
		int poblacion = 0;
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				if(matriz[i][j] == 1) {
					poblacion++;
				}
			}
		}
		return poblacion;
	}
	
	//**************************************************************************//
	public static void main(String[] args) {
		
		//1. PEDIR PARAMETROS DE JUEGO POR CONSOLA
		System.out.println("________________________________");
		System.out.println("Bienvenido/a al juego de la vida");
		System.out.println("________________________________");
		Scanner entrada = new Scanner(System.in);
		System.out.println("¿Cuantas filas quieres que tenga el tablero?");
		int filas = entrada.nextInt();
		System.out.println("¿Cuantas columnas quieres que tenga el tablero?");
		int columnas = entrada.nextInt();
		System.out.println("¿Cuantas generaciones quieres visualizar?");
		int generaciones =  entrada.nextInt();
		
		//1.1. Validar que los datos introducidos por el usuario están en un rango que permita realizar el juego correctamente
		if(filas<5) {
			filas = 5;
		} else if(filas>50) {
			filas=50;
		}
		
		if(columnas<5) {
			columnas = 5;
		} else if(columnas>50) {
			columnas=50;
		}
		
		if(generaciones<1) {
			generaciones = 1;
		} else if(generaciones>100) {
			generaciones=100;
		}
		
		//2. GENERAR TABLERO
		int[][] tablero = new int[filas][columnas];
		
		for(int i=0; i<tablero.length; i++) {
			for(int j=0; j<tablero[i].length; j++) {
				if(i==0 || j==0 || i==tablero.length-1 || j== tablero[i].length-1) { //Rellenar bordes con 0s
					tablero[i][j] = 0;
				}else if(Math.random()>0.5) {
					tablero[i][j] = 1;
				} else {
					tablero[i][j] = 0;
				}
				
			}
		}
		System.out.println("Generacion Inicial: ");
		System.out.println("Población: "+contarPoblacion(tablero));
		
		//3. MOSTRAR TABLERO INICIAL
		for(int i=0; i<tablero.length; i++) {
			for(int j=0; j<tablero[i].length; j++) {
				System.out.print(tablero[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("-------");
		
		//4. CREAR Y MOSTRAR LAS PROXIMAS GENERACIONES
		for(int k=1; k<=generaciones; k++) {
			tablero = crearProximaGeneracion(tablero); //llama al metodo que genera la proxima matriz y la sobreescribe en la variable tablero
			System.out.println("Generacion: "+k);
			System.out.println("Población: "+contarPoblacion(tablero));
			for(int i=0; i<tablero.length; i++) { //bucle para mostrar la nueva generacion
				for(int j=0; j<tablero[i].length; j++) {
					System.out.print(tablero[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("-------");
		}
		entrada.close();

	}

}