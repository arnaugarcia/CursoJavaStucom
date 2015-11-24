package DAW_06_StringsII;
import java.io.*;
public class ex04 {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce una cadena de caracteres con *: ");
			String var1 = buffer.readLine();
			int numeroCadena = var1.length();
			int conBucle=-1;
			int i=0;
			String cadena1="";
			String cadena2="";
			String cadena3="";
			String resultado="";
			while(conBucle<numeroCadena && i!=numeroCadena-1 ){
				conBucle++;
				i++;
				cadena1=var1.valueOf(var1.charAt(i));
				if(var1.contains("*")){
					while(cadena1!="*" && resultado!="TRUE"){
						cadena2=var1.valueOf(var1.charAt(cadena1.length()-1));
						cadena3=var1.valueOf(var1.charAt(cadena1.length()+1));
						if(cadena2.equals(cadena3)){
							System.out.println("TRUE");
							resultado="TRUE";
							}else{
							System.out.println("FALSE");
							resultado="TRUE";
						}
					}
				}else{
					System.out.println("No contiene *.");
				}
			}
		} catch (Exception e) {
			System.out.println("Error al introducir los datos. Error:" + e);
		}

	}

}
