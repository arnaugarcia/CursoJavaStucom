package DAW_02_InOut;

import java.io.*;

public class ex08 {

	public static void main(String[] args) {
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce euros: ");
			String var1=buffer.readLine();
			double euros=Double.parseDouble(var1);
			double resultado=euros*134.47823;
			System.out.println(euros + " convertido a yenes son: " + resultado);
		}
		catch (Exception e){
			System.out.println("Error al introducir datos");
		}

	}

}
