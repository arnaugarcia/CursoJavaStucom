package DAW_05_Strings;

import java.io.*;

public class ex01 {

	public static void main(String[] args) {
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce una palabra: ");
			String palabra = buffer.readLine();
			char resultado = palabra.charAt(0);
			System.out.println("La letra inicial es: " + resultado);
			}catch(Exception e){
			System.out.println("Error al introducir los datos");
		}
	}

}
