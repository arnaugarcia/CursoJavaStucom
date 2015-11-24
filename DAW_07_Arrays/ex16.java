package DAW_07_Arrays;
import java.io.*;
public class ex16 {

	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			String[] palabra = new String[30];
			char a='a',e='e',i='i',o='o',u='u';
			char[] letras=new char[30];
			for(int j=0; j<palabra.length; j++){
				System.out.println("Introduce letra número " + j +":");
				palabra[j]=buffer.readLine();
				palabra[j]=letras.charAt(i);
			}
			
		} catch (Exception e) {
			System.out.println("Error al introducir los datos");
		}

	}

}
