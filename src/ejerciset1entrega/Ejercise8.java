package ejerciset1entrega;

import java.util.Scanner;

public class Ejercise8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int infan,adul;
		double preciot;
		System.out.print("introduzca el numero de entradas infantiles necesarias: ");
		infan = scanner.nextInt();
		System.out.print("introduzca el numero de entradas de adulto necesarias: ");
		adul = scanner.nextInt();
		//calculamos el precio total de las entradas  independiente al descuento
		preciot = (infan*15.5)+(adul*20) ;
		//ponemos una ternaria para saber si hay que aplicar descuento o no si es si se aplica
		preciot = preciot > 100 ?preciot * 0.95 :preciot ;
		System.out.print("el precio total seria de: "+preciot+" euros");
		
	}

}
