package buclesAnidados;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



public class ForAnidado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Programa que genere la siguiente salida
		//* * * * *
		//* * * * *
		//* * * * *
		//n filas de 5 asteriscos
		
		System.out.println("Introduce numero de Filas");
		int n;
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		
		//por cada valor de i se ejecuta el bucle de dentro
		for(int i=0; i<n;i++) {
			for(int j=0;j<5;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//mostrar las tablas de multiplicar de los 10 primeros numeros
		
		for(int m=1;m<=10;m++) {
			System.out.println("Tabla de multiplicar del " + m);
			for(int i=1;i<=10;i++) {
				System.out.println(m + " * " + i +" = "+ m*i);
		 }
	   }
		
	 //Detectar todos los numeros primos
		
		int matriz[] = new int[20];
		Random aleatorio = new Random();
		//llenar la matriz con numeros aleatorios
		for(int i=0; i<matriz.length;i++) {
			matriz[i] = aleatorio.nextInt(20);
		}
		//mostrar los numeros primos
			boolean primo=true;
			System.out.println(Arrays.toString(matriz));
			for(int i=0;i < matriz.length;i++) {
				for(int j = 2; j<matriz[i]/2;j++) {
					if(matriz[i]%j==0) {
						primo=false;
						break;
					}//llave que cierra el bucle interno
						if(primo) {
							System.out.println("Son Primos: "+matriz[i] + " ");
						}
				}//llave que cierra el bulce externo
			}
	 }
}
