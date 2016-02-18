package DAW_07_Avanzados;
import java.io.*;
public class CarreraHormigas {
	public static void main(String[] args) {
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));				
			System.out.println("Número de hormigas:");
			int numHormigas = Integer.parseInt(buffer.readLine());
			System.out.println("Longitud de la pista (número de posició):");
			int numPos = Integer.parseInt(buffer.readLine());
			while (numHormigas > numPos){
				System.out.println("Error: el número de posiciones no puede ser superior al de hormigas!");
				System.out.println("Número de hormigas:");
				numHormigas = Integer.parseInt(buffer.readLine());
				System.out.println("Longitud de la pista (número de pos.):");
				numPos = Integer.parseInt(buffer.readLine());
			}
			int pista[] = new int [numPos];
			int max = 0;
			int min = numPos;
			for (int i=1; i <= numHormigas; i++){
				System.out.println("Posició formiga " + i + ":");
				int pos = Integer.parseInt(buffer.readLine());
				pos -= 1;
				while (pista[pos] != 0){
					System.out.println("Error: posició ocupada!");
					System.out.println("Posició formiga " + i + ":");
					pos = Integer.parseInt(buffer.readLine());
					pos -= 1;
				}
				pista[pos] = i;
				pos += 1;
				if ((numPos/2) > pos){
					if (((numPos/2) - pos) < min)
						min = ((numPos/2) - pos);
					if (((numPos/2) - pos) > max)
						max = ((numPos/2) - pos);
				}
				if ((numPos/2) < pos){
					if ((pos - (numPos/2)) < min)
						min = (pos - (numPos/2));
					if ((pos - (numPos/2)) > max)
						max = (pos -(numPos/2));
				}				
				if ((numPos/2) == pos){
					min = 0;
					max = 0;
				}
			}
			int minim = (numPos/2) - min;
			int maxim = (numPos/2) + max;
			System.out.println("Mínim: " + minim);
			System.out.println("Máxim: " + maxim);
		}
		catch (Exception e){
			System.out.println("Error " + e);
		}
	}
}
