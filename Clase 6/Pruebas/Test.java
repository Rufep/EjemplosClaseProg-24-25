package pruebas;

import java.util.Arrays;

import repaso.MetodosReturn;
import repaso.MetodosVoid;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Probar metodo Buscar Caracter
		
		String frase= "Estoy Probando";
		int posicion = MetodosReturn.buscarCaracter(frase, 's');
		
		if(posicion==-1) {
			System.out.println("El caracter no se encuentra en la Frase");
		}else {
			System.out.println("El caracter esta en la posicion : "+ posicion);
		}

		//probar metodo escribir
		
		MetodosVoid.escribir("Programar es lo mejor que hay");
		
		
		//Prueba metodo suma10
		
		int n=20;
		n=MetodosReturn.suma10(n);
		System.out.println(MetodosReturn.suma10(n));
		System.out.println("n=" + n);
		
		//prueba metodo suma10Arrays
		
		int matriz[]= {1,2,3,4,5};
		MetodosVoid.suma10Arrays(matriz);
		System.out.println(Arrays.toString(matriz));
		
		//probar metodo llenar array
		
		int matriz2[] = new int[10];
		MetodosVoid.llenarArray(matriz2);
		System.out.println(Arrays.toString(matriz2));

	}
	

}
