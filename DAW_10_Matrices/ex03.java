package DAW_10_Matrices;
import java.io.*;
public class ex03 {

	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			int[][] numeros = new int[4][4];
			for(int i=0; i<numeros.length; i++){
				for(int j=0; j<numeros.length; j++){
					System.out.println("Introduce número:");
					numeros[i][j]=Integer.parseInt(buffer.readLine());
				}
			}
			for(int i=0; i<numeros.length; i++){
				for(int j=0; j<numeros.length; j++){
					System.out.println(numeros[i][j]);
				}
			}
		} catch (Exception e) {
			System.out.println("Error al introducir los datos");
		}

	}

}
