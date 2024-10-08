package ejemplosBucles;

import java.util.Scanner;

public class BucleWhile {
	/**
	 * progama que muestra n * asteriscos por pantalla siendo n una variable
	 * que el usuario introduce por teclado
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce el Valor para N: ");
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		//n = 3 --> ***
		//n = 4 --> ****
		
		//todo bucle utiliza una o mas variables para establecer:
		//condicion de continuidad(mientras la condicion se cumpla el bucle se va a seguir ejecutando y cuando deje de cumplirse el bucle termina)
		
		int i = 1;//variable de control 
		/**
		 * mientras i sea menor que el valor introducido por el usuario por teclado
		 * pinta un asterisco
		 */
		while(i<=n) {
			
			System.out.print("*");
			i++;
		}
		System.out.println();

		//sumar todos los valores almacenados en una Matriz
		System.out.println("Siguiente apartado");
		
		
		
		
		
	}

}
