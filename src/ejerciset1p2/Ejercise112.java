package ejerciset1p2;

import java.util.Scanner;

public class Ejercise112 {

	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		System.out.print("escribe tu edad: ");
		int edad = cs.nextInt();
		boolean mEdad = edad >= 18;
		System.out.print("mayoria de edad: " + mEdad);

	}

}
