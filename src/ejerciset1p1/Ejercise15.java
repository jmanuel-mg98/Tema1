package ejerciset1p1;

import java.util.Scanner;

public class Ejercise15 {

	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		System.out.print("introduce el radio:");
		double radio = cs.nextDouble();
		double longitud = 2* Math.PI*radio;
		System.out.println("la longitud es de "+ longitud+"cm");
		double area = Math.PI* Math.pow( radio , 2);
		System.out.print("el area es de "+ area +"cm");
		
	

	}

}
