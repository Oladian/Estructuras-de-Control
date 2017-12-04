import java.util.Scanner;

public class Ecuacion1 {

	// VARIABLES LOCALES
	static double a, b, c, d, e, f; // Variables deben ser estáticas fuera del main para que se vean en cada ámbito, se inicializa en la pila y ocupan un lugar concreto

	public static void main(String[] args){
		solicitarDatos();
		System.out.println("¿Resoluble? "+ecuacionResoluble());
		if (ecuacionResoluble()) {
			System.out.println("X: "+ecuacionEquis());
			System.out.println("Y: "+ecuacionY());
		}
	}
	public static boolean ecuacionResoluble() {  //Método que identifica si la ecuación tiene solución
		boolean resoluble=(a*d)-(b*c)!=0;
		return resoluble;
	}

	public static double ecuacionEquis(){ // Método que realiza la operación para calcular X
		double x=((e*d)-(b*f))/((a*d)-(b*c));
		return x;
	}

	public static double ecuacionY(){ // Método que realiza la operación para calcular Y
		double y=((a*f)-(e*c))/((a*d)-(b*c));
		return y;
	}

	public static void solicitarDatos(){ //Método que se usará para solicitar datos

		System.out.println("Introduce los datos");
		Scanner sc = new Scanner(System.in);
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		d=sc.nextDouble();
		e=sc.nextDouble();
		f=sc.nextDouble();
		sc.close();
	}
}
