package DAW_07_Arrays;
import java.io.*;
public class ex02 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		int numero[] = new int[10];
		int positius=0, negatius=0, zeros=0,positiusValor=0, negatiusValor=0;
		for(int i=0; i<10; i++){
			System.out.println("Introduce un número (positivo, negativo o zero)");
			numero[i] = Integer.parseInt(buffer.readLine());
			if(numero[i]==0){
				zeros++;
			}else{
				if(numero[i]<0){
					negatius++;
					negatiusValor=negatiusValor + numero[i];
				}else{
					if(numero[i]>0){
						positius++;
						positiusValor=positiusValor + numero[i];
					}
				}
			}
		}
		if(positius==0){
			System.out.println("La mitja de números positius: 0");
		}else{
			System.out.println("La mitja de números positius: " + positiusValor/positius);
		}
		if(negatius==0){
			System.out.println("La mitja de números negatius: 0");
		}else{
			System.out.println("La mitja de números negatius: " + negatiusValor/negatius);
		}

		System.out.println("Zeros: " + zeros);
	}

}
