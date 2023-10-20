package ejerciset1p2;

import java.util.Scanner;

public class Ejercise114 {

	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		System.out.print("¿está lloviendo? (true/false)");
		boolean lluvia = cs.nextBoolean();
		System.out.print("¿has terminado la tarea? (true/false) ");
		boolean tarea = cs.nextBoolean();
		System.out.print("¿tienes que ir a la biblioteca? (true/false) ");
		boolean bbtc = cs.nextBoolean();
		boolean salir = !lluvia && tarea || bbtc;
		System.out.print("¿puedes salir? "+ salir);
		
		
	}

}
