package DAW_05_StringsII;
import java.io.*;
public class ex03 {

@SuppressWarnings("static-access")
public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce una cadena de caracteres con dos gg: ");
			String var1 = buffer.readLine();
			int numeroCadena = var1.length();
			int conBucle=-1;
			int a=-1;
			int b=0;
			int c=1;
			int d=2;
			int e=3;
			int f=4;
			String cat = null,dog = null;
			String cadena1,cadena2,cadena3,cadena4,cadena5,cadena6,sumaCat,sumaDog;
			while(conBucle<numeroCadena && f!=numeroCadena-1 ){
				conBucle++;
				a++;
				b++;
				c++;
				d++;
				e++;
				f++;
				cadena1=var1.valueOf(var1.charAt(a));
				cadena2=var1.valueOf(var1.charAt(b));
				cadena3=var1.valueOf(var1.charAt(c));
				cadena4=var1.valueOf(var1.charAt(d));
				cadena5=var1.valueOf(var1.charAt(e));
				cadena6=var1.valueOf(var1.charAt(f));
				sumaCat = cadena1.concat(cadena2+cadena3);
				sumaDog = cadena4.concat(cadena5+cadena6);
				if(sumaCat.equals("cat")){
					 cat = "true";
				}else{
					if(sumaDog.equals("dog")){
						dog = "true";
					}
				}
			}
			if(cat=="true" && dog=="true"){
				System.out.println("TRUE");
			}else{
				System.out.println("FALSE");
			}
		} catch (Exception e) {
			System.out.println("Error al introducir los datos. Error:" + e);
		}

	}

}
