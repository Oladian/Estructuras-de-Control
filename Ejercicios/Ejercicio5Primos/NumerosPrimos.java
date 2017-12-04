public class NumerosPrimos {

	public static void main(String[] args) {
		System.out.println("¿Es primo el número "+61+"?");
		System.out.println(!esNumeroPrimo(61));
	}


	public static boolean esNumeroPrimo(long posiblePrimo){

		boolean resultado=false;
		
		for (long divisor=2 ; divisor<posiblePrimo; divisor++) {
			
			resultado=posiblePrimo%divisor==0;
						
			if (resultado) {	
				break;
			}
		}
		return resultado;
	}
}