package DAW_07_Arrays;
import java.io.*;
public class prueba {

	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			String paraula="";
			char letras[] = new char[30];
			int vocales=0;
			char a='a',e='e',i='i',o='o',u='u';
			while(paraula.length()<=30){
				System.out.println("Introduce una palabra de 30 carácteres");
				paraula=buffer.readLine();
			}
			for(int j=0; j<letras.length; j++){
				letras[j]=paraula.charAt(i);
				if(letras[j]==a||letras[j]==e||letras[j]==o||letras[j]==u||letras[j]==i){
					vocales++;
				}
			}
		} catch (Exception e) {
			System.out.println("Error al introducir los datos" + e);
		}

	}

}
