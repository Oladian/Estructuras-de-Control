import java.util.Scanner;

public class Numeros {
	public static void main(String[] args){


		Scanner sc = new Scanner(System.in);
		int entradaDeDatos = sc.nextInt();


		System.out.printf("Suma de 1 a N con bucle while: %d%n",calcularSumaDe1aN(entradaDeDatos));
		delUnoAlDiez(entradaDeDatos);
		System.out.printf("%n");
		deCincoEnCinco(80);
		System.out.printf("%n");
		reducirEnDos(50);
		System.out.printf("%n%n");
		System.out.printf("Sumatoria de 1 a N con bucle for: %s%nSuma de 1 a N con bucle while: %d%n",sumaDeUnoAEne(entradaDeDatos),calcularSumaDe1aN(entradaDeDatos));
		System.out.printf("%n");
		System.out.printf("Sumatoria de cuadrados: %s%n",sumaDeCuadrados(entradaDeDatos));
		sumaDeParesEImpares(entradaDeDatos);
		sumaDeParesEImparesCon1Bucle(entradaDeDatos);
		sumaDeParesEImparesConFor(entradaDeDatos);
	}

	public static void delUnoAlDiez(int numero) { // Método que cuenta de 1 en 1 hasta 10
		System.out.printf("%nDe 1 a N: %n");
		for (int i=1; i<=numero;i++){
			System.out.printf("%d ",i);
		}
	}

	public static void deCincoEnCinco(int numero) { // Método que cuenta de 5 en 5 entre 20 y N.
		System.out.printf("%nDe 5 en 5: %n");
		for (int i=20; i<=numero;i+=5){
			System.out.printf("%s ",i);
		}
	}

	public static void reducirEnDos(int numero) { // Método que resta de 2 en 2 de 100 a N.
		System.out.printf("%nReduciendo en 2: %n");
		for (int i=100; i>=numero;i-=2){
			System.out.printf("%s ",i);
		}
	}

	public static int sumaDeUnoAEne(int numero) { // Método que suma de 1 a N con bucle For.
		int sumador=0;
		for (int i=1; i<=numero;i++){
			sumador+=i;
		}
		return sumador;
	}

	public static int calcularSumaDe1aN (int numero) { // Método que suma de 1 a N con bucle While, depurado para admitir números negativos
		int sumador=0;
		int contador=0;
		int negativo=numero;
		if (numero<0) numero=-numero;
		while (contador<numero) {
			contador++;
			sumador+=contador; 
		}
		if (negativo<0) return -sumador;
		else return sumador;
	}

	public static int sumaDeCuadrados(int numero) { // Método que suma los cuadrados de 1 a N.
	int sumadorDeCuadrados=0;
		for (int i=1; i<=numero;i++){
			sumadorDeCuadrados=sumadorDeCuadrados+(i*i);
	}
	return sumadorDeCuadrados;
	}

	public static void sumaDeParesEImpares(int numero) { // Método que suma de forma independiente Pares e Impares.
		int contadorPares=1;
		int sumaPares=0;
		int sumaImpares=0;
		int contadorImpares=1;

		
		while (contadorPares<numero){
			contadorPares++;
			if (contadorPares%2==0) {
				sumaPares=sumaPares+contadorPares;
			}
		}

		System.out.printf("%nSuma de pares: %s%n",sumaPares);
	

		do {
			
			if (contadorImpares%2!=0) {
				sumaImpares=sumaImpares+contadorImpares;
			}
			contadorImpares++;
		} while (contadorImpares<=numero);

		System.out.printf("%nNumeros impares: %s%n",sumaImpares);
	}

	public static void sumaDeParesEImparesCon1Bucle(int numero) { // Método que suma de forma independiente Pares e Impares.
		int contador=0;
		int sumaPares=0;
		int sumaImpares=0;

		
		do {
			if (contador%2==0) {
				sumaPares=sumaPares+contador;
			}

			if (contador%2!=0) {
				sumaImpares=sumaImpares+contador;
			}

			contador++;
		} while (contador<=numero);

		System.out.printf("%nSuma de pares con DO WHILE: %s%n",sumaPares);
		System.out.printf("%nNumeros impares DO WHILE: %s%n",sumaImpares);
	}

	public static void sumaDeParesEImparesConFor(int numero) { // Método que suma de forma independiente Pares e Impares.
		int sumaPares=0;
		int sumaImpares=0;

		for (int i=0; i<=numero; i++) {
			if (i%2==0) {
				sumaPares=sumaPares+i;
			}
			if (i%2!=0) {
				sumaImpares=sumaImpares+i;
			}
		}
		System.out.printf("%nSuma de pares CON FOR: %s%n",sumaPares);
		System.out.printf("%nNumeros impares CON FOR: %s%n",sumaImpares);
	}
}