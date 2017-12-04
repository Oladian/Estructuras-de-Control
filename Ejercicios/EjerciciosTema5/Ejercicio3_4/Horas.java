import java.lang.Object;
import java.lang.Number;
import java.lang.Integer;

public class Horas {
	public static void main(String[] args){

		int horas=Integer.parseInt(args[0]);
		int minutos=Integer.parseInt(args[1]);
		int segundos=Integer.parseInt(args[2]);

		if (horas<0 || horas>23) {
			System.out.printf("Hora no válida%n");
			return;
		} else {
			if (minutos<0 || minutos>59){
				System.out.printf("Minuto no válido%n");
				return;
			} else {
				if (segundos<0 || segundos>59) { 
					System.out.printf("Segundo no válido%n");
					return;
				} else {
					System.out.printf("%n==========================%nHora válida: %d:%d:%d",horas,minutos,segundos);
				}
			}
		}
	}
}
/*
public class Horas {
	public static void main(String[] args){

		int horas=Integer.parseInt(args[0]);
		int minutos=Integer.parseInt(args[1]);
		int segundos=Integer.parseInt(args[2]);

		if (horas<0 || horas>23) {
			System.out.printf("Hora no válida%n");
			return;
		}
		
		if (minutos<0 || minutos>59){
			System.out.printf("%nMinuto no válido%n");
			return;
		} 
		
		if (segundos<0 || segundos>59) { 
			System.out.printf("%nSegundo no válido%n");
			return;
		}
		
		System.out.printf("%n==========================%nHora válida: %d:%d:%d",horas,minutos,segundos);
	}
}
*/