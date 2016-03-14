package DAW_11_POOI;
import java.io.*;
public class PasswordApp {

	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce la longitud del array:");
			Password[] array = new Password[Integer.parseInt(buffer.readLine())];
			System.out.println("Introduce la longitud de la contraseña:");
			int longPass = Integer.parseInt(buffer.readLine());
			for(int i=0; i<array.length; i++){
				array[i]=new Password(longPass); 
				System.out.println(array[i].getContrasena());
				if(array[i].esFuerte()){
					System.out.print("  La contraseña es fuerte");
				}else{
					System.out.print("  La contraseña NO es fuerte");
				}
			}
		} catch (Exception e) {
			System.out.println("Error al introducir los datos" + e);
		}

	}

}
