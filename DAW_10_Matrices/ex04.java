package DAW_10_Matrices;
public class ex04 {
	
	public static void main(String[] args) {
		char[][] caracter = new char[5][5];
		for(int i=0; i<caracter.length; i++){
			for(int j=0; j<caracter[i].length; j++){
				if(i>j){
					caracter[i][j]='-';
				}else{
					if(i<j){
						caracter[i][j]='+';
					}else{
						if(i==j){
						}
					}
				}
				System.out.print(caracter[i][j]);
			}
		}
	}
}
