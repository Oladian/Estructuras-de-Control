import java.util.Scanner;

public class testDivisible {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); //Se crea el lector
		System.out.println("Introduzca un número para calcular sus divisibles entre 2 y 3, comprendidos de 0 a N: ");
		int entradaDeDatos = sc.nextInt(); //Se guarda el número directamente con nextInt()

		int resultado=divisible.divisiblesPorDosYTres(entradaDeDatos);

	
			System.out.println(" Hay "+resultado+" números divisibles entre 2 y 3 comprendidos de 0 a "+entradaDeDatos);

	}
}