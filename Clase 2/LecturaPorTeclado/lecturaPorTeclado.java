package Tema2Ejemplos;

import java.util.Scanner;

public class lecturaPorTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String nombre;
			int edad;
			float temperatura;
			
			//variable para poder introducir valores por teclado
			Scanner scan = new Scanner(System.in);
			System.out.println("Introduce tu nombre: ");
			
			nombre = scan.next(); //para cadenas de caracteres next
			
			System.out.println("Introduce tu edad: ");
			
			edad = scan.nextInt(); // para enteros nextInt
			
			//System.out.println("Introduce tu temperatura: ");
			
			//temperatura = scan.nextFloat();//para floats , hay que introducirlo con comas
			
			//vamos a capturar la excepcion , ya que en el float al introducir un punto se nos produce un error, vamos a usar un try catch
			
				try {
				//se escrbibe el codigo que puede soltar la excepcio
				
					System.out.println("Introduce tu temperatura: ");
					temperatura = scan.nextFloat();
				
						System.out.println("Datos Registrados");
						System.out.println("Nombre: "+nombre);
						System.out.println("Edad: "+edad);
						System.out.println("Temperatura: " + temperatura);
				
				}
				catch(Exception e) {
				//mensaje que mostraremos cuando se produce la excepcion
					System.out.println("No se ha podido registrar la temperatura");
				}
			
	}

}
