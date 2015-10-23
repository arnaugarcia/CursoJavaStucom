package DAW_04_Bucles;

import java.util.Scanner;

public class ex05 {
  
	public static void main(String[] args) {  
		        @SuppressWarnings("resource")
				Scanner scanner = new Scanner(System.in);  
		         int a=0,i,n;  
		         System.out.println("Ingrese numero");  
		         n=scanner.nextInt();  
		         for(i=1;i<(n+1);i++){  
		         if(n%i==0){  
		             a++;  
		            }  
		         }  
		         if(a!=2){  
		              System.out.println("No es Primo");  
		            }else{  
		                System.out.println("Si es Primo");  
		         }  
		     }  
		} 

