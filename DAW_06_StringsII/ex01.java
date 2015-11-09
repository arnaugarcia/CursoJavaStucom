package DAW_05_StringsII;
import java.io.*;
public class ex01 {

	public static void main(String[] args) {
		try{
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce una cadena de caracteres: ");
		String cadena1 = buffer.readLine();
		System.out.println("Introduce una cadena de carácteres: ");
		String cadena2 = buffer.readLine();
		String stringA = cadena1;
		String stringB = cadena2;
		int stringANumero = stringA.length();
		int stringBNumero = stringB.length();
		int numeroStrings = (stringANumero+stringBNumero)/2;
		String stringFinal = "";
		int conBucle=0;
		int i=0;
		int o=0;
		while(conBucle<numeroStrings){
			conBucle++;
			stringFinal = stringFinal + stringA.charAt(i) + stringB.charAt(o);
			i++;
			o++;
		}
		System.out.println(stringFinal);
		}catch(Exception e){
			System.out.println("Error al introducir los datos " + e);
		}
	}

}
