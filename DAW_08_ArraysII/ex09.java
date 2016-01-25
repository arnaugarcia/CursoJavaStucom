package DAW_08_ArraysII;
import java.io.*;
public class ex09 {

	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			String[] palabra=new String [10];
			char[] letras = new char[10];
			for(int i=0; i<palabra.length; i++){
				System.out.println("Introduce carácter " + i + ":");
				palabra[i]=buffer.readLine();
			}
			for(int i=0; i<palabra.length; i++){
				letras[i]=palabra[i].charAt(0);
				if(letras[i]=='a' || letras[i]=='e' || letras[i]=='i' || letras[i]=='o' || letras[i]=='u'){
					if(letras[i]=='a'){
						System.out.println("La letra numero " + i +  " es la vocal a");
					}else{
						if(letras[i]=='e'){
							System.out.println("La letra numero " + i +  " es la vocal e");
						}else{
							if(letras[i]=='o'){
								System.out.println("La letra numero " + i +  " es la vocal o");
							}else{
								if(letras[i]=='i'){
									System.out.println("La letra numero " + i +  " es la vocal i");
								}else{
									if(letras[i]=='u'){
										System.out.println("La letra numero " + i +  " es la vocal u");
									}
								}
							}
						}
					}
				}else{
					System.out.println("la letra numero " + i + " con valor " + letras[i] + " no es una vocal");
				}
			}
		} catch (Exception e) {
			System.out.println("Error al introducir los datos" + e);
		}
	}

}
