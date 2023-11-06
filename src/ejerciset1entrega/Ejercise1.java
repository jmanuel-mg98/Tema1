package ejerciset1entrega;

import java.util.Scanner;

public class Ejercise1 {

	public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);
	       double numdeci;
	       int nument;
	        System.out.print("Escribe un numero con decimales: ");
	        numdeci = scanner.nextDouble();
	        /*para averiguar el numero entero mas cercanos utilizamos un ternario añadiendole
	        o quitandole un 0,5 cambiando de tipo double a tipo int*/
	        nument =  (int)(numdeci >= 0 ? (numdeci + 0.5) : (numdeci - 0.5));
	        System.out.println("El número entero mas cercano es: " + nument);
		

	}

}
