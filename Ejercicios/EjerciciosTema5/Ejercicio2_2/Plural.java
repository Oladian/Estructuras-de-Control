public class Plural {
	public static void main(String[] args){


	//	convertirAPlural(args[0]);
		convertirAPlural("suspenso");

	}

	public static void convertirAPlural(String palabra){

		String frase=palabra;
		boolean terminaConAOEAguda=frase.endsWith("á") || frase.endsWith("ó") || frase.endsWith("é");

		boolean terminaConEVocalAtonaOY= frase.endsWith("a") || frase.endsWith("e")
										|| frase.endsWith("i") || frase.endsWith("o") || frase.endsWith("u")
										|| frase.endsWith("ey");

		boolean terminaConSoX=frase.endsWith("s") || frase.endsWith("x");

		boolean terminaConLRNDZJ=frase.endsWith("l") || frase.endsWith("r") || frase.endsWith("n")
										|| frase.endsWith("j") || frase.endsWith("z") || frase.endsWith("j");

		boolean terminaConIoU=frase.endsWith("í") || frase.endsWith("ú");

		if (terminaConAOEAguda) System.out.println(frase=frase+"s");

		if (terminaConEVocalAtonaOY || terminaConLRNDZJ || terminaConIoU) System.out.println(frase=frase+"es");

		if (terminaConSoX) System.out.println(frase);
	}
}