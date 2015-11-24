package DAW_02_InOut;

import java.io.*;

public class ex06 {

	public static void main(String[] args) {
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce nota 1: ");
			String var1=buffer.readLine();
			System.out.println("Introduce nota 2: ");
			String var2=buffer.readLine();
			System.out.println("Introduce nota 3: ");
			String var3=buffer.readLine();
			System.out.println("Introduce nota 4: ");
			String var4=buffer.readLine();
			System.out.println("Introduce nota 5: ");
			String var5=buffer.readLine();
			double num1=Double.parseDouble(var1);
			double num2=Double.parseDouble(var2);
			double num3=Double.parseDouble(var3);
			double num4=Double.parseDouble(var4);
			double num5=Double.parseDouble(var5);
			double resultado=(num1+num2+num3+num4+num5)/5;
			System.out.println("La media de las notas es: " + resultado);
		}
		catch (Exception e){
			System.out.println("Error al introducir datos");
		}

	}

}
