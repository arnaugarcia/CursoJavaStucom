package DAW_08_ArraysII;
import java.io.*;
public class ex10 {
	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce una frase:");
			String frase = buffer.readLine();
			boolean find=false;
			char caracteres[] = frase.toCharArray();
			System.out.println("Introduce la frase que quieres buscar:");
			String palabraBuscar=buffer.readLine();
			char palabraaBuscar[]=palabraBuscar.toCharArray();
			int j=0;
			for(int i=0; i<caracteres.length && j<palabraaBuscar.length; i++){
				if(caracteres[i]==palabraaBuscar[j]){
					j++;
					find=true;
				}else{
					find=false;
				}
			}
			if(find && j==palabraaBuscar.length){
				System.out.println("La plabra está en la frase");
			}else{
				System.out.println("La palabra no está en la frase.");
			}
		} catch (Exception e) {
			System.out.println("Error al introducir los datos" + e);
		}

	}

}