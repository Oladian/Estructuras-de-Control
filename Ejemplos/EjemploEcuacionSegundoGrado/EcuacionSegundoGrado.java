public class EcuacionSegundoGrado {

	public static void main (String[] args){
		System.out.printf("%.2f%n%.2f",ResultadoPositivo(-5,3,4),ResultadoNegativo(-5,3,4));
	}

	public static double ResultadoPositivo(double a, double b, double c) {
		double operacion= (-b+Math.sqrt((b*b)-4*a*c))/(2*a);
		return operacion;
	}
		public static double ResultadoNegativo(double a, double b, double c) {
		double operacion= (-b-Math.sqrt((b*b)-4*a*c))/(2*a);
		return operacion;
	}
}