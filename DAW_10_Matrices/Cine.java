package DAW_10_Matrices;
import java.io.*;
public class Cine {

	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			String opcio="";
			String[][] cine = new String[7][8];
			for(int i=0; i<cine.length; i++){
				for(int j=0; j<cine[i].length; j++){
					cine[i][j]="*";
				}
			}
			//Comprem entrada
			while(opcio!="0"){
				System.out.println("Introduce un asiento: (X,X)");
				opcio=buffer.readLine();
				int columna = Integer.parseInt(String.valueOf(opcio.charAt(0)));
				int fila = Integer.parseInt(String.valueOf(opcio.charAt(2)));
				if(columna>7 || fila>8){
					System.out.println("La butaca no existeix");
				}else{
					if (cine[columna][fila]=="o"){
						System.out.println("La fila ja està comprada");
					}else{
						if(cine[columna][fila]=="*"){
							cine[columna][fila]="o";
						}
					}
				}
				for(int i=0; i<cine.length; i++){
					for(int j=0; j<cine[i].length; j++){
						System.out.print(cine[i][j]);
						if(j==cine[i].length-1){
							System.out.println("");
						}
					}
				}
			}
			
		} catch (Exception e) {
			System.out.println("Error al introducir los datos " + e);
		}

	}

}
