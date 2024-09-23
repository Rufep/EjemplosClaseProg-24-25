package Tema2Ejemplos;


import java.util.Arrays;

public class Matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Matrices o Arrays
		
			float temperaturas[];//declaracion de la matriz corchetes antes o despues de la variable tengo que asignarle un tamaño
			temperaturas =new float[10];// dandole el tamaño al array
			
			//Meter una temperatura en la posición 0
			
			temperaturas[0] = 12.5f;
			//...
			temperaturas[1]=12.5f;
			temperaturas[2]=19.56f;
			
			//mostrar por pantalla los valores del array 
			
				System.out.println(temperaturas[0]); //muestra el valor en la posición 0
				
			//mostrar los valores usando la funcion Arrays
				System.out.println(Arrays.toString(temperaturas));
				
			//declaracion e inicializacion del array
				
				int notas[]= {3,2,7,8,9,5};//ya asignamos los valores que contiene el array pasando los valores entre corchetes
				notas[3]=0;//modificamos el valor en la posicion 3
				
			//saber el tamño del array
				
				int capacidad = notas.length;
				System.out.println("capacidad = " + capacidad);
			
			//acceder a la ultima posicion del array de forma segura
				
				notas[notas.length-1] = 10;
				
		   //metodos de la libreria Arrays
				
				//ordenar Arrays de menor a mayor
					
					Arrays.sort(notas);
					System.out.println("Array notas Ordenado = " + Arrays.toString(notas));
				
				//buscar el valor 6 si no esta nos devuleve un numero negativo que seria su posicion -1
					
					int posicion = Arrays.binarySearch(notas,7);
					System.out.println("el valor 7 esta en la posicion = "+ posicion);
				
				//realizar copias de un Array
					
					int original[] = {1,2,3,4}; 
					int copia[];
					 
					//copia = original esto no esta copiando el array tendo 2 arrays en el que copia apunta a la zona de memoria de original pero no tengo una copia de este no hacer esto
					
					copia = Arrays.copyOf(original, original.length); //el array a copiar el tamaño de la copia
					
					//modificamos el valor 0 en el original como lo hacemos despues de haber copiado el array original en la copia no se modifica el valor en la copia solo se modifica el array original
					
					original[0]=90;
					
					//mostramos ambos arrays
					
					System.out.println("Array original = " + Arrays.toString( original));
					System.out.println("Array copiado = " +Arrays.toString(copia));
					
					
	}

}
