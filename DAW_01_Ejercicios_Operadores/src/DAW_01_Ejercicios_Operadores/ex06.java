package DAW_01_Ejercicios_Operadores;

public class ex06 {

	public static void main(String[] args) {
		float var1=3;
		float var2=4;
		float var3=6;
		float resultado1;
		float p;
		float pa;
		float pb;
		float pc;
		float resultado_final;
		resultado1=var1+var2+var3;
		p=resultado1/2;
		pa=p-var1;
		pb=p-var2;
		pc=p-var3;
		resultado_final=p*pa*pb*pc;
		System.out.println("El resultat final es: " + Math.sqrt(resultado_final));		
	}

}
