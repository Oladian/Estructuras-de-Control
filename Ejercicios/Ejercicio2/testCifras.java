import java.util.Scanner;

public class testCifras {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); //Se crea el lector
		System.out.println("Introduzca el número para comprobar las cifras que tiene: ");
		int entradaDeDatos = sc.nextInt(); //Se guarda el número directamente con nextInt()

		int resultado=cifras.cuentaCifras(entradaDeDatos);

	
			System.out.println(entradaDeDatos+" tiene "+resultado+" cifras.");

	}
}