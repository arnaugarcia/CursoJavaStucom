package DAW_07_ArraysII;
import java.io.*;
public class ex10 {
	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce una frase:");
			String frase = buffer.readLine();
			boolean find=false;
			char caracteres[] = new char[frase.length()];
			for(int i=0; i<caracteres.length; i++){
				caracteres[i]=frase.charAt(i);
			}
			System.out.println("Introduce la frase que quieres buscar:");
			String palabraBuscar=buffer.readLine();
			char palabraaBuscar[]=new char[palabraBuscar.length()];
			for(int i=0; i<palabraaBuscar.length; i++){
				palabraaBuscar[i]=palabraBuscar.charAt(i);
			}
			for(int i=0,j=0; i<caracteres.length && j<palabraaBuscar.length; i++){
				if(caracteres[i]==palabraaBuscar[j] && palabraaBuscar[palabraaBuscar.length-1]!=caracteres[caracteres.length-2] ){
					j++;
					find=true;
				}else{
					find=false;
				}
			}
			if(find){
				System.out.println("La plabra está en la frase");
			}else{
				System.out.println("La palabra no está en la frase.");
			}
		} catch (Exception e) {
			System.out.println("Error al introducir los datos" + e);
		}

	}

}