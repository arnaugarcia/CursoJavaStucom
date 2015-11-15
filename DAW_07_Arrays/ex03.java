package DAW_07_Arrays;
import java.io.*;
public class ex03 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		int numero[] = new int[10];
		int positius=0, negatius=0, zeros=0;
		for(int i=0; i<10; i++){
			System.out.println("Introduce un número (positivo, negativo o zero)");
			numero[i] = Integer.parseInt(buffer.readLine());
			if(numero[i]==0){
				zeros++;
			}else{
				if(numero[i]<0){
					negatius++;
				}else{
					if(numero[i]>0){
						positius++;
					}
				}
			}
		}
		System.out.println("Numeros positius: " + positius);
		System.out.println("Números negatius: " + negatius);
		System.out.println("Zeros: " + zeros);
	}

}