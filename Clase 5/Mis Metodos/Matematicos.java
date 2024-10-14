package misMetodos;

import java.util.Random;

public class Matematicos {
	
	//añadir metodos
	//ejemplo 1: metodo que calcula la suma de 3 numeros
	
	
	public static long suma3Numeros(int a,int b,int c) {
		
		long suma= a+b+c;
		return suma;
	}
	
	//Ejemplo 2 : Metodo que calcula el factorial de un numero : 5! ? 5*4*3*2*1
	// 0 factorial es 1
	
	public static long factorial(int numFactorial) {
		long factorial=1;
		
		if(numFactorial==0 || numFactorial==1) {
			return 1;
		}
			//for descendiente
			for(int i=numFactorial; i>=1;i--) {
				factorial=factorial*i;
			}
			return factorial;
		}
	
	//Ejemplo 3 : Metodo que indica si un numero es Primo
	
	
	public static boolean isPrimo(int numero) {
		for(int i=2 ; i<=numero/2;i++) {
			
			if(numero %i ==0) {
				return false;
			}
		}
		return true;
	}
	
	//Ejemplo 4 : metodo que llena una matriz con valores aleatorios (void porque no devuelve ningun valor por lo tanto no lleva sentencia return dentro)
	
	public static void llenarMatriz(int matriz[]) {
		Random aleatorio = new Random();
		for(int i =0 ; i<matriz.length; i++) {
			matriz[i]= aleatorio.nextInt();
		}
	}
	
	
	}
