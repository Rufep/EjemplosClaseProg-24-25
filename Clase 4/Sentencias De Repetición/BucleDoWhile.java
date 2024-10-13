package ejemplosBucles;

import java.util.Scanner;

public class BucleDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// bucle Do While --> unico bulce que garantiza al menos una iteracion
		
		int n=10;
		//haz esto mientas se cumpla la condicion
		do {
			System.out.println("Esto Ya se ejecuto");
		}while(n>10);
		
		//mostrar menus al usuario y que escoja una opcion(MIENTRAS HAYA UN ERROR SE REPITE EL MENU HASTA ELEGIR UNA OPCION CORRECTA)
		
		char opcion;
		boolean error;
		
		do {
			error= false;
			
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
					error=true;
					System.out.println("Opcion Erronea");
					break;
			}
		
	}while(error);

 }
}
	
