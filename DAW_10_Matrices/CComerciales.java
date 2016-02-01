package DAW_10_Matrices;
import java.io.*;
import java.util.ArrayList;
public class CComerciales {

	public static void main(String[] args) {
		try {
			
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Número de centros comerciales: ");
			int numCC= Integer.parseInt(buffer.readLine());
			System.out.println("Número de regalos por centro comerical: ");
			int numRegalos = Integer.parseInt(buffer.readLine());
			Double[][] regalosCC = new Double[numCC][numRegalos];
			for(int i=0; i<regalosCC.length; i++){
				for(int j=0; j<regalosCC[i].length; j++){
					System.out.println("Introduce precio de regalo " + j + " para el centro comercial " + i );
					regalosCC[i][j]=Double.parseDouble(buffer.readLine());
				}
			}
			
		} catch (Exception e) {
			System.out.println("Error al introducir los datos");
		}

	}

}
