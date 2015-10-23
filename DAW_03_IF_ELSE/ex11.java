package DAW_03_IF_ELSE;

import java.io.*;

public class ex11 {

	public static void main(String[] args) {
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce número 1: ");
			String var1 = buffer.readLine();
			int num1 = Integer.parseInt(var1);
			System.out.println("Introduce número 2: ");
			String var2 = buffer.readLine();
			int num2 = Integer.parseInt(var2);
			System.out.println("Introduce número 3: ");
			String var3 = buffer.readLine();
			int num3 = Integer.parseInt(var3);
			if(num1>num2 && num1>num3){
				System.out.println("El numero 1 (" + num1 + ") es más grande.");
			}else{
				if(num2>num1 && num2>num3){
					System.out.println("El numero 2 (" + num2 + ") es más grande.");
				}else{
					if(num3>num1 && num3>num2){
						System.out.println("El numero 3 (" + num3 + ") es más grande.");
					}
				}
			}
		}
		catch(Exception e){
			System.out.println("Error al introducir los números");			
		}

	}

}
