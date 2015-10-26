package DAW_05_Strings;

import java.io.*;

public class ex04 {

	public static void main(String[] args) {
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce una frase: ");
			String palabra1= buffer.readLine();
			System.out.println("La frase: " + palabra1 + " tiene " + palabra1.length() + " carácteres.");
			
			}catch(Exception e){
			System.out.println("Error al introducir los datos");
		}

	}

}
