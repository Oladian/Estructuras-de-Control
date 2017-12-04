import java.util.Scanner;

public class Escaner {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in); //Se crea el lector
		//System.out.printf("Escribe tu nombre, un int y un double %n");
		System.out.printf("Escribe tu nombre %n");
		String entradaDeDatos = sc.nextLine(); //Se guarda la cadena directamente con nextLine()
		
/*
		String entradaPalabra = sc.next();

		//		System.out.printf("Escribe un int %n");
		int numeroIntLeido = sc.nextInt();

		//		System.out.printf("Escribe un double %n");
		double numeroDoubleLeido = sc.nextDouble(); //ATENCION: Los double hay que leerlos con coma -> 33,73

		System.out.printf("Hola %s, has intrducido un int=%d y un double=%.2f",entradaPalabra,numeroIntLeido,numeroDoubleLeido);
*/
		System.out.printf("Hola %s",entradaDeDatos);			
		sc.close(); //cierra el scanner
	}
}