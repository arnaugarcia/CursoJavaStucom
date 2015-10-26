package DAW_05_Strings;

import java.io.*;

public class ex05 {

	public static void main(String[] args) {
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce una frase: ");
			String frase = buffer.readLine();
			String cadena = frase.replace("a", "e");
			System.out.println(cadena);
			}catch(Exception e){
			System.out.println("Error al introducir los datos");
		}
	}

}
