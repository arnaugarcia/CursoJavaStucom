package DAW_10_Matrices;
public class ex08 {

	public static void main(String[] args) {
		int[][] numero = new int[5][5];
		numero[0][0] = 1;
		numero[0][1] = 3;
		numero[0][2] = 6;
		numero[0][3] = 8;
		numero[0][4] = 7;
		numero[1][0] = 3;
		numero[1][1] = 7;
		numero[1][2] = 8;
		numero[1][3] = 0;
		numero[1][4] = 3;
		numero[2][0] = 2;
		numero[2][1] = 4;
		numero[2][2] = 3;
		numero[2][3] = 6;
		numero[2][4] = 7;
		numero[3][0] = 8;
		numero[3][1] = 9;
		numero[3][2] = 1;
		numero[3][3] = 3;
		numero[3][4] = 5;
		numero[4][0] = 5;
		numero[4][1] = 6;
		numero[4][2] = 7;
		numero[4][3] = 8;
		numero[4][4] = 5;
		for(int i=0; i<numero.length; i++){
			for(int j=0; j<numero[i].length; j++){
				System.out.print(numero[i][j]);
				if(j==4){
					System.out.println();
				}
			}
		}
		int min=0;
		int max=9;
		System.out.println("Buscamos el valor maximo y lo cambiamos por el mínimo:");
		for(int i=0; i<numero.length; i++){
			for(int j=0; j<numero[i].length; j++){
				if(numero[i][j]>=max){
					numero[i][j]=min;
				}else{
					if(numero[i][j]<=min){
						numero[i][j]=max;
					}
				}
			}
		}
		for(int i=0; i<numero.length; i++){
			for(int j=0; j<numero[i].length; j++){
				System.out.print(numero[i][j]);
				if(j==4){
					System.out.println();
				}
			}
		}
	}
}
