package DAW_03_IF_ELSE;

import java.io.*;

public class ex08 {

	public static void main(String[] args) {
		try{
		BufferedReader buffer = new BufferedReader (new InputStreamReader (System.in));
		System.out.println("Introduce número 1:");
		String var1 = buffer.readLine();
		int num1 = Integer.parseInt(var1);
		System.out.println("Introduce número 2:");
		String var2 = buffer.readLine();
		int num2 = Integer.parseInt(var2);
		System.out.println("Introduce número 3:");
		String var3 = buffer.readLine();
		int num3 = Integer.parseInt(var3);
		System.out.println("Introduce número 4:");
		String var4 = buffer.readLine();
		int num4 = Integer.parseInt(var4);
		System.out.println("Introduce número 5:");
		String var5 = buffer.readLine();
		int num5 = Integer.parseInt(var5);
		System.out.println("Introduce número 6:");
		String var6 = buffer.readLine();
		int num6 = Integer.parseInt(var6);
		System.out.println("Introduce número 7:");
		String var7 = buffer.readLine();
		int num7 = Integer.parseInt(var7);
		System.out.println("Introduce número 8:");
		String var8 = buffer.readLine();
		int num8 = Integer.parseInt(var8);
		System.out.println("Introduce número 9:");
		String var9 = buffer.readLine();
		int num9 = Integer.parseInt(var9);
		System.out.println("Introduce número 10:");
		String var10 = buffer.readLine();
		int num10 = Integer.parseInt(var10);
		int zeros = 0;
		int positius = 0;
		int negatius = 0;
		int numPos = 0;
		int numNeg = 0;
		if (num1==0){
			zeros++;
		}else{
			if(num1>0){
				positius++;
				numPos=numPos+num1;
			}else{
				if(num1<0){
					negatius++;
					numNeg=numNeg+num1;
				}
			}
		}
		if (num2==0){
			zeros++;
		}else{
			if(num2>0){
				positius++;
				numPos=numPos+num2;
			}else{
				if(num2<0){
					negatius++;
					numNeg=numNeg+num2;
				}
			}
		}
		if (num3==0){
			zeros++;
		}else{
			if(num3>0){
				positius++;
				numPos=numPos+num3;
				numNeg=numNeg+num3;
			}else{
				if(num3<0){
					negatius++;
				}
			}
		}
		if (num4==0){
			zeros++;
		}else{
			if(num4>0){
				positius++;
				numPos=numPos+num4;
			}else{
				if(num4<0){
					negatius++;
					numNeg=numNeg+num4;
				}
			}
		}
		if (num5==0){
			zeros++;
		}else{
			if(num5>0){
				positius++;
				numPos=numPos+num5;
			}else{
				if(num5<0){
					negatius++;
					numNeg=numNeg+num5;
				}
			}
		}
		if (num6==0){
			zeros++;
		}else{
			if(num6>0){
				positius++;
				numPos=numPos+num6;
			}else{
				if(num6<0){
					negatius++;
					numNeg=numNeg+num6;
				}
			}
		}
		if (num7==0){
			zeros++;
		}else{
			if(num7>0){
				positius++;
				numPos=numPos+num7;
			}else{
				if(num7<0){
					negatius++;
					numNeg=numNeg+num7;
				}
			}
		}
		if (num8==0){
			zeros++;
		}else{
			if(num8>0){
				positius++;
				numPos=numPos+num8;
			}else{
				if(num8<0){
					negatius++;
					numNeg=numNeg+num8;
				}
			}
		}
		if (num9==0){
			zeros++;
		}else{
			if(num9>0){
				positius++;
				numPos=numPos+num9;
			}else{
				if(num9<0){
					negatius++;
					numNeg=numNeg+num9;
				}
			}
		}
		if (num10==0){
			zeros++;
		}else{
			if(num10>0){
				positius++;
				numPos=numPos+num10;
			}else{
				if(num10<0){
					negatius++;
					numNeg=numNeg+num10;
				}
			}
		}
		System.out.println("Números positius: "+ positius);
		System.out.println("Números negatius: " + negatius);
		System.out.println("Zeros: " + zeros);
		System.out.println("La mitja de números positius es: " + numPos/10);
		System.out.println("La mitja de números negatius es: " + numNeg/10);
		}
		catch (Exception e){
			System.out.println("Error al introducir los datos");
		}

	}

}
