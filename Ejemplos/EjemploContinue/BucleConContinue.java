public class BucleConContinue {
	public static void main(String[] args) {
		
		for (int i=1;i<20;i++) {

			System.out.println("El valor de i es "+i);
			if (i%2!=0) {
				continue;
			}
			System.out.println("Número par");
		}
	}

	public static int numeroConsonantes(String palabra) {
		int contador=0;
		for (int i=0; i<palabra.length();i++) {
			String letra=palabra.substring(i,i+1);
			if (letra.contains("a") || letra.contains("e") || letra.contains("i") || letra.contains("o") || letra.contains("u") || letra.contains(" ")) continue;
			contador++;
		}
		return contador;
	}
}