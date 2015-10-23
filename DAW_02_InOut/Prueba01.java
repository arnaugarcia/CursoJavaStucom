package DAW_02_InOut;
import java.io.*;
public class Prueba01 {
	public static void main(String[] args) {
		 
		try{

			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Como te llamas?");
			String nombre = buffer.readLine();
			System.out.println("Hola " + nombre + "!");
			System.out.println("Dime tu edad");
			String edadStr = buffer.readLine();
			int edad = Integer.parseInt(edadStr);
			System.out.println("Tu edad es " + edad + " años");
		}
		catch (Exception e){
			System.out.println("Error al introducir tu nombre o tu edad");
		}	
	}
}

