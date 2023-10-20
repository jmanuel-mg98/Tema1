package ejerciset1p1;

import java.util.Scanner;

public class Ejercise11 {

	public static void main(String[] args) {
		System.out.print("escribe tu numero de usuario");
		Scanner cs = new Scanner(System.in);
		int num = cs.nextInt();
		System.out.print("valor introdducido: " + num);
		cs.close();

	}

}
