package DAW_07_Arrays;
import java.io.*;
public class ex14 {
	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			int[] numeroOriginales= new int[10];
			int signo=0;
			int zeros=0;
			for(int i=0; i<10; i++){
				System.out.println("Introduce número " + i + ":");
				numeroOriginales[i]=Integer.parseInt(buffer.readLine());
			}
			for(int i=0; i<numeroOriginales.length; i++){
				if(numeroOriginales[i]==0){
					zeros++;
				}
			}
			int[] numerosSinZeros = new int[10-zeros];
			for(int i=0, j=0; i<numeroOriginales.length; i++){
				if(numeroOriginales[i]!=0){
					numerosSinZeros[j]=numeroOriginales[i];
					j++;
				}
			}
			for(int i=0, j=1; i<numerosSinZeros.length && j<numerosSinZeros.length; i++, j++){
					if((numerosSinZeros[i]<0 && numerosSinZeros[j]>0) || (numerosSinZeros[i]>0 && numerosSinZeros[j]<0)){
						signo++;
				}
			}
			System.out.println("Hay " + signo + " cambios de signo");
		} catch (Exception e) {
			System.out.println("Error al introducir los datos" + e);
		}

	}

}
