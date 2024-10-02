package operadores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Operadores aritmeticos*/
		int n1 = 1;
		int n2 = 2;
		
		System.out.println(n1 + n2);
		
		int n3 = 6;
		float n4 = 3.5f;
		
		System.out.println(n3+n4);

	//	  +
	//	  -
	//	  / 
	//	  *
	//	  % El resto de una division
			  int n5 = 6;
			  int n6 = 3;
			  System.out.println(n6%2);
	//	  ++
			  System.out.println("Incremento");
			  int n7 = 8;
			  n7 = n7 + 1;
			  n7++;
			  System.out.println(n7);
	//	  --
		
/*Operadores relacionales*/
		// ==
			  System.out.println(1 == 1); // true
			  System.out.println(1 == 2); // false
		// !=
			  System.out.println(1 != 1); // false
			  System.out.println(1 != 2); // true
		// >
			  System.out.println(1 > 1); // false
			  System.out.println(1 > 2); // true
		// <
			  System.out.println(1 < 0); // true
			  System.out.println(1 < 1); // false
			  System.out.println(1 < 2); // false
		// >=
			  System.out.println(1 >= 0); // true
			  System.out.println(1 >= 1); // true
			  System.out.println(1 >= 2); // false
		// <=
			  System.out.println(1 <= 0); // false
			  System.out.println(1 <= 1); // true
			  System.out.println(1 <= 2); // true

/* Operadores logicos*/
		// &&
			  System.out.println(1 > 0 && 1 < 2);
		// ||
			  System.out.println(1 > 0 || 1 < 2);
		// !
			  System.out.println(1 > 0 && 1 < 2);
	}

}
