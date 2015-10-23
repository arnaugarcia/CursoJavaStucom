package DAW_03_IF_ELSE;

import java.io.*;

public class ex04 {

	public static void main(String[] args) {
		try{
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce la nota 1: ");
		String var1 = buffer.readLine();
		double num1 = Double.parseDouble(var1);
		System.out.println("Introduce la nota 2: ");
		String var2 = buffer.readLine();
		double num2 = Double.parseDouble(var2);
		System.out.println("Introduce la nota 3: ");
		String var3 = buffer.readLine();
		double num3 = Double.parseDouble(var3);
		System.out.println("Introduce la nota 4: ");
		String var4 = buffer.readLine();
		double num4 = Double.parseDouble(var4);
		System.out.println("Introduce la nota 5: ");
		String var5 = buffer.readLine();
		double num5 = Double.parseDouble(var5);
		System.out.println("Introduce la nota 6: ");
		String var6 = buffer.readLine();
		double num6 = Double.parseDouble(var6);
		if(num1 <0 || num2 <0 || num3 <0 || num4 <0 || num5 <0 || num6 <0 ){
			System.out.println("Algún valor negativo");
		}
		}
		catch(Exception e){
			System.out.println("Error al introducir los números");
		}
		

	}

}
