public class BucleConBreak {
	public static void main(String[] args) {

		int posibleNumeroPrimo=23;
		boolean resultado=false;

		for (int divisor=2 ; divisor<posibleNumeroPrimo ; divisor++) {
			
			resultado=posibleNumeroPrimo%divisor==0;
			//if (posibleNumeroPrimo%divisor==0) System.out.println(divisor);	
			
			if (resultado) {
				System.out.println("No primo");				
				break;
			}
		}

		if (resultado==false) System.out.println("Primo");
		Primos(100);
		System.out.println("==============================");
		System.out.println("¿Es primo el número "+559+"?");
		System.out.println(!esNumeroPrimo(559));

	}

	public static void Primos(int numero) {

		boolean resultado=false;
		for (int i=1;i<numero;i++) {

			if (i==3 || i==5 || i==7) System.out.println(i);
			if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0 && i%9!=0) System.out.println(i);
		}
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