package Tema2Ejemplos;

import java.util.Scanner;

public class EnvoltoriosWrapers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Envoltorios - Variables que permiten hacer algo con su tipo primitivo
		
			//int -> Integer
				
				String dni = "12345678R";
				int numeroDni = Integer.parseInt(dni.substring(0, 8));//por ejemplo los parse para pasar un String(CON DIGITOS) a Numero, en este caso la parte numerica del DNI
				
				//float numero = Float.parseFloat("34.5");
				//String numer2 = Integer.toString(34567);
				//String numeroBinario = Integer.toBinaryString(45);
				
			//Character -> char
				
				char letra = '2';
				boolean digito = Character.isDigit(letra); // saber si es un dijito
				System.out.println("Es un dígito: " + digito);

				char letra2 = 'a';
				boolean esLetra = Character.isLetter(letra2);// saber si es una letra
				System.out.println("Es una letra: " + esLetra);
		
	}
	
	
}
