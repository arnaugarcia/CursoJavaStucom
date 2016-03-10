package DAW_11_POOI;
import java.io.*;

public class Electrodomestico {

	private int precioBase;
	private String color;
	private char consumoEnergetico;
	private	int	peso;
	
	public Electrodomestico() {
		this.precioBase=500;
		this.color="blanco";
		this.consumoEnergetico='F';
		this.peso=5;
	}
	public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso){
		this.precioBase=precioBase;
		this.color=color;
		compruebaColor();
		this.consumoEnergetico=consumoEnergetico;
		compruebaEnergia();

	}
	private void compruebaColor(){
		if(!(this.color.equals("blanco") || this.color.equals("negro") || this.color.equals("azul") || this.color.equals("gris"))){
			this.color="blanco";
		}
	}
	private void compruebaEnergia(){
		if(!(this.consumoEnergetico=='A' || this.consumoEnergetico=='B' || this.consumoEnergetico=='C' || this.consumoEnergetico=='D' || this.consumoEnergetico=='E' || this.consumoEnergetico=='F')){
			this.consumoEnergetico='F';
		}
	}
	public int precioFinal(){
		int precioFinal=this.precioBase;
		if(this.consumoEnergetico=='A'){
			precioFinal+=100;
		} else if(this.consumoEnergetico=='B'){
			precioFinal+=80;
		} else if(this.consumoEnergetico=='C'){
			precioFinal+=60;
		} else if(this.consumoEnergetico=='D'){
			precioFinal+=50;
		} else if(this.consumoEnergetico=='E'){
			precioFinal+=30;
		} else if(this.consumoEnergetico=='F'){
			precioFinal+=10;
		}
		
		if(this.peso<0 && this.peso>19){
			precioFinal+=10;
		}else if(this.peso<20 && this.peso>49){
			precioFinal+=50;
		}else if(this.peso<50 && this.peso>79){
			precioFinal+=80;
		}else if(this.peso>80){
			precioFinal+=100;
		}
		return precioFinal;
	}
	public int getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}
	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}

}
