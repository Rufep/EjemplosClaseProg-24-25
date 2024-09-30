package sentenciasSeleccion;

import java.util.Scanner;

public class EjemploIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejemplo 1 : Programa que lee un numero e indica si es par
		
		int numero;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un Numero: ");
		numero = scan.nextInt();
		
		//ejemplo de if/else
		if(numero% 2 == 0) {
			System.out.println("El numero es Par");
		}else {
			System.out.println("El numero es Impar");
		}
	}

}
