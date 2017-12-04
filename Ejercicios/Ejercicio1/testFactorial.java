import java.util.Scanner;

public class testFactorial {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); //Se crea el lector
		System.out.println("Introduzca el número para hacer su factorial: ");
		int entradaDeDatos = sc.nextInt(); //Se guarda el número directamente con nextInt()

		int resultado=factorial.calcularFactorial(entradaDeDatos);

		if (entradaDeDatos>=0) {
			System.out.println("El factorial de "+entradaDeDatos+" es "+resultado);
		}
		else {
			System.out.println("El número introducido es negativo");	
		}

	}
}