package misMetodos;

import java.util.Arrays;

public class Tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int  n1,n2,n3;
		 
		 n1=9;
		 n2=5;
		 n3=10;
		 
		 //llamada al metodo suma
		 long suma= Matematicos.suma3Numeros(n1, n2, n3);
		 
		 System.out.println(n1 + " + " + n2 + " + " + n3 +" = " + suma);
		 
		 
		 //llamada metodo factorial
		 
		 int numero=10;
		 long fact= Matematicos.factorial(numero);
		 
		 System.out.println("Factorial de : "+ numero+" = " + fact);
		 
		 //llamada metodo isPrimo
		 
		 int numeros[]= {4,7,1,3,9,13,17,19};
		 	for(int valor:numeros) {
		 		if(Matematicos.isPrimo(valor)){
		 			System.out.print(valor+" ");
		 		}
		 	}
		 
		 //llamada metodo llenar Matriz
 			
		 	System.out.println();

		 	int numeros2[] = new int[20];
		 	Matematicos.llenarMatriz(numeros2);
		 	System.out.println(Arrays.toString(numeros2));
		 	
		//llamada metodo Escribir
		 	
		 	Escribir.matriz(numeros2);
	}

}
