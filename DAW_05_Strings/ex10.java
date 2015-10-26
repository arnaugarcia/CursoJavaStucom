package DAW_05_Strings;
import java.io.*;
public class ex10 {

	public static void main(String[] args) {
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce una Letra:");
			String var = buffer.readLine();
			int numeroCaracteres = var.length();
			while(numeroCaracteres!=0){
				if(Character.isLowerCase(var.charAt(numeroCaracteres-1))){
					System.out.println("Es minúscula");
				}else{
					System.out.println("Es mayúscula");
				}
				numeroCaracteres--;
			}
		}catch (Exception e) {
			System.out.println("Error al introducir los datos" + e);
		}

	}

}
