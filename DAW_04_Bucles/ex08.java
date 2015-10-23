package DAW_04_Bucles;

import java.io.*;

public class ex08 {

	public static void main(String[] args) {
		try{
		BufferedReader buffer = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Introduce un número: ");
		String var1 = buffer.readLine();
		int num1 = Integer.parseInt(var1);
		while (num1!=0){
			num1--;
			System.out.println("El número es: " + num1);
		}
		}catch(Exception e){
			System.out.println("Error al introducir los datos");
		}

	}

}
