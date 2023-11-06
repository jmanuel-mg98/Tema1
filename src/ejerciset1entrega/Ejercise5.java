package ejerciset1entrega;

import java.util.Scanner;

public class Ejercise5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a,b,c,x;
		double y;
        System.out.print("Escribe el valor de A: ");
        a = scanner.nextInt();
        System.out.print("Escribe el valor de B: ");
        b = scanner.nextInt();
        System.out.print("Escribe el valor de C: ");
        c = scanner.nextInt();
        System.out.print("Escribe el valor de X: ");
        x = scanner.nextInt();
        //despejamos 
        y =(a*(x*x))+(b*x)+c;
        System.out.print("el valor de y es: " + y);

	}

}
