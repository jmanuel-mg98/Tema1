package ejerciset1entrega;

import java.util.Scanner;

public class Ejercise9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 int num1,num2;
		 boolean igual;
	        System.out.print("Escribe un numero entero: ");
	        num1 = scanner.nextInt();
	        System.out.print("Escribe otro numero entero: ");
	        num2 = scanner.nextInt();
	        igual = num1==num2;
	        System.out.print("¿estos numeros son iguales? "+igual);
	}

}
