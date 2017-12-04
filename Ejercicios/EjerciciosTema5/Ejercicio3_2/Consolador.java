import java.io.Console;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Consolador {

	public static void main(String[] args){

		//System.out.printf("Escribe algo: ");
		String entradaDeDatos ="";

		Console cons = System.console();


		entradaDeDatos = cons.readLine("%s","introduce un valor ");

		System.out.printf("Has introducido %s",entradaDeDatos);

	}
}
/*	
public class Consolador {
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String");
        String s = br.readLine();
        System.out.print("Enter Integer:");



        try{
            int i = Integer.parseInt(br.readLine());
        }catch(NumberFormatException nfe){
            System.err.println("Invalid Format!");
        }

        System.out.printf("String: %s",s);
    }
}
*/