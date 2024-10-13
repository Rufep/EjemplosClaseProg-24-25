package ejemplosBucles;

import java.util.Random;

public class BucleForMejorado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int valores[] = new int[10];
		Random aleatorio = new Random();
		
		for(int i=0; i < valores.length ;i++) {
			valores[i]=	aleatorio.nextInt(0,21);
		}

		//mostrar por pantalla con un bucle for mejorado(foreach)
		//Se utiliza solo cuando el bucle implica leer todos los valores de la matriz desde el principio hasta el final
		//y no se puede modificar la matriz (Solo lectura)
		
		for(int valor:valores){
			//Por cada valor en el array valores muestralo por pantalla
			// es lo mismo que for(valor=0; valor<valores.length;valor++ )
			System.out.print(valor + "  ");
		}
		
		//calcular la Suma
		
		int suma=0;
		for(int s:valores) {
			suma=suma+s;
		}
	}

}
