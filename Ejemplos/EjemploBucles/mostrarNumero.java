public class mostrarNumero {
	public static void main(String[] args) {
		//muestraListaNumeros(36);
		//muestraRangoDeNumeros(5,8);
		//muestraNumeros2(1,10,'I');
		System.out.println("====================================");
		muestraNumerosWhile3(3,22,'p');

	}

	public static void muestraListaNumeros(int num) { 
		for (int n=0;n<=num;n++) {
				System.out.println(n);	
		}
	}

	
	public static void muestraRangoDeNumeros(int num1, int num2) {
		
		if (num1<num2) {
			System.out.println("Lista: ");	
			for (int n1=num1 ; n1<=num2 ; n1++) {
				System.out.println(n1);	
			}
		} else {
			System.out.println("Rango de números no permitidos.");
		}
	}

	public static void muestraNumeros2(int num1, int num2, char letra) {

		if (num1<num2) {


			if (letra=='p' || letra=='P') {

				System.out.println("Lista de pares: ");	
				for (int n1=num1 ; n1<=num2 ; n1++) {
					if (n1%2==0)
					System.out.println(n1);	
				}		
			} else if (letra=='i' || letra=='I'){

				System.out.println("Lista de impares: ");	
				for (int n1=num1 ; n1<=num2 ; n1++) {
					if (n1%2!=0)
					System.out.println(n1);
			}

		} 
			else {
				System.out.println("Rango de números no permitidos.");
		  	}

		}

	}	

	public static void muestraNumerosWhile(int num1, int num2, char letra) {

		if (num1<num2 && (letra=='p' || letra=='P') || (letra=='i' || letra=='I')) {
			int contador=num1;

			if (letra=='p' || letra=='P') {
				System.out.println("Mostrando números pares de "+num1+" a "+num2);
				System.out.println("=========================================");
				while (contador<=num2) {
					if (contador%2==0) System.out.println(contador);
					contador++;
				}
			}

			if (letra=='i' || letra=='I') {
				System.out.println("Mostrando números impares de "+num1+" a "+num2);
				System.out.println("=========================================");
				while (contador<=num2 ) {
					if (contador%2!=0) System.out.println(contador);
					contador++;
				}
			}
		} else {

			System.out.println("Rango de números no permitidos.");			

		}
	}


	public static void muestraNumerosWhile2(int num1, int num2, char letra) {

		if (num1<num2 && (letra=='p' || letra=='P') || (letra=='i' || letra=='I')) {
			int contador=num1;


				while (contador<=num2 && (letra=='p'|| letra=='P')) {
					if (contador%2==0) System.out.println(contador);
					contador++;
				}

			
				while (contador<=num2 && (letra=='i'|| letra=='I') ) {
					if (contador%2!=0) System.out.println(contador);
					contador++;
				}

		} else {

			System.out.println("Rango de números no permitidos.");			

		}
	}

	public static void muestraNumerosWhile3(int num1, int num2, char letra) {

		if (num1<num2 && (letra=='p' || letra=='P') || (letra=='i' || letra=='I')) {
			int contador=num1;
				while (contador<=num2) {
					if ((letra=='p' || letra=='P') && contador%2==0) System.out.println(contador);
					if ((letra=='i' || letra=='I') && contador%2!=0) System.out.println(contador);
					contador++;
				}
		} else {
			if ((letra!='p' || letra!='P') || (letra!='i' || letra!='I')) System.out.println("Caracter incorrecto.");
			if (num1>num2) System.out.println("Rango incorrecto.");
			muestraRangoDeNumeros(num1,num2);
		}
	}
}