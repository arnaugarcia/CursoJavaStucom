package DAW_10_Matrices;
import java.io.*;
public class ex06 {

	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			int[][] numero = new int[3][4];
			int[][] numero2 = new int[3][4];
			int[][] numero3 = new int[3][4];
			for(int i=0; i<numero.length; i++){
				for(int j=0; j<numero[i].length; j++){
					System.out.println("Introduce un número: ");
					numero[i][j]=Integer.parseInt(buffer.readLine());
					System.out.println("Introduce un número2: ");
					numero2[i][j]=Integer.parseInt(buffer.readLine());
					numero3[i][j]=numero[i][j]+numero2[i][j];
				}
			}
			for(int i=0; i<numero.length; i++){
				for(int j=0; j<numero[i].length; j++){
					System.out.print(numero3[i][j]);
				}
			}
		} catch (Exception e){
			System.out.println("Error al introducir los datos");
		}
	}
}
