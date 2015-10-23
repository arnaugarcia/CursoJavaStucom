package DAW_04_Bucles;

import java.io.*;

public class ex17 {

	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce un número de 5 cifras: ");
			String var = buffer.readLine();
			int numero = Integer.parseInt(var);
			int resultado = 0;
			resultado = numero/10000;
			System.out.println(resultado);
			resultado = numero/1000;
			System.out.println(resultado);
			resultado = numero/100;
			System.out.println(resultado);
			resultado = numero/10;
			System.out.println(resultado);
			System.out.println(numero);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
