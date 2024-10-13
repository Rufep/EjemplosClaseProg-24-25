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
		System.out.println();
		
		int valores[] = {7,9,4,5,2,6,9,2,3,1};
		
		int suma = 0;
		
		int posicion=0;
		
		while(posicion < valores.length){
			
			suma = suma +valores[posicion];
			posicion++;
			
		}
		System.out.println("El resultado de la suma de la matriz es: "+ suma);
		
		
		//Prograna que cuente cuantas veces aparece un caracter en un String
		
		System.out.println("Siguiente Apartado");
		System.out.println();
		
		String frase = "El Celta gano con nueve jugadores";
		
		//contar cuantas veces aparece la letra 'a'
			
			char letra ='a';
			int contador=0;
			
			int j = 0; //variable de control
			
			while(j<frase.length()) {
				if(frase.charAt(j)==letra) {
					contador++;
				}
					j++;
			}
			if(contador == 0) {
				System.out.println(letra + " No esta en la frase");
			}else if(contador == 1) {
				System.out.println(letra + " Aparece 1 vez");
			}else {
				System.out.println(letra + " Aparece " + contador + " veces");
			}
			
			//encontrar la posicion de la primera aparicion de un caracter en un String
			
			int posicion2=-1;//inicializo a valor absurdo
			j=0;// reseteo variable de control contaminada por algoritmo anterior
			while(j<frase.length()) {
				if(frase.charAt(j)==letra) {
					posicion2=j;
					break;//Salir precipitadamente, antes de que se deje de cumplir la condicion de continuidad
				}
				j++;
			}
			System.out.println(letra + " Aparece en la posicio: " + posicion2);

	}
	
}
