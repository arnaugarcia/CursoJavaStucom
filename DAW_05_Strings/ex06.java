package DAW_05_Strings;

import java.io.*;

public class ex06 {

	public static void main(String[] args) {
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce una frase: ");
			String frase = buffer.readLine();
			System.out.println(frase.toLowerCase());
			}catch(Exception e){
			System.out.println("Error al introducir los datos");
		}
	}

}
