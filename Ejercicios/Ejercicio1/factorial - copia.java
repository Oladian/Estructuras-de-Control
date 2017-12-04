public class factorial {
	public static void main(String[] args){
		int numero=1;
		int contador=1;
		int factor=5;
		if (factor>=0){
			for (int n=1;n<factor;n++) {
				contador++;
				numero=numero*contador;
			}
			System.out.println("El factorial de "+factor+" es "+numero);
		} else {
			System.out.println("Número negativo no permitido");
		}
	}

}