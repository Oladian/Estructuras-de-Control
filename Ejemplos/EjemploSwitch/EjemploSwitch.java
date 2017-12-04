public class EjemploSwitch {

	public static void main(String[] args) {
		usandoSwtich('j');
	}


	public static void usandoSwtich(char dia){

		switch (dia) {
			case 'l': 
				System.out.println("Lunes");
				break;
			case 'm': 
				System.out.println("Martes");
				break;
			case 'x': 
				System.out.println("Miércoles");
				break;
			case 'j': 
				System.out.println("Jueves");
				break;
			case 'v': 
				System.out.println("Viernes");
				break;
			case 's': 
				System.out.println("Sábado");
				break;
			case 'd': 
				System.out.println("Domingo");
				break;
			default:
				System.out.println("No corresponde esa letra "+dia);
		}
		
	}
}