package DAW_03_IF_ELSE;

import java.io.*;

public class ex17 {

	public static void main(String[] args) {
		try{
			BufferedReader buffer = new BufferedReader (new InputStreamReader(System.in));
			System.out.println("Introduce nota: ");
			String var1 = buffer.readLine();
			double nota = Double.parseDouble(var1);
			if(nota<4.99){
				System.out.println("Suspens");
			}else{
				if(nota<6.99){
					System.out.println("Aprovat");
				}else{
					if(nota<8.99){
						System.out.println("Notable");
					}else{
						if(nota<9.99){
							System.out.println("Excel·lent");
						}else{
							if(nota>=10.0){
								System.out.println("Matrícula de honor");
							}
						}
					}
				}
			}
		}catch(Exception e){
			
		}
	}

}
