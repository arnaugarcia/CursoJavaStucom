package DAW_07_Arrays;
import java.io.*;
public class ex14 {

	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			int[] numeroOriginales= new int[10];
			int signo=0;
			for(int i=0; i<10; i++){
				System.out.println("Introduce número " + i + ":");
				numeroOriginales[i]=Integer.parseInt(buffer.readLine());
			}
			
			for(int i=0, j=1; i<10-1 && j<11-1; i++, j++){
					if((numeroOriginales[i]<0 && numeroOriginales[j]>0) || (numeroOriginales[i]>0 && numeroOriginales[j]<0)){
						signo++;
				}
			}
			System.out.println("Hay " + signo + " cambios de signo");
		} catch (Exception e) {
			System.out.println("Error al introducir los datos" + e);
		}

	}

}
