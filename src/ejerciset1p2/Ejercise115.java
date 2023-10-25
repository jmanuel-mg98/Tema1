package ejerciset1p2;

import java.util.Scanner;

public class Ejercise115 {

	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		System.out.print("nota primer trimestre: ");
		int nota1 = cs.nextInt();
		System.out.print("nota segundo trimestre: ");
		int nota2 = cs.nextInt();
		System.out.print("nota tercer trimestre: ");
		int nota3 = cs.nextInt();
		int notame = (nota1 + nota2 + nota3)/3;
		double  notameb = (double)(nota1 + nota2 + nota3)/3;
		System.out.println("nota media aparecida en boletin:" + notame );
		System.out.print("nota media aparecida en expediente academico:" + notameb );
		
		
		

	}

}
