public class divisible {
	public static int divisiblesPorDosYTres(int numero){

		int contador=0;

		for (int n=0; n<numero; n++ ) {
			if (n%2==0 && n%3==0) contador++;

		}

		return contador;
	}
}