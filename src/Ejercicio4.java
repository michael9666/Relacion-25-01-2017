import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
				
		double cateto1=0.0;
		double cateto2=0.0;
		String entrada="";
		boolean esNumero=false;
		double resultado=0.0;
		
		do {

			esNumero = false;
			System.out.println("Introduzca el primer cateto: ");

			try {
				entrada = teclado.nextLine();
				cateto1 = Double.parseDouble(entrada);
			} catch (Exception e) {
				System.out.println("ERROR: No se permiten introducir letras.");
				esNumero = true;
			}

			if (cateto1 < 0) {
				System.out.println("ERROR: No se permiten números negativos.");
				esNumero = true;
			}		
			
		} while (esNumero);
		
		
				
		do {

			esNumero = false;
			System.out.println("Introduzca el segundo cateto: ");

			try {
				entrada = teclado.nextLine();
				cateto2 = Double.parseDouble(entrada);
			} catch (Exception e) {
				System.out.println("ERROR: No se permiten introducir letras.");
				esNumero = true;
			}

			if (cateto2 < 0) {
				System.out.println("ERROR: No se permiten números negativos.");
				esNumero = true;
			}		
			
		} while (esNumero);
		
		
		resultado=hipotenusa (cateto1, cateto2);
		System.out.print("La hipotenusa es: "+resultado);
	}

	
	public static double hipotenusa (double cateto1, double cateto2){
		
		double longitud=0.0;
		
		longitud = Math.sqrt((cateto1*cateto1) + (cateto2*cateto2));
		
		return longitud;
	}
	
		
}
