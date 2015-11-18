package DAW_07_Arrays;
import java.io.*;
public class ex08 {

	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce un número: (0-255)");
			int numero=Integer.parseInt(buffer.readLine());
			int[] binario=new int[8];
			for(int i=0; numero!=0; i++){
				binario[i]=numero%2;
				numero=numero/2;
			}
			for(int i=7; i!=0; i--){
				System.out.print(binario[i]);
			}
		} catch (Exception e) {
			System.out.print("Error al introducir los datos" + e);
		}

	}

}
