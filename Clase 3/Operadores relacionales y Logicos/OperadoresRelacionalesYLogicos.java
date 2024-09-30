package sentenciasSeleccion;

public class OperadoresRelacionalesYLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//operadores relacionales = < ,=< ,> , >=, == ,!=
		
					//true o false segun los valores que se comparen
				
				boolean condicion1 = 5<8;
				
				int x = 9, y = 3;
				
				boolean condicion2 = x < y; //false ,  X es mayor que Y
				
				x=3; //cambiamos valor de X
				
				boolean condicion3 = x <= y; // true, x es meno que y
				
				boolean condicion4 = x != y; // distinto que, false x no es distinto de y 
				boolean condicion5 = x == y ; // comparacion , true x es igual a y
		
				System.out.println(condicion5);

				// cuando comparamos Strings hay que tener cuidado
				
					String palabra1 ="hola";
					String palabra2 ="hola";
					
					boolean iguales = palabra1==palabra2;
					System.out.println("Iguales :" +iguales);
					
					//para comparar strings la manera que se recomienda es utilizar el metodo equals
					
						//String palabra1 ="hola";
						//String palabra2 ="hola";

						//oolean iguales = palabra1.equals(palabra2);
						//System.out.println("Iguales :" +iguales);
					
					//con == no compara el contenido compara la zona de memoria que estan ocupando, usaremos el metodo equals para comparar Strings
	
	
		//Operadores logicosn : Y logico && , O logico || ,! Negacion
					
					// "AND" && sera verdadero si las dos conciciones se cumplen
					
						int a = 4, b = 7;
						boolean c1 = a>4 && b!=9;
						System.out.println("c1: " +c1);
						
					// "OR" || devuelve verdadero si una de las opciones es verdadera
						
						boolean c2 = a >4 || b==9;
						System.out.println("c2: " +c2);
						
					// ! si c2 es false c3 sera verdadero y al reves(! Niega lo que va a su derecha)
						boolean c3 =!c2;
						System.out.println("c3: "+c3);
		
	
	
	}

}
