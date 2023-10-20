package ejerciset1p1;

import java.util.Scanner;

public class Ejercise16 {

	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		System.out.print("introduce un numero al azar:");
		int numero1 = cs.nextInt();
		System.out.print("introduce otro numero al azar:");
		int numero2 = cs.nextInt();
		int suma;
		suma = numero1 + numero2;
		System.out.println("su suma es " + suma);
		int resta;
		resta = numero1 - numero2;
		System.out.println("su resta es " + resta);
		int multi;
		multi = numero1 * numero2;
		System.out.println("su multiplicacion es " + multi);
		int div;
		div = numero1 / numero2;
		System.out.println("su division es " + div);

	}

}
