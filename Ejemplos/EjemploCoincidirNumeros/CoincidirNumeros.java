import java.util.Scanner;

public class CoincidirNumeros {

	public static void main (String[] args) {


		Scanner sc= new Scanner(System.in);
		int entradaDeDatos = sc.nextInt();
		System.out.printf("%d",coincidirNumero2(entradaDeDatos));
	}

	public static int coincidirNumero2 (int numero) {
		int coincidencia=-1;
		for (int i=0; i<=numero; i++) coincidencia=i;
		return coincidencia;
	}


}