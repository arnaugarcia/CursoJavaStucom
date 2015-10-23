package DAW_03_IF_ELSE;

import java.io.*;

public class ex05 {

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
		System.out.println("Introduce la nota 7: ");
		String var7 = buffer.readLine();
		double num7 = Double.parseDouble(var7);
		System.out.println("Introduce la nota 8: ");
		String var8 = buffer.readLine();
		double num8 = Double.parseDouble(var8);
		System.out.println("Introduce la nota 9: ");
		String var9 = buffer.readLine();
		double num9 = Double.parseDouble(var9);
		System.out.println("Introduce la nota 10: ");
		String var10 = buffer.readLine();
		double num10 = Double.parseDouble(var10);
		
		if(num1 <5 || num2 <5 || num3 <5 || num4 <5 || num5 <5 || num6 <5 || num7 <5 || num8 <5 || num9 <5 || num10 <5 ){
			System.out.println("Alguna nota suspendida");
		}else{
			System.out.println("Tots aprovats");
		}
		}
		catch(Exception e){
			System.out.println("Error al introducir los números");
		}
		

	}

}
