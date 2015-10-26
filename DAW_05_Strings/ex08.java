package DAW_05_Strings;
import java.io.*;
public class ex08 {

	public static void main(String[] args) {
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce una Letra");
			String var = buffer.readLine();
			if(Character.isUpperCase(var.charAt(0))){
				System.out.println("Es mayúscula");
			}else{
				System.out.println("Es minúscula");
			}
		}catch (Exception e) {
			System.out.println("Error al introducir los datos");
		}

	}

}
