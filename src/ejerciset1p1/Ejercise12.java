package ejerciset1p1;

import java.util.Scanner;

public class Ejercise12 {

	public static void main(String[] args) {
		System.out.print("introduce tu edad");
		Scanner cs = new Scanner (System.in);
		int edad = cs.nextInt();
		edad = edad+1;
		System.out.print("tu edad el año que viene es de " + edad  +" años");
		cs.close();

	}

}
