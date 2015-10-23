package DAW_02_InOut;

import java.io.*;

public class ex07 {

	public static void main(String[] args) {
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce el año en que naciste: ");
			String var1=buffer.readLine();
			int año=Integer.parseInt(var1);
			int resutltado=2014-año;
			System.out.println("Tienes: " + resutltado);
		}
		catch (Exception e){
			System.out.println("Error al introducir datos");
		}
	}

}
