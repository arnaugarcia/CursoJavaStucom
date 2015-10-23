package DAW_03_IF_ELSE;

import java.io.*;

public class ex20 {

	public static void main(String[] args) {
		try{
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce un número:");
		String var1 = buffer.readLine();
		int num = Integer.parseInt(var1);
		int resultado=num%2;
		switch(resultado){
		case 0:
			System.out.println("El número es parell.");
		break;
		default:
			System.out.println("El número es senar");
		}
		}catch(Exception e){
			System.out.println("Error al introducir los datos");
		}
	}

}
