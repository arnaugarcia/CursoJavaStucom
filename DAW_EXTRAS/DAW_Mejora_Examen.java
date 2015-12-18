package DAW_EXTRAS;
import java.io.*;
public class DAW_Mejora_Examen {

	public static void main (String[]args){
		try{
		BufferedReader buffer = new BufferedReader (new InputStreamReader(System.in));
		boolean aniversario = false;
		System.out.println("Introduce tu velocidad: ");
		String var1 = buffer.readLine();
		int velocidad = Integer.parseInt(var1);
		System.out.println("Es tu cumpleaños (si o no)");
		String var2 = buffer.readLine();
		if(var2.equals("si")){
			aniversario = true;
		}else{
			if(var2.equals("no")){
				aniversario = false;
			}else{
				System.out.println("Error");
			}
		}
		if(!aniversario){
			if (velocidad >= 0 && velocidad <= 60){
			System.out.println("0");
			}else if (velocidad >= 61 && velocidad <= 80){
				System.out.println("1");
			}else if (velocidad >= 81){
				System.out.println("2");
			}
		}
		if(aniversario){
			if (velocidad >= 0 && velocidad <= 65){
				System.out.println("0");
			}else if (velocidad >= 66 && velocidad <= 85){
				System.out.println("1");
			}else if (velocidad >= 86){
				System.out.println("2");
			}
		}
		}catch(Exception e){
			System.out.println("Error al introducir los datos");
		}
	}

}
