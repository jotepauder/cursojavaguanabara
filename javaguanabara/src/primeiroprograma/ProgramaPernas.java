// switch -> Escolha, se � isso for isso e se isso n�o for aquilo 

package primeiroprograma;

import java.util.Scanner;

public class ProgramaPernas {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Quantas pernas?");
		int perna = teclado.nextInt();
		String tipo;
		System.out.println("Isso � um(a) ");
		switch (perna) {
		case 1:
			tipo = "Saci";
			break;
		case 2:
			tipo = "B�pede";
			break;
		case 3:
			tipo = "Trip�";
			break;
		case 4:
			tipo = "Quadr�pide";
			break;
		case 6:
			tipo = "Aranha";
			break;
		default:
			tipo = "ET";
			break;
		}

		System.out.print(tipo);
	}
}
