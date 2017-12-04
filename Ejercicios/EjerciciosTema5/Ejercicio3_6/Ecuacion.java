<<<<<<< HEAD
/** Clase Ecuacion
	que contiene los métodos
	para resolver un sistema de
	dos ecuaciones con dos
	incógnitas.
	@author Izan
	@version 1.0
	javadoc -d doc -author -version -charset utf8 Ecuacion.java

**/
public class Ecuacion {
	/** Método que identifica si la ecuación tiene solución
	@param a double coeficiente x de la primera ecuacion
	@param b double coeficiente y de la primera ecuacion
	@param c double coeficiente x de la primera ecuacion
	@param d double coeficiente y de la primera ecuacion
	@return resultado true si es resoluble, false al contrario 
=======
/**
* Creación de la clase Ecuación, que tendrá los métodos necesarios para solucionar sistemas de ecuaciones
* con X e Y.
*
* @author Izan Ortis
* @version 1.3
*/

public class Ecuacion {

	/** 
	* Método ecuacionResoluble, identifica si la ecuación tiene solución
	* @param a
	* @param b
	* @param c
	* @param d
	* @return devuelve la solucion
>>>>>>> f5ae04d297ed3ded29b451aabc466e0463c3eacb
	*/
	public static boolean ecuacionResoluble(double a, double b,double c, double d) {  //Método que identifica si la ecuación tiene solución
		boolean resoluble=(a*d)-(b*c)!=0;
		return resoluble;
	}
	/** Método que realiza la operación para calcular X 
	@param a double coeficiente x de la primera ecuacion
	@param b double coeficiente y de la primera ecuacion
	@param c double coeficiente x de la primera ecuacion
	@param d double coeficiente y de la primera ecuacion
	@param e double coeficiente independiente de la primera ecuacion
	@param f double coeficiente independiente de la segunda ecuacion
	@return devuelve el valor de X en tipo double
	**/
	public static double ecuacionEquis(double a, double b, double c, double d, double e, double f){ // Método que realiza la operación para calcular X
		double x=((e*d)-(b*f))/((a*d)-(b*c));
		return x;
	}
	/** Método que realiza la operación para calcular Y 
	@param a double coeficiente x de la primera ecuacion
	@param b double coeficiente y de la primera ecuacion
	@param c double coeficiente x de la primera ecuacion
	@param d double coeficiente y de la primera ecuacion
	@param e double coeficiente independiente de la primera ecuacion
	@param f double coeficiente independiente de la segunda ecuacion
	@return devuelve el valor de Y en tipo double
	**/
	public static double ecuacionY(double a, double b,double c, double d, double e, double f){ // Método que realiza la operación para calcular Y
		double y=((a*f)-(e*c))/((a*d)-(b*c));
		return y;
	}
}
