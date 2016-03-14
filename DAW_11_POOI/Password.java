package DAW_11_POOI;
public class Password {
	private int longitud=8;
	private String contrasena;
	public Password(){	
	}
	public Password(int longitud){
		this.longitud=longitud;
		this.contrasena=generaPassword();
	}
	public boolean esFuerte(){
		int mayus=0;
		int minus=0;
		int num=0;
		for(int i=0; i<contrasena.length(); i++){
			if(Character.isUpperCase(contrasena.charAt(i))){
				mayus++;
			}
			if(Character.isLowerCase(contrasena.charAt(i))){
				minus++;
			}
			if(Character.isDigit(contrasena.charAt(i))){
				num++;
			}
		}
		if(mayus>2 && minus>1 && num>5){
			return true;
		}else{
			return false;
		}
		
	}
	private String generaPassword(){
		String passFinal="";
		String passTemp = "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
		for(int i=0; i<longitud; i++){
			passFinal=passFinal+String.valueOf(passTemp.charAt((int) (62*Math.random()+0)));
		}
		return passFinal;
	}
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
}