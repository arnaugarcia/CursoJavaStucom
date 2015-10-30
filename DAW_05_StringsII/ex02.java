package DAW_05_StringsII;
import java.io.*;
public class ex02 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce una cadena de caracteres con dos gg: ");
			String var1 = buffer.readLine();
			int numeroCadena = var1.length();
			int conBucle=-1;
			int i=-1;
			int o=0;
			String cadena1;
			String cadena2;
			String sumaCadenas;
			while(conBucle<numeroCadena && o!=numeroCadena-1 ){
				conBucle++;
				i++;
				o++;
				cadena1=var1.valueOf(var1.charAt(i));
				cadena2=var1.valueOf(var1.charAt(o));
				sumaCadenas = cadena1.concat(cadena2);
				if(sumaCadenas.equals("gg")){
					System.out.println("true");
				}else{
					System.out.println("false");
				}
			}
		} catch (Exception e) {
			System.out.println("Error al introducir los datos. Error:" + e);
		}

	}

}
