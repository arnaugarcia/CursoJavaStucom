package DAW_07_Arrays;
public class ex15 {

	public static void main(String[] args) {
		int[] array1 = new int[10];
		array1[0]=0;
		array1[1]=1;
		array1[2]=2;
		array1[3]=3;
		array1[4]=4;
		array1[5]=5;
		array1[6]=6;
		array1[7]=7;
		array1[8]=8;
		array1[9]=9;
		int[] array2 = new int[10];
		array2[0]=0;
		array2[1]=1;
		array2[2]=2;
		array2[3]=3;
		array2[4]=4;
		array2[5]=5;
		array2[6]=6;
		array2[7]=7;
		array2[8]=8;
		array2[9]=9;
		int[] sumaArray = new int[10];
		for(int i=0; i<array1.length; i++){
			sumaArray[i]=array1[i]+array2[i];
		}
		for(int i=0; i<array1.length; i++){
			System.out.println(sumaArray[i]);
		}
	}

}
