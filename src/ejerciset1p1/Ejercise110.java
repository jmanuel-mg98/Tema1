package ejerciset1p1;

import java.util.Scanner;

public class Ejercise110 {

	public static void main(String[] args) {
		System.out.print("introduzca el precio del producto: ");
		Scanner cs = new Scanner(System.in);
		int precio =cs.nextInt();
		double precioiva ;
		precioiva = precio *1.21;
		System.out.print("su precio total es de " + precioiva +" euros");
		
		

	}

}
