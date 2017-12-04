import java.util.Scanner;

public class Cifras {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in); //Se crea el lector

		System.out.printf("Introduce el número %n");
		int entradaDeDatos = sc.nextInt(); //Se guarda la cadena directamente con nextLine()

		sc.close(); //cierra el scanner
		//comprobación de negativos, si es se pasa a positivo

		if (entradaDeDatos<0) {
			entradaDeDatos=entradaDeDatos*(-1); // -> entradaDeDatos*=(-1)
		}

		//comprobamos que tiene tres cifras
		if (entradaDeDatos < 100 || entradaDeDatos >999){
			//salimos del programa
			System.out.printf("%n===========================%nNo es un número de 3 cifras %n===========================%n");
		} else {
			System.out.printf("%n===========================%nSí es un número de 3 cifras %n===========================%n");
			//conversión a cadena
			//TRUCO: concatenar el int a cadena vacía
			String nEntradaDeDatos=entradaDeDatos+""; // -> Casting a cadena a cualquier tipo PRIMITIVO

			for (int i=0;i<3;i++) {
				System.out.printf("Cifra: %2s%n",nEntradaDeDatos.charAt(i));
			}
		}
	}
}