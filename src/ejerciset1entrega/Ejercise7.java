package ejerciset1entrega;

import java.util.Scanner;

public class Ejercise7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int mm,cm,m;
		double suma;
        System.out.print("indica una distancia en milimetros: ");
        mm = scanner.nextInt();
        System.out.print("indica una distancia en centimetros: ");
        cm = scanner.nextInt();
        System.out.print("indica una distancia en metros: ");
        m = scanner.nextInt();
        //realizamos la suma pasando los datos de mm y m a cm
        suma = (mm*10)+ cm+(m/100);
        System.out.print("la suma de estas longitudes en cm es: " + suma+" cm");
        
        

	}

}
