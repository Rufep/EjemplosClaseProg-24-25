package ejemploSwitch;

import java.util.Scanner;

public class PruebaSwitch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char opcion;
		System.out.println("Escoge una Opción");
		System.out.println("a) Suma dos Números");
		System.out.println("b) Resta dos Números");
		System.out.println("c) Calcula Resto División");
		
		Scanner scan = new Scanner(System.in);
		opcion =Character.toLowerCase(scan.next().charAt(0)); //me quedo con el primer caracter del String
				
		
		switch(opcion) {
		
			case 'a':
			
				System.out.println("Suma 2 numeros");
				break;
		
			case 'b':
				
				System.out.println("Resta dos numeros");
				break;
				
			case 'c':
				
				System.out.println("Resto Division");
				break;
				
			default:
				
				System.out.println("Opcion Erronea");
				break;
		}
	}
}
