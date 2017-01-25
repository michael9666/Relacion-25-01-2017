import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner teclado=new Scanner(System.in);
				
		/*
		 * 3. Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
		 */
		
		float km = 0.0F;
		String entrada = "";
		boolean esNumero = false;
		float resultado=0.0F;
		
		do {

			esNumero = false;
			System.out.println("Introduzca los Kilómetros a convertir: ");

			try {
				entrada = teclado.nextLine();
				km = Float.parseFloat(entrada);
			} catch (Exception e) {
				System.out.println("ERROR: No se permiten introducir letras.");
				esNumero = true;
			}

			if (km < 0) {
				System.out.println("ERROR: No se permiten números negativos.");
				esNumero = true;
			}
		} while (esNumero);
		
		
		resultado = conversion(km);
		
		System.out.print("Los "+km+" km/h son "+resultado+" m/s.");
		
	}

	public static float conversion (float km) {

		float metros=0.0F;
		
		metros= (km*1000)/3600;
		return metros;
	}
		
}
