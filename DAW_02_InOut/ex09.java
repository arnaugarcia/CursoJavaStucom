package DAW_02_InOut;

import java.io.*;

public class ex09 {

	public static void main(String[] args) {
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce número 1: ");
			String var1=buffer.readLine();
			System.out.println("Introduce número 2: ");
			String var2=buffer.readLine();
			System.out.println("Introduce número 3: ");
			String var3=buffer.readLine();
			double a=Double.parseDouble(var1);
			double b=Double.parseDouble(var2);
			double c=Double.parseDouble(var3);
			double resultado1=(-b+Math.sqrt(-4*a*c)/2*a);
			double resultado2=(-b-Math.sqrt(-4*a*c)/2*a);
			System.out.println("El resultado en forma positiva es: " + resultado1);
			System.out.println("El resultado en forma negativa es: " + resultado2);
			
			
		}
		catch (Exception e){
			System.out.println("Error al introducir datos");
		}

	}

}
