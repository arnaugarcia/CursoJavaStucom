package DAW_11_POOI;

public class Zombie {
	
	private String nombre="Arnau";
	private int anoConversion=2;
	private int nivel=10;
	private int[] pConversion=new int [5];
	

	public Zombie(){}
	public Zombie(String nombre,int anoConversion, int nivel, int[] pConversion){
		
		this.nombre=nombre;
		this.anoConversion=anoConversion;
		this.nivel=nivel;
		this.pConversion=pConversion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getanoConversion() {
		return anoConversion;
	}
	public void setanoConversion(int anoConversion) {
		this.anoConversion = anoConversion;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public int[] getpConversion() {
		return pConversion;
	}
	public void setpConversion(int[] pConversion) {
		this.pConversion = pConversion;
	}
	
	
	public int MejorAo(int per[]){
		int maxpos=0;
		int cantidad=0;
		
		for(int i=0;i < per.length;i++){
			if(per[i]> cantidad){
				maxpos= i+1;
				cantidad=per[i];
			}
		}
		return maxpos;
	}
	
	public int maxConver(int per[]){
		int cantidad=0;
		for(int i=0;i < per.length;i++){
			if(per[i]> cantidad){
				cantidad=per[i];
			}
		}
		return cantidad;
	}
	
	public int mediaConver(int per[]){
		int media=0;
		
		for(int i=0;i<per.length;i++){
			media=media + per[i];
		}
		media=media/per.length;
		return media;
	}
	
	public int totalConver(int per[]){
		int total=0;
		for(int i=0;i<per.length;i++){
			total=total + per[i];
		}
		return total;
	}
	
	public boolean haConver(int per[]){
		boolean con =false;
		for(int i=0;i<per.length;i++){
			if(per[i]>0){
				con=true;
			}
		}
		return con;
	}
	
	public boolean esBueno(int nivel){
		boolean Bueno=false;
		if(nivel>7 &&nivel <10){
			Bueno=true;
		}
		return Bueno;
	}
	
	
}
