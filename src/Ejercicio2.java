import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		/*
		 * 2. Programa que lee por teclado el valor del radio de una
		 * circunferencia y calcula y muestra por pantalla la longitud y el área
		 * de la circunferencia.
		 * 
		 * Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia
		 * = PI*Radio^2
		 */

		double radio = 0.0;
		String entrada = "";
		boolean esNumero = false;
		double resultado1 = 0.0;
		double resultado2 = 0.0;
				
		do {

			esNumero = false;
			System.out.println("Introduzca el radio de la cincurferencia: ");

			try {
				entrada = teclado.nextLine();
				radio = Double.parseDouble(entrada);
			} catch (Exception e) {
				System.out.println("ERROR: No se permiten introducir letras.");
				esNumero = true;
			}

			if (radio < 0) {
				System.out.println("ERROR: No se permiten números negativos.");
				esNumero = true;
			}
		} while (esNumero);

		
		resultado1= circunferencia(radio);
		System.out.println("El area de la circunferencia es de: "+resultado1);
		
		resultado2= longitud(radio);
		System.out.println("La longitud de la circunferencia es de: "+resultado2);
	}

	public static double circunferencia(double radio) {

		double area = 0.0;

		area = Math.PI * (radio * radio);
		return area;
	}

	public static double longitud(double radio) {

		double longitud = 0.0;
		longitud = 2 * Math.PI * radio;
		return longitud;
	}

}
