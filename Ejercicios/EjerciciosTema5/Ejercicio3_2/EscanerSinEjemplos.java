import java.util.Scanner;

public class EscanerSinEjemplo {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in); //Se crea el lector
		System.out.printf("Escribe tu nombre %n");
		String entradaDeDatos = sc.nextLine(); //Se guarda la cadena directamente con nextLine()
		
		System.out.printf("Hola %s",entradaDeDatos);			
		sc.close(); //cierra el scanner
	}
}