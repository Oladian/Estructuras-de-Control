public class BucleConContinue2 {
	public static void main(String[] args) {
		numeroConsonantes("Pepino");
	}
/*
	public static int numeroConsonantes(String palabra) {
		int contador=0;
		for (int i=0; i<palabra.length();i++) {
			String letra=palabra.substring(i,i+1);
			if (letra.contains("a") || letra.contains("e") || letra.contains("i") || letra.contains("o") || letra.contains("u") || letra.contains(" ")) continue;
			contador++;
		}
		return contador;
	}
*/
	public static int numeroConsonantes(String palabra){
		int contador=0;
		for (int i=0; i<palabra.length(); i++){
			String letra = palabra.substring(i,i+1);
			if (letra.contains("a") || letra.contains("e") ||
				letra.contains("i") || letra.contains("o") ||
				letra.contains("u") || letra.contains(" ")){
				continue;
			}
			contador++;
		}
	return contador;
	}
}