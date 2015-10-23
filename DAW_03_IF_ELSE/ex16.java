package DAW_03_IF_ELSE;

import java.io.*;

public class ex16 {

	public static void main(String[] args) {
		try{
			BufferedReader buffer = new BufferedReader (new InputStreamReader(System.in));
			System.out.println("Introduce el número1: ");
			String var1 = buffer.readLine();
			int num1 = Integer.parseInt(var1);
			System.out.println("Introduce el número2: ");
			String var2 = buffer.readLine();
			int num2 = Integer.parseInt(var2);
			int resultado = num1%num2;
			if(!(resultado==0)){
				System.out.println("El resto es: " + resultado);
			}else{
				System.out.println("El resto es: " + resultado);
			}
		}catch(Exception e){
			
		}

	}

}
