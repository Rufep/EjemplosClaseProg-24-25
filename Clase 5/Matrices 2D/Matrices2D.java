package maatrices2D;

import java.util.Iterator;

public class Matrices2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Arrays 1D --> indice para indicar la posicion
		//Arrays 2D --> 2 indice para indicar la posicion
		
		
		//1234 -->Fila 0
		//8288 -->Fila 1
		//1234 -->Fila 2

		int valores[][] = new int[3][5];//Matriz de 3 Filas * 5 Columnas
		int otra[][] = {{1,2,3},{0,5,3},{0,9,8}}; //Matriz con valores añadidos
		
		//Acceder a un elemento  de la Matriz (indicamos la fila y la columna)
		
		valores[0][0]=9;
		valores[0][1]=8;
		valores[0][2]=2;
		
		//conocer numero de filas
		
		System.out.println("Filas " + valores.length);//devuelve el numero de filas
		
		//conocer numero de elementos de una fila
		
		System.out.println("Columnas "+valores[0].length);//devuelve el numero de elementos el numero de columnas
		
		//mostrar por pantalla una matriz 2D
		
		for(int i =0; i < valores.length;i++) {
			for(int j =0; j<valores[i].length;j++) {
				System.out.print(valores[i][j]+" ");
			}
			System.out.println();
		}
		
		//detectar la posicion del pirmer 0 en una matriz 2D
			int fila=-1;
			int columna=-1;
			int posicion[]= {-1,-1};
		
			for(int i =0; i<valores.length;i++) {
				for(int j =0; j<valores[i].length; j++) {
					if(valores[i][j]==0) {
						fila=i;
						columna=j;
						
						posicion[0]=i;
						posicion[1]=j;
						
						break;
					}
				}
				if(fila !=-1) {
					break;
				}
			}
			if(fila==-1) {
				System.out.println("No Hay Ceros");
			}else {
				System.out.println("El primer cero esta en la posicio: " + fila + " " +columna );
			}
			
			//Calcular la media de la primera fila
			int suma=0;
			double media=0;
			
			for(int indiceColum=0; indiceColum < valores[0].length ; indiceColum++) {
				suma=suma+ valores[0][indiceColum];
				
			}

	
			
		}
	
	
}
