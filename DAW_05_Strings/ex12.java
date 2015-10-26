package DAW_05_Strings;
import java.io.*;
public class ex12 {

	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce DNI:");
			String NIF = buffer.readLine();
			int NIFNumero = NIF.length();
			int i = 0;
			boolean res = true;
			if(NIF.isEmpty()){
				System.out.println("DNI vacío");
			}else{
				if(NIFNumero==9){
					if(Character.isLetter(NIF.charAt(8))){
						while(i!=7){
							i++;
							if(Character.isDigit(NIF.charAt(i))){
								
							}else{
								i=7;
								res=false;
								System.out.println("DNI no válido, hay letras en los números.");
							}
						}
						if(res){
							System.out.println("DNI válido");
						}
					}else{
						System.out.println("DNI no válido");
					}
				}else{
					System.out.println("DNI no valido, tiene letras de más o de menos.");
				}
			}
		} catch (Exception e) {
			System.out.println("Error al introducir los datos");
		}

	}

}
