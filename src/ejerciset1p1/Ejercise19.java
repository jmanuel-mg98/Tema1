package ejerciset1p1;

import java.util.Scanner;

public class Ejercise19 {

	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		
		System.out.print("introduce cantidad en pesetas:");
		int pesetas = cs.nextInt();
		double resultado ;
		resultado = pesetas / 1.66;
		System.out.print("su cantidad convertida en euros es de: " + resultado +" euros");
		
		

	}

}
