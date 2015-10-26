package DAW_05_Strings;

import java.io.*;

public class ex03 {

	public static void main(String[] args) {
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce una frase: ");
			String frase1= buffer.readLine();
			System.out.println("Introduce una frase: ");
			String frase2= buffer.readLine();
			System.out.println(frase1+frase2);
			
			}catch(Exception e){
			System.out.println("Error al introducir los datos");
		}

	}

}
