package ejerciset1entrega;

import java.util.Scanner;

public class Ejercise4 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 int base,altura;
		 double area;
	        System.out.print("Escribe la base del triangulo: ");
	        base = scanner.nextInt();
	        System.out.print("Escribe la altura del triangulo: ");
	        altura = scanner.nextInt();
	        //calculamos el area
	        area =base*altura/2;
	        System.out.print("el area del triangulo es: " + area);
	        

	}

}
