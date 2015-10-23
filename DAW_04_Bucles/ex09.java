package DAW_04_Bucles;

import java.io.*;

public class ex09 {

	public static void main(String[] args) {
		try{
		int numWhile=0;
		int numMax=0;
		int numMin=1000;
		do{
		BufferedReader buffer = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Introduce un número:");
		String var1 = buffer.readLine();
		numWhile = Integer.parseInt(var1);
		if (numWhile !=999){
		if (numWhile >numMax){
			numMax=numWhile;
			}
		if(numWhile<numMin){
			numMin=numWhile;
			}
		}
		}while(numWhile!=999);
		System.out.println("El número máximo es: " + numMax);
		System.out.println("El número mínimo es: " + numMin);
		int resultado = (numMax+numMin)/2;
		System.out.println("La media es " + resultado);
		
		}catch(Exception e){
			System.out.println("Error al introducir los datos");
		}
	}

}
