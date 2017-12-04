/** Fichero NumerosPrimosRaizCuadrada.java

	Para crear el javadoc se ha usado el comando: javadoc -d doc -author -version -charset utf8 NumerosPrimosRaizCuadrada.java
	Ejercicio que calcula los números primos, haciendo que el resultado de la raíz cuadrada
	se divida entre los números primos por debajo.

@author: Izan Ortiz
@version 34
*/
public class NumerosPrimosRaizCuadrada {

	public static void main(String[] args) {
		System.out.println("3 ");
		compruebaPrimos(3);
		System.out.println("5 ");
		compruebaPrimos(5);
		System.out.println("457 ");
		compruebaPrimos(457);
		System.out.println("2 ");
		compruebaPrimos(2);
		System.out.println("4 ");
		compruebaPrimos(4);
		System.out.println("6 ");
		compruebaPrimos(6);
		System.out.println("531 ");
		compruebaPrimos(531);
	}


/** Método que nos devuelve si el número introducido es primo o no
@param numero Este parámetro del método compruebaPrimos hace la llamada del número al que realizará las operaciones para determinar si es primo o no
*/

	public static void compruebaPrimos(int numero) {

		if (numero==1 || numero==3 || numero==5) System.out.println("Primo"); 
		else {
			if (numero%2==0 || numero%3==0 || numero%5==0) System.out.println("No es primo.");
			else {
				int convertidor=(int)Math.sqrt(numero);
				int comparador=convertidor*convertidor;

				if (numero==comparador) System.out.println("No es un numero primo");
				else {

					for (int i=1; i<convertidor;i++) {
						if (i%7==0 || i%11==0 || i%13==0 || i%17==0 || i%19==0 || i%23==0) {
							System.out.println("No es un número primo.");
							break;
						} 
						else {
							System.out.println("Es primo.");
							break;
						}
					}
				}
			}
		}
	}
}