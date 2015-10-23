package DAW_03_IF_ELSE;

import java.io.*;

public class ex07 {

	public static void main(String[] args) {
		try{
		BufferedReader buffer = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Introduce numero 1:");
		String var1 = buffer.readLine();
		int num1 = Integer.parseInt(var1);
		System.out.println("Introduce número 2:");
		String var2 = buffer.readLine();
		int num2 = Integer.parseInt(var2);
		if(num1>num2){
			int resultado=num1%num2;
			if(resultado==0){
				System.out.println("Los números son múltiplos.");
			}else{
				System.out.println("Los números no son múltiplos.");
			}
		}else{
			int resultado=num2%num1;
			if(resultado==0){
				System.out.println("Los números son múltiplos.");
			}else{
				System.out.println("Los números no son múltiplos.");
			}
		}
		}catch(Exception e){
			System.out.println("Error al introducir los datos");
		}

	}

}
