import java.lang.Object;
import java.lang.Number;
import java.lang.Integer;
import java.util.Scanner;

public class DoceNumeros {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.printf("Introduce el número %n");
		double numero1 = sc.nextDouble(); 
		double numero2 = sc.nextDouble();
		double numero3 = sc.nextDouble();
		double numero4 = sc.nextDouble();
		double numero5 = sc.nextDouble();
		double numero6 = sc.nextDouble();
		double numero7 = sc.nextDouble();
		double numero8 = sc.nextDouble();
		double numero9 = sc.nextDouble();
		double numero10 = sc.nextDouble();
		double numero11 = sc.nextDouble();
		double numero12 = sc.nextDouble();

		sc.close(); //cierra el scanner

		System.out.printf("==============================================%n%10.2f	%10.2f	%10.2f	%n%10.2f	%10.2f	%10.2f	%n%10.2f	%10.2f	%10.2f	%n%10.2f	%10.2f	%10.2f%n=============================================="
			,numero1,numero2,numero3,numero4,numero5,numero6,numero7,numero8,numero9,numero10,numero11,numero12);
	}
}
