package DAW_10_Matrices;
public class ex07 {

	public static void main(String[] args) {
		int[][] numero = new int[5][5];
		numero[0][0] = 1;
		numero[0][1] = 3;
		numero[0][2] = 6;
		numero[0][3] = 8;
		numero[0][4] = 0;
		numero[1][0] = 9;
		numero[1][1] = 2;
		numero[1][2] = 8;
		numero[1][3] = 5;
		numero[1][4] = 3;
		numero[2][0] = 2;
		numero[2][1] = 4;
		numero[2][2] = 3;
		numero[2][3] = 6;
		numero[2][4] = 7;
		numero[3][0] = 8;
		numero[3][1] = 9;
		numero[3][2] = 0;
		numero[3][3] = 4;
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
		System.out.println("Diagonal invertida:");
		int x=0;
		int y=5;
		int z=0;
		for(int i=0; i<numero.length; i++){
			for(int j=0; j<numero[i].length; j++){
				if(i==x){
					numero[i][j+z]=y;
					System.out.print(numero[i][j]);
					x++;
					z++;
					y--;
				}else{
					System.out.print(numero[i][j]);
				}
				if(j==4){
					System.out.println();
				}
			}
		}
	}
}
