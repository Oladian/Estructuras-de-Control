public class factorial {
	public static int calcularFactorial(int numero){
		int num=1;
		int contador=1;
			for (int n=1;n<numero;n++) {
				contador++;
				num=num*contador;
			}
			return num;
		}
	}
