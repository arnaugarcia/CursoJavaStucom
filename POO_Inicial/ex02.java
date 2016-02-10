package POO_Inicial;
import java.io.*;
public class ex02 {
	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			
		} catch (Exception e) {
			System.out.println("Error al introducir los datos");
		}
	}
	public static void menu() {
        System.out.println("Introduce una opción:");
        System.out.println("[1] - Mostrar muerte");
        System.out.println("[2] - Llenar Array");
        System.out.println("[3] - Mostrar Array");
        System.out.println("[3] - Calcular tipos muerte");
        System.out.println("[3] - Reinicar Array");
    }
}
