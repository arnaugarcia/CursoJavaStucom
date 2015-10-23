package DAW_02_InOut;

import java.io.*;

public class ex04 {
	public static void main(String[] args) {
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce número 1: ");
			String var1=buffer.readLine();
			System.out.println("Introduce número 2: ");
			String var2=buffer.readLine();
			int num1=Integer.parseInt(var1);
			int num2=Integer.parseInt(var2);
			int suma=num1+num2;
			int resta=num1-num2;
			int mult=num1*num2;
			int div=num1/num2;
			int mod=num1%num2;
			System.out.println("La suma de los numeros introducidos es: " + suma);
			System.out.println("La resta de los numeros introducidos es: " + resta);
			System.out.println("La multipliación de los numeros introducidos es: " + mult);
			System.out.println("La división de los numeros introducidos es: " + div);
			System.out.println("La módulo de los numeros introducidos es: " + mod);
			
		}
		catch (Exception e){
			System.out.println("Error al introducir datos");
		}

	}

}
