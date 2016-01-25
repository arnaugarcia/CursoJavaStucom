package DAW_08_ArraysII;
import java.io.*;
public class ex08 {

	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			String[] palabra=new String [10];
			char[] letras = new char[10];
			int vocales=0;
			for(int i=0; i<palabra.length; i++){
				System.out.println("Introduce carácter " + i + ":");
				palabra[i]=buffer.readLine();
			}
			for(int i=0; i<palabra.length; i++){
				letras[i]=palabra[i].charAt(0);
				System.out.println(letras[i]);
				if(letras[i]=='a' || letras[i]=='e' || letras[i]=='i' || letras[i]=='o' || letras[i]=='u'){
					vocales++;
				}
			}
			System.out.println("El número de vocales es " + vocales);
		} catch (Exception e) {
			System.out.println("Error al introducir los datos" + e);
		}

	}

}