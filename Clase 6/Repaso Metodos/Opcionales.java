package repaso;

public class Opcionales {

	public static int sumaNumeros(int x , int y ) {
		return x+y;
		
	}
	public static int sumaNumeros(int x , int y , int z) {
		return x+y+z;
		
	}
	
	//pasar un numero opcional de enteros el numero de argumentos que puedo pasar es opcionnal
	
	public static int sumaNumeros(int... x ) {
		//para sumar todos los valores
		int suma = 0;
		for(int i =0; i<x.length; i++) {
			suma = suma+ x[i];
		}
		return suma;
	}
}
