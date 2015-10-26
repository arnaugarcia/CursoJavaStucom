package DAW_05_Strings;

import java.io.*;

public class ex02 {

	public static void main(String[] args) {
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce una palabra: ");
			String palabra1= buffer.readLine();
			System.out.println("Introduce una palabra: ");
			String palabra2= buffer.readLine();
			if(palabra1.equals(palabra2)){
				System.out.println("Las palabras son iguales");
			}else{
				System.out.println("Las palabras no son iguales");
			}
			}catch(Exception e){
			System.out.println("Error al introducir los datos");
		}

	}

}
