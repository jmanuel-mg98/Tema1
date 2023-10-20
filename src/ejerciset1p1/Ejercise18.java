package ejerciset1p1;

import java.util.Scanner;

public class Ejercise18 {

	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		System.out.print("escribe su nombre: ");
		String nombre = cs.nextLine();
		System.out.print("escribe su edad: ");
		int edad = cs.nextInt();
		System.out.print("Hola " +nombre + ", tienes " +edad  +" años, ¡qué mayor eres!");
		
		
	}

}
