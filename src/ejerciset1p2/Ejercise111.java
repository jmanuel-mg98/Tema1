package ejerciset1p2;

import java.util.Scanner;

public class Ejercise111 {

	public static void main(String[] args) {
		System.out.print("introduzca kilos de manzanas vendidos: ");
		Scanner cs = new Scanner(System.in);
		double kManzanas =cs.nextDouble();
		System.out.print("introduzca kilos de peras vendidos: ");
		double kPeras =cs.nextDouble();
		double beneficios;
		beneficios = kManzanas*2.35 + kPeras*1.95;
		System.out.print("el beneficio obtenido es de " + beneficios + " euros");
		
		
		
	}

}
