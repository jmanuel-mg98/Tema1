package ejerciset1entrega;

import java.util.Scanner;

public class Ejercise6 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 int num,horas,min,seg;
	        System.out.print("Escribe un numero de segundos: ");
	        num = scanner.nextInt();
	        //dividimos el num de seg entre 3600 que es lo que tiene una hora
	        horas = num/ 3600;
	        // guardamos el resto de las horas y lo div entre 60 para ver los min
	        min = (num % 3600) / 60;
	        //guardamos el resto de los segundos para ver el pico
	        seg = num % 60;
	        System.out.println("estos segundos componen " + horas+" horas,"+ min + " minutos y "+ seg+ " segundos");

	        

	}

}
