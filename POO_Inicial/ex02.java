package POO_Inicial;
import java.io.*;
public class ex02 {
	static String[] muertes = new String[5];
	static int muerteA=0, muerteB=0, muerteC=0,opcio=0;;
	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			llenarArray();
			while (opcio!=6){
				menu();
				opcio = Integer.parseInt(buffer.readLine());
				switch(opcio){
				case 1:
					mostrarArray();
					break;
				case 2:
					tiposMuerte();
					break;
				case 3:
					reiniciarArray();
					break;
				case 4:
					System.exit(0);
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("Error al introducir los datos");
		}
	}
	private static void menu() {
        System.out.println("Introduce una opción:");
        System.out.println("[1] - Mostrar muerte");
        System.out.println("[2] - Contar veces muertes");
        System.out.println("[3] - Reiniciar vector");
        System.out.println("[4] - Salir");
    }
	private static void mostrarArray(){
		System.out.println("Mostrando muertes");
		for(int i=0; i<5; i++){
			System.out.println("Muerte número " + i + " tiene el valor " + muertes[i]);
					
		}
	}
	private static void llenarArray(){
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			for(int i=0; i<5; i++){
				System.out.println("Introduce muerte número " + i);
				muertes[i]=buffer.readLine();
				if(muertes[i].equals("a")){
					muerteA++;
				}else if(muertes[i].equals("b")){
					muerteB++;
				}else if(muertes[i].equals("c")){
					muerteC++;
				}else{
					System.out.println("Error");
					i--;
				}
			}
		} catch (Exception e) {
			System.out.println("Error al introducir los datos");
		}
	}
	private static void reiniciarArray(){
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			muerteA=0; muerteB=0; muerteC=0; 
			for(int i=0; i<5; i++){
				System.out.println("Introduce muerte número " + i);
				muertes[i]=buffer.readLine();
				if(muertes[i].equals("a")){
					muerteA++;
				}else if(muertes[i].equals("b")){
					muerteB++;
				}else if(muertes[i].equals("c")){
					muerteC++;
				}
			}
		} catch (Exception e) {
			System.out.println("Error al introducir los datos");
		}
	}
	private static void tiposMuerte(){
		for(int i=0; i<5; i++){
			if(muertes[i].equals("a")){
				muerteA++;
			}else if(muertes[i].equals("b")){
				muerteB++;
			}else if(muertes[i].equals("c")){
				muerteC++;
			}
		}
		System.out.println("Veces muerto de la forma A " + muerteA );
		System.out.println("Veces muerto de la forma B " + muerteB );
		System.out.println("Veces muerto de la forma C " + muerteC );
	}
}