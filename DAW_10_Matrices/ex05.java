package DAW_10_Matrices;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ex05 {
	public static void main(String[] args) {
		int sumatotal=0;
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			int[][] numeros = new int[3][4];
			for(int i=0; i<numeros.length; i++){
				for(int j=0; j<numeros[i].length; j++){
					System.out.println("Introduce un número: ");
					numeros[i][j]=Integer.parseInt(buffer.readLine());
					sumatotal=sumatotal+numeros[i][j];
				}
			}
			System.out.print(sumatotal);
		}catch(Exception e){
			System.out.println("Error " + e);
		}
	}
}