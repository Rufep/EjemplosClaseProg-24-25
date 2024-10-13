package ejemplosBucles;

import java.util.Arrays;
import java.util.Random;

public class BucleFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//Programa que muestra los numeros entre n y m
		
		int n=10, m = 45;
		
		int i = n;//variable de control
		
		for(i=n;i <= m;i++) {
			if(i<m) {
				System.out.print(i+"  , ");

			}else {
				System.out.print(i);
			}
		}
		System.out.println();
		
		//llenar un array de enteros con valores aleatorios entre n y m
		
		n=-10;
		m=10;
		
		int valores[]= new int [10];
		Random aleatorio = new Random();
		
		for(i=0; i < valores.length ;i++) {
			valores[i]=	aleatorio.nextInt(n,m+1);
		}
			System.out.println("Array Generado");
		System.out.println(Arrays.toString(valores));

		//obtener la posicion del primer numero negativo
		
		int posicion = -1;
		
		for(i=0;i<valores.length;i++) {
			
			if(valores[i]<0) {
				
				posicion =i;
				break;
			}
		}
		if(posicion ==-1) {
			System.out.println("No Hay numeros negativos");
		}else {
			System.out.println("El Primer numero negativo esta en la posicion: "+posicion);
		}
		
		//comprobar si hay algun numero impar
		boolean encontrado=false;
		
		for(i=0;i < valores.length;i++) {
			if(valores[i]%2!=0) {
				encontrado=true;
				break;
			}
		}
		if(!encontrado) {
			System.out.println("No Hay numeros Impares");
		}else {
			System.out.println("hay almenos un numero Impar");
		}
		//calcular la media del array
		int suma=0;
		double media=0;
		for(i=0;i< valores.length;i++) {
			suma=suma+valores[i];
		}
		media= (double)suma / valores.length;
		System.out.println("La media de los valores es: "+media);
	}
}
