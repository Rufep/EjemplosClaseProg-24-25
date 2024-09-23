package Tema2Ejemplos;

import java.security.AccessControlContext;
import java.util.Arrays;

public class Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase = "Rc Celta";
		
			//numero de caracteres que hay en un String
		
				int caracteres = frase.length();
			
			//Buscar la posición de un carcater
				
				int posPrimerEspacio = frase.indexOf(" "); //buscar el primer espacio es la posicion que le marcamos en el index Of
			
			//Que caracter hay en una determinada posicion
				
				char caracter = frase.charAt(0); // nos devuelve el carcater que hay en la posicion 0 del String
				
			//saber si empiezaa por un determinado subString
				
				boolean verdadero = frase.startsWith("Las"); // devuelve true si el String empieza por "Las"
				
			//Saber si termina en un determinado subString
				
				boolean Verdadero2 = frase.endsWith("z");// devuelve true si el String termina por "z"
			
			//Obtener un trozo del String
				
				String subcadena = frase.substring(posPrimerEspacio+1);// nos devuelve Celta , nos devulve la posicion desde el primer espacio como le sumamos 1 consume ese espacio y nos devuelve Celta
				System.out.println("Subcadena:" + subcadena);
				
				String subcadena2 = frase.substring(0,1);
				System.out.println("subcandena2:"+subcadena2);
				
			//Replace : remplazar caracteres
				
				String frase1 = "Hala Celta";
				String frase1Replace =frase1.replace("a", "*"); // remplace el caracter a por astericos en la frase 1
				System.out.println("frase original : " + frase1);
				System.out.println("frase Replace : " + frase1Replace);
				
			//Split : separar el String en Palabras
				
				String dnis = "12345678A_90909090E_34567890Q_11111111F";
				
					//dividir la cadena de caracateres 

						String trozos[] = dnis.split("_");// recorre el Array de String hasta que encuentra el caracter separador en este caso el _
						System.out.println("Los dnis son =" + Arrays.toString(trozos));
				
					//obtequer la letra del segundo Dni
					
					char letra = trozos[1].charAt(trozos[1].length()-1);//obtenemos la letra del segundo DNI cogemos la posicion del array de Strings que corresponde y comprobamos el valor de su ultima posicion que corresponde a la letra
					System.out.println("La letra del Segundo Dni es = " + letra);
	}

}
