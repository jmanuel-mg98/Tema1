package ejerciset1p1;

import java.util.Scanner;

public class Ejercise14 {

	public static void main(String[] args) {
		System.out.print("nota 1:");
		Scanner cs = new Scanner(System.in);
		int nota1 = cs.nextInt();
		System.out.print("nota 2:");
		int nota2 = cs.nextInt();
		double media = (nota1 +nota2)/2;
		System.out.print("nota media:" + media);
				
		
	}

}
