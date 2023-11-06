package ejerciset1entrega;

import java.util.Scanner;

public class Ejercise2y3 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 int num1,num2,resto,diferencia;
	        System.out.print("Escribe un numero entero: ");
	        num1 = scanner.nextInt();
	        System.out.print("Escribe otro numero entero: ");
	        num2 = scanner.nextInt();
	        /*creamos el resto de dividido entre 7 para asi poder 
	        despues calcular la diferencia */
	        resto = num1 % num2;
	        // ahora calculamos la diferencia
	        diferencia = (num2 - resto) % num2;
	        System.out.println("al numero anterior le tenemos que sumar " + diferencia + " para que sea muiltiplo de " + num2);

	}

}
