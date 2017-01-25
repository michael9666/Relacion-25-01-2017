import java.util.Scanner;

public class Ejercicio0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. Programa que lea una cantidad de grados cent�grados y la pase a
		 * grados Fahrenheit. La f�rmula correspondiente para pasar de grados
		 * cent�grados a fahrenheit es: F = 32 + ( 9 * C / 5)
		 */

		Scanner teclado = new Scanner(System.in);

		float grados = 0.0F;
		String entrada = "";
		boolean esNumero = false;
		float resultado = 0.0F;

		do {
			esNumero = false;
			System.out.println("Introduzca los grados centigrados a convertir: ");

			try {
				entrada = teclado.nextLine();
				grados = Float.parseFloat(entrada);

			} catch (Exception e) {

				System.out.println("ERROR: No se permiten letras.");
				esNumero = true;
			}

		} while (esNumero);

		resultado = conversion(grados);

		System.out.println("La conversi�n de grados cent�grados a grados Fahrenheit es de: " + resultado + " �F");

	}

	public static float conversion(float grados) {

		float fahrenheit = 0.0F;

		fahrenheit = 32 + (9 * grados / 5);

		return fahrenheit;
	}

}
