package DAW_04_Bucles;

import java.io.*;

public class ex13 {

	public static void main(String[] args) {
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce numero: ");
			String var1 = buffer.readLine();
			int num0 = Integer.parseInt(var1);
			if(num0<0){
				System.out.println("El número es menor");
			}
			if(num0>0){
				System.out.println("El número es mayor");
			}
			do{
				System.out.println("Introduce numero: ");
				String var2 = buffer.readLine();
				int num1 = Integer.parseInt(var2);
				num0=num1;
				if(num1<0){
					System.out.println("El número es menor");
				}
				if(num1>0){
					System.out.println("El número es mayor");
				}
			}while(num0!=0);
			System.out.println("Fin del programa");
		}catch(Exception e){
			System.out.println("Error al introducir los datos");
		}
	}
		
}