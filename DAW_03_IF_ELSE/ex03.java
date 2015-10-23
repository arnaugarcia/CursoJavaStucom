package DAW_03_IF_ELSE;

import java.io.*;

public class ex03 {

	public static void main(String[] args) {
		try{
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce la nota 1: ");
		String var1 = buffer.readLine();
		int num1 = Integer.parseInt(var1);
		int resultado1=num1%2;
		int resultado2=num1%5;
		if(resultado1 == 0 ){
			System.out.println("El numero es múltiple de 2");
		}else{
			System.out.println("El numero no es múltiple de 2");
		}
		if(resultado2 == 0 ){
			System.out.println("El numero es múltiple de 5");
		}else{
			System.out.println("El numero no es múltiple de 5");
		}
		}
		catch(Exception e){
			System.out.println("Error al introducir los números");
		}
		

	}

}