package DAW_10_Matrices;
public class ex02 {

	public static void main(String[] args) {
		int numero=1;
		int[][] numeros = new int[5][5];
		for(int i=0; i<numeros.length; i++){
			for(int j=0; j<numeros.length; j++){
				numeros[i][j]=numero++;
				System.out.print(numeros[i][j]);
			}
		}

	}

}
