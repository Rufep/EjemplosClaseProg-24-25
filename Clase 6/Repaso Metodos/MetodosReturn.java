package repaso;


public class MetodosReturn {

	public static int buscarCaracter(String mensaje, char c) {
		
		int posicion=-1;
		
		for(int i=0; i<mensaje.length();i++) {
			if(mensaje.charAt(i)==c) {
				posicion=i;
				break;
			}
		}
		return posicion;
	}
	
	//sobrecarga del metodo antterior que permite elegir si queremos buscar la primera o ultima aparicion del carcater
	public static int buscarCaracter(String frase, char car, boolean firstOrLast) {
		//si es true devuleve la primera posicion
		if(firstOrLast==true) {
			return buscarCaracter(frase, car);
		}
		for(int i=frase.length(); i>0; i++) {
			if(frase.charAt(i)==car) {
				return i;
			}
		};
		return car; 
	}
	
	//Metodo que  le suma 10 al parametro que recibe como argumento
	
	public static int suma10(int numero) {
		numero = numero +10;
		return numero;
	}


}
