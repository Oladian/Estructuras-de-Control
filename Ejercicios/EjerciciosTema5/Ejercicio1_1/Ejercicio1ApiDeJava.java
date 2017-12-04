public class Ejercicio1ApiDeJava {
	public static void main(String[] args){

		contain("puede ser una frase");
		cointain2("puede ser una frase");
		terminaCon("puede ser una frase");
		igualesIgnoraMinMay("puede ser una frase");
		estaVacio("puede ser una frase");
		empiezaCon("puede ser una frase");
		caracterEn("puede ser una frase");
		longitudCadena("puede ser una frase");
		reemplazarCadena("puede ser una frase");
		aMayus("puede ser una frase");
		aMinus("PUEDE SER UNA FRASE");
		devuelveSubcadena("puede ser una frase");
	}

	public static void contain(String palabra){

		int contador=0;
		for (int i=0;i<palabra.length();i++) {
			String letra=palabra.substring(i,i+1);
		
		if (letra.contains("a") || letra.contains("e") || 
			letra.contains("i") || letra.contains("o") || 
			letra.contains("u")) {
				contador++;

			}

		}
		System.out.println(palabra+" tiene "+contador+" vocales");
	}

	public static void cointain2(String s) {

		String cadena=s;
		boolean contiene=cadena.contains("er");
		System.out.printf("¿La cadena %s contiene%s %b%n ",cadena, " er? ",contiene);
	}

	public static void terminaCon(String s) {

		String cadena=s;
		boolean termina=cadena.endsWith("ase");
		System.out.printf("¿La cadena %s termina%s %b%n ",cadena, " ase? ",termina);
	}

	public static void igualesIgnoraMinMay(String s) {

		String cadena=s;
		boolean iguales=cadena.equalsIgnoreCase("PUEDE SER UNA FRASE");
		System.out.printf("¿La cadena %s es igual a%s %b%n ",cadena, " PUEDE SER UNA FRASE? ",iguales);
	}	

	public static void estaVacio(String s) {

		String cadena=s;
		boolean vacio=cadena.isEmpty();
		System.out.printf("¿La cadena %s está vacía? %b%n ",cadena,vacio);
	}

	public static void empiezaCon(String s) {

		String cadena=s;
		boolean empieza=cadena.startsWith("pued");
		System.out.printf("¿La cadena %s empieza con a%s %b%n ",cadena, " pued? ",empieza);
	}

	public static void caracterEn(String s) {

		String cadena=s;
		System.out.printf("El caracter en la posición 4 es %s %n",(cadena.charAt(3)));
	}

	public static void longitudCadena(String s) {

		String cadena=s;
		System.out.printf("La longitud de %s es de %s caracteres %n",cadena,cadena.length());
	}

	public static void reemplazarCadena(String s) {

		String cadena=s;
		System.out.printf("%s ha sido reemplazado por %s %n",cadena,cadena.replace('e','i'));
	}

		public static void aMayus(String s) {

		String cadena=s;
		System.out.printf("%s convertida a mayúsculas -> %s %n",cadena,cadena.toUpperCase());
	}

		public static void aMinus(String s) {

		String cadena=s;
		System.out.printf("%s convertida a minúsculas -> %s %n",cadena,cadena.toLowerCase());
	}

		public static void devuelveSubcadena(String s) {

		String cadena=s;
		System.out.printf("%s nos devuelve la subcadena -> %s en la posicion 7 %n",cadena,cadena.substring(15));
	}
}