package DAW_10_Matrices;
import java.io.*;
import java.util.ArrayList;
public class CComerciales {

	public static void main(String[] args) {
		try {
			int opcio=0, precioMax=Integer.MIN_VALUE, precioMin=Integer.MAX_VALUE, precioMaxCC=0, precioMinCC=0;
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Número de centros comerciales: ");
			int numCC= Integer.parseInt(buffer.readLine());
			System.out.println("Número de regalos por centro comerical: ");
			int numRegalos = Integer.parseInt(buffer.readLine());
			Double[][] regalosCC = new Double[numCC][numRegalos];
			int[] precios = new int[numCC];
			for(int i=0; i<regalosCC.length; i++){
				for(int j=0; j<regalosCC[i].length; j++){
					System.out.println("Introduce precio de regalo " + j + " para el centro comercial " + i );
					regalosCC[i][j]=Double.parseDouble(buffer.readLine());
				}
			}
			while(opcio!=4){
				System.out.println("Elige una opción:");
				System.out.println("[1] - Donde ir a comprar");
				System.out.println("[2] - Donde no ir a comprar");
				System.out.println("[3] - Hoy me siento deportista");
				System.out.println("[4] - Salir");
				opcio=Integer.parseInt(buffer.readLine());
				switch(opcio){
				case 1:
					for(int i=0; i<regalosCC.length; i++){
						for(int j=0; j<regalosCC[i].length; j++){
							precios[i]=(int) (regalosCC[i][j]+precios[i]);
							if(precios[i]<precioMin){
								precioMin=precios[i];
								precioMinCC=i;
							}
						}
					}
					System.out.println("El centro comercial " + precioMinCC + " es el más barato, con un precio total de: " + precioMin);
					break;
				case 2:
					for(int i=0; i<regalosCC.length; i++){
						for(int j=0; j<regalosCC[i].length; j++){
							precios[i]=(int) (regalosCC[i][j]+precios[i]);
							if(precios[i]>precioMax){
								precioMax=precios[i];
								precioMaxCC=i;
							}
						}
					}
					System.out.println("El centro comercial " + precioMaxCC + " es el más caro, con un precio total de: " + precioMax);
					break;
				case 3:
					for(int i=0; i<regalosCC.length; i++){
						for(int j=0; j<regalosCC[i].length; j++){
						}
					}
					break;
				case 4:
					System.out.println("Sortint...");
					break;
					default:
						System.out.println("Opción errónea, vuelve a intentar lo");
				}
			}
		} catch (Exception e) {
			System.out.println("Error al introducir los datos " + e);
		}

	}

}
