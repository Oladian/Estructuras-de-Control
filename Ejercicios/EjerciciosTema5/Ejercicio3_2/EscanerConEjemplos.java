import java.util.Scanner;

public class Escaner {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in); //Se crea el lector
		System.out.printf("Escribe tu nombre, un int y un double %n");

		String entradaPalabra = sc.next();
		int numeroIntLeido = sc.nextInt(); // Se guarda un int en numeroIntLeido
		double numeroDoubleLeido = sc.nextDouble(); //ATENCION: Los double hay que leerlos con coma -> 33,73 Se guarda un int en numeroDoubleLeido

		System.out.printf("Hola %s, has intrducido un int=%d y un double=%.2f",entradaPalabra,numeroIntLeido,numeroDoubleLeido);
		System.out.printf("Hola %s",entradaDeDatos);			
		sc.close(); //cierra el scanner
	}
}