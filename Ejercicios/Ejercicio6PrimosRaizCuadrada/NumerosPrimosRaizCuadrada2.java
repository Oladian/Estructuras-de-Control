/** Fichero NumerosPrimosRaizCuadrada.java

	Para crear el javadoc se ha usado el comando: javadoc -d doc -author -version -charset utf8 NumerosPrimosRaizCuadrada.java
	Ejercicio que calcula los números primos, haciendo que el resultado de la raíz cuadrada
	se divida entre los números primos por debajo.

@author: Izan Ortiz
@version 34
*/
public class NumerosPrimosRaizCuadrada2 {

	public static void main(String[] args) {
		long posibleNumeroPrimo=84_979;
		//long posibleNumeroPrimo=81;
		//long posibleNumeroPrimo=84;
		//long posibleNumeroPrimo=20;

		boolean verificacionDivisible235=verificarDivisibildad235(posibleNumeroPrimo);
		int valorEnteroRaizCuadrada=calcularEnteroRaizCuadrada((int)posibleNumeroPrimo);
		boolean segundaVerificacion=valorEnteroRaizCuadrada*valorEnteroRaizCuadrada==posibleNumeroPrimo;
		boolean divisiblePrimo=verificarDivisibildadPrimos(valorEnteroRaizCuadrada);
			
		boolean compuesto = verificacionDivisible235 || segundaVerificacion || divisiblePrimo;
		

		System.out.println("¿Es divisible entre 2 o 3 o 5? "+verificacionDivisible235);
		System.out.println("¿Raíz exacta? "+segundaVerificacion);
		System.out.println("divisiblePrimo "+divisiblePrimo);
		System.out.println("¿"+posibleNumeroPrimo+" es primo? "+!compuesto);
		
	}

	public static boolean verificarDivisibildad235(long numero) { //número se guarda en un espacio de memoria diferente a posibleNumeroPrimo


		boolean resultado=(numero%2==0 || numero%3==0 || numero%5==0);
		/*
		boolean resultado=false;
		if (numero%2==0 || numero%3==0 || numero%5==0) 
			resultado=false;
		else 
			resultado=true;
		*/
		return resultado;
	}

	public static int calcularEnteroRaizCuadrada(int numero) {

		int resultadoRaiz=(int)Math.sqrt(numero);

		return resultadoRaiz;
		//return(int)Math.sqrt(numero);

	}

	public static boolean verificarDivisibildadPrimos(long numero) {

		boolean resultadoPrimo=false;

		for (long i=7;i<numero/2;i++) {

			resultadoPrimo=numero%i==0;
			if (resultadoPrimo) 
				break;
		} 
		return resultadoPrimo;
	}

}
