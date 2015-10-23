package DAW_04_Bucles;

import java.io.*;

public class ex14 {

	public static void main(String[] args) {
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			int veces = 0;
			int num = 1;
			String var = "";
			int numFinal=0;
			while(num>0){
				veces++;
				System.out.println("Introduce un número");
				var = buffer.readLine();
				num = Integer.parseInt(var);
				numFinal=numFinal+num;
			}
			System.out.println("La mitja es: " + numFinal/veces);
		}catch(Exception e){
			System.out.println("Error al introducir los datos");
		}
	}
		
}