package DAW_03_IF_ELSE;

import java.io.*;

public class ex12 {

	public static void main(String[] args) {
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce número de horas semanales: ");
			String var1 = buffer.readLine();
			int hores = Integer.parseInt(var1);
			if(hores<=40){
				System.out.println("Has treballat " + hores + " hores, per tant cobraràs : " + hores*16);
			}else{
				if(hores>40){
					int resultado=((hores-40)*20)+640;
					System.out.println("Has treballat " + hores + " hores, per tant cobraràs : " + resultado);
				}
			}
		}
		catch(Exception e){
			System.out.println("Error al introducir los números");			
		}

	}

}
