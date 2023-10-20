package ejerciset1p1;

import java.util.Scanner;

public class Ejercise13 {

	public static void main(String[] args) {
		System.out.print("que año es?");
		Scanner cs = new Scanner(System.in);
		int aAhora = cs.nextInt();
		System.out.print("en que año naciste?");
		int aNacio= cs.nextInt();
		int edadAct= aAhora-aNacio;
		System.out.print("su edad es:" + edadAct+" años");
		

	}

}
