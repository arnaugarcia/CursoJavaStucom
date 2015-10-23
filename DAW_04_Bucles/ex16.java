package DAW_04_Bucles;

import java.io.*;

public class ex16 {

	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce numero de sueldos: ");
			String var1 = buffer.readLine();
			int numeroSueldos = Integer.parseInt(var1);
			String var2 = "";
			int sueldo = 0;
			int sueldoFinal = 0;
			while (numeroSueldos!=0){
				numeroSueldos--;
				System.out.println("Introduce sueldo de la persona " + numeroSueldos);
				var2=buffer.readLine();
				sueldo = Integer.parseInt(var2);
				if(sueldo>sueldoFinal){
					sueldoFinal=sueldo;
				}
			}
			System.out.println("El sueldo més grande es de : " + sueldoFinal);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
