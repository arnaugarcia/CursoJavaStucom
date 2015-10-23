package DAW_03_IF_ELSE;

import java.io.*;

public class ex06 {

	public static void main(String[] args) {
		try{
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce número 1:");
		String var1 = buffer.readLine();
		int num1 = Integer.parseInt(var1);
		System.out.println("Introduce número 2:");
		String var2 = buffer.readLine();
		int num2= Integer.parseInt(var2);
		System.out.println("Introduce número 3:");
		String var3 = buffer.readLine();
		int num3 = Integer.parseInt(var3);
		System.out.println("Introduce número 4:");
		String var4 = buffer.readLine();
		int num4 = Integer.parseInt(var4);
		System.out.println("Introduce número 5:");
		String var5 = buffer.readLine();
		int num5 = Integer.parseInt(var5);
		int resultado1=num1%3;
		int resultado2=num2%3;
		int resultado3=num3%3;
		int resultado4=num4%3;
		int resultado5=num5%3;
		if(resultado1 == 0 ){
			System.out.println("El numero 1 es múltiple de 3");
		}
		if(resultado2 == 0 ){
			System.out.println("El numero 2 es múltiple de 3");
		}
		if(resultado3 == 0 ){
			System.out.println("El numero 3 es múltiple de 3");
		}
		if(resultado4 == 0 ){
			System.out.println("El numero 4 es múltiple de 3");
		}
		if(resultado5 == 0 ){
			System.out.println("El numero 5 es múltiple de 3");
		}
		}
		catch(Exception e){
			System.out.println("Error al introducir los números");
		}
		

	}

}