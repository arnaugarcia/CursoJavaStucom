package DAW_10_Matrices;
import java.io.*;
public class Tartaglia {

	public static void main(String[] args) {
		/*NO TERMINADO*/
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce el valor de la Tartagalia:");
			int num = Integer.parseInt(buffer.readLine());
			int[][] tartagalia = new int[num][num];
			for(int i=0; i<tartagalia.length; i++){
				for(int j=0; j<tartagalia[i].length; j++){
					
					if(j==tartagalia[i].length-1){
						System.out.println("");
					}
				}
			}
		} catch (Exception e) {
			System.out.println("Error al introducir los datos");
		}

	}

}
