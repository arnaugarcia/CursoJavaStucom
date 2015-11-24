package DAW_07_Arrays;
import java.io.*;
public class ex14 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			int[] numeroOriginales= new int[10];
			numeroOriginales[0]=1;
			numeroOriginales[1]=0;
			numeroOriginales[2]=0;
			numeroOriginales[3]=-5;
			numeroOriginales[4]=0;
			numeroOriginales[5]=-4;
			numeroOriginales[6]=3;
			numeroOriginales[7]=-2;
			numeroOriginales[8]=0;
			numeroOriginales[9]=1;
			int signo=0;
			int zeros=0;
			/*for(int i=0; i<10; i++){
				System.out.println("Introduce número " + i + ":");
				numeroOriginales[i]=Integer.parseInt(buffer.readLine());
			}*/
			for(int i=0; i<numeroOriginales.length-1; i++){
				if(numeroOriginales[i]==0){
					zeros++;
				}
			}
			int[] numerosSinZeros = new int[10-zeros];
			for(int i=0; i<numeroOriginales.length-1; i++){
				if(numeroOriginales[i]!=0){
					numeroOriginales[i]=numerosSinZeros[i];
				}
			}
			for(int i=0, j=1; i<10-1 && j<11-1; i++, j++){
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
