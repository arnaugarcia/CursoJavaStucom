package DAW_03_IF_ELSE;

import java.io.*;

public class ex13 {

	public static void main(String[] args) {
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Factura 1:");
			System.out.println("Introduce la cantidad de litros vendidos: ");
			String var2 = buffer.readLine();
			int fac1Lit = Integer.parseInt(var2);
			System.out.println("Introduce el precio por litro: ");
			String var3 = buffer.readLine();
			double fac1PP = Double.parseDouble(var3);
			System.out.println("Factura 2:");
			System.out.println("Introduce la cantidad de litros vendidos: ");
			String var5 = buffer.readLine();
			int fac2Lit = Integer.parseInt(var5);
			System.out.println("Introduce el precio por litro: ");
			String var6 = buffer.readLine();
			double fac2PP = Double.parseDouble(var6);
			System.out.println("Factura 3:");
			System.out.println("Introduce la cantidad de litros vendidos: ");
			String var8 = buffer.readLine();
			int fac3Lit = Integer.parseInt(var8);
			System.out.println("Introduce el precio por litro: ");
			String var9 = buffer.readLine();
			double fac3PP = Double.parseDouble(var9);
			System.out.println("Factura 4:");
			System.out.println("Introduce la cantidad de litros vendidos: ");
			String var11 = buffer.readLine();
			int fac4Lit = Integer.parseInt(var11);
			System.out.println("Introduce el precio por litro: ");
			String var12 = buffer.readLine();
			double fac4PP = Double.parseDouble(var12);
			System.out.println("Factura 5:");
			System.out.println("Introduce la cantidad de litros vendidos: ");
			String var14 = buffer.readLine();
			int fac5Lit = Integer.parseInt(var14);
			System.out.println("Introduce el precio por litro: ");
			String var15 = buffer.readLine();
			double fac5PP = Double.parseDouble(var15);
			double fac1 = (fac1Lit*fac1PP);
			double fac2 = (fac2Lit*fac2PP);
			double fac3 = (fac3Lit*fac3PP);
			double fac4 = (fac4Lit*fac4PP);
			double fac5 = (fac5Lit*fac5PP);
			double facTotal = fac1+fac2+fac3+fac4+fac5;
			int facLit = fac1Lit+fac2Lit+fac3Lit+fac4Lit+fac5Lit;
			int altFac = 0;
			if(fac1>=600){
				altFac++;
			}else{
				if(fac2>=600){
					altFac++;
				}else{
					if(fac3>=600){
						altFac++;
					}else{
						if(fac4>=600){
							altFac++;
						}else{
							if(fac5>=600){
								altFac++;
							}
						}
					}
				}
			}
			
			System.out.println("Facturación total: " + facTotal);
			System.out.println("Cantidad de litros vendidos: " + facLit);
			System.out.println("Facturas superiores a 600€: " + altFac);
			
			
		}catch(Exception e){
			System.out.println("Error al introducir los datos");
		}
		

	}

}
