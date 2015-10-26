package DAW_05_Strings;
import java.io.*;
public class ex09 {

	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce una letra: ");
			String letra1 = buffer.readLine();
			System.out.println("Introduce una letra: ");
			String letra2 = buffer.readLine();
			if(letra1.equals(letra2)){
				System.out.println("La letra es igual.");
			}else{
				System.out.println("La letra no es igual.");
			}
		} catch (Exception e) {
			System.out.println("Error al introducir los datos");
		}

	}

}
