package DAW_07_Arrays;
import java.io.*;
public class ex13 {
	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Escribe una palabra:");
			String palabra= buffer.readLine();
			int longitudPalabra=palabra.length();
			boolean palindromo=true;
			char[] palabraIzquierda = new char[longitudPalabra];
			char[] palabraDerecha = new char[longitudPalabra];
			int j=0;
			for(int i=longitudPalabra-1; i>=0; i--){
				palabraIzquierda[j]=palabra.charAt(i);
				j++;
			}
			for(int i=0; i<=longitudPalabra-1; i++){
				palabraDerecha[i]=palabra.charAt(i);
			}
			for(int i=0; i<=longitudPalabra-1 && palindromo==true; i++){
				if(palabraIzquierda[i]==palabraDerecha[i]){
					palindromo=true;
				}else{
					palindromo=false;
				}
			}
			if(palindromo){
				System.out.println("Es un palíndromo");
			}else{
				System.out.println("No es un palíndromo");
			}
		} catch (Exception e) {
			System.out.println("Error al introducir los datos" + e);
		}

	}

}
