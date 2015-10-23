package DAW_02_InOut;

import java.io.*;

public class ex02 {

	public static void main(String[] args) {
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce número1:");
			String var2 = buffer.readLine();
			System.out.println("Introduce número1:");
			String var1 = buffer.readLine();
			int varnum1 = Integer.parseInt(var1);
			int varnum2 = Integer.parseInt(var2);
			int resultado=varnum1+varnum2;
			System.out.println("La suma entre el número " + var1 + " y el número " + var2 + " es: " + resultado);
		}
		catch (Exception e){
			System.out.println("Error al introducir los datos");
		}
	}

}
