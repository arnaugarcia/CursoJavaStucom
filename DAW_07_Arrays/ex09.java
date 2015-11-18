package DAW_07_Arrays;
import java.io.*;
public class ex09 {

	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			int numero2=0;
			System.out.println("¿cuantos numeros vas a introducir?");
			int[] numeros=new int[Integer.parseInt(buffer.readLine())];
			for(int i=0; i<numeros.length; i++){
				System.out.println("Numero " + i + ":");
				numeros[i]=Integer.parseInt(buffer.readLine());
				if(numeros[i]==2){
					numero2++;
				}
			}
			System.out.println("Hay " + numero2 + " número 2 en la cadena introducida.");
		} catch (Exception e) {
			System.out.println("Error al introducir los datos");
		}

	}

}
