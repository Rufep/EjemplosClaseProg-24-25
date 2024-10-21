package repaso;

import java.util.Random;

public class MetodosVoid {
	
	//cuando un metodo no devuelve ningun resultado el tipo de return es void
	//metodo que devuelve un mensaje por pantalla
	
	public static void escribir(String mensaje) {
		System.out.println(mensaje);
	}
	
	
	//Metodo que le sume 10 a toda slaas posiciones de un array
	
	public static void suma10Arrays(int m[]) {
		for(int i=0;i< m.length;i++) {
			m[i]= m[i]+10;
		}
		
	}
	//Metodo que me llene un array con enteros
	
	public static void llenarArray(int m[]){
		Random aleatorio = new Random();
		for(int i =0; i<m.length;i++) {
			m[i]= aleatorio.nextInt();
		}
	}
	//Sobrecargar que permita indicar limite superior
	
	public static void llenarArray(int m[],int limiteSuperior){
		Random aleatorio = new Random();
		for(int i =0; i<m.length;i++) {
			m[i]= aleatorio.nextInt(limiteSuperior+1);
		}
	}
	
	
}
