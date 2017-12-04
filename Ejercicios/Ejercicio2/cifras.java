public class cifras {
	public static int cuentaCifras(int numero){

		int cociente=numero;
		int contador=0;

		if (cociente==0) {
			return 1;
		} else {
			while (cociente!=0) {
				
				cociente=cociente/10;
				contador++;
			}

		
	}
	System.out.println("Hola");
		return contador;
	}
}
