import java.util.Scanner;

public class TestEcuacion {
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);

		/*
		x+y=1			a*x+b*y=e
		2*x+2*y=2		c*x+d*=f

		2*x+y=7
		-x+2*y=-1

		double a=1;
		double b=1;
		double c=2;
		double d=2;
		double e=1;
		double f=2;

		
		double a=2;
		double b=1;
		double c=-1;
		double d=1;
		double e=7;
		double f=-1;
		*/


		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double d=sc.nextDouble();
		double e=sc.nextDouble();
		double f=sc.nextDouble();

		System.out.printf("%n%n%n%.0f*X+%.0f*Y=%.0f%n___________%n%.0f*x+%.0f*y=%.0f%n",a,b,e,c,d,f);

		boolean resoluble=Ecuacion.ecuacionResoluble(a,b,c,d);
		double ecuacionX=Ecuacion.ecuacionEquis(a,b,c,d,e,f);
		double ecuacionY=Ecuacion.ecuacionY(a,b,c,d,e,f);

		System.out.printf("%n¿Es resoluble? %s%n",resoluble,ecuacionX,ecuacionY);
		if (resoluble) System.out.printf("%nX=%.2f%nY=%.2f%n",ecuacionX,ecuacionY);
	}
}