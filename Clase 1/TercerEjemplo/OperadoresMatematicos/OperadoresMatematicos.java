package principal;

public class OperadoresMatematicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Operadores : son simbolos que ejecutan una determinada función
		//como resultado de esta función generan un valor
		
			//operadores Matematicos + , - , * , / , %
		
				int numero1 = 9;
				 
				// sumarle 1 a numero1 , con el = asignamos el valor de la derecha a la variable de la izquierda
				
					numero1 = numero1+1;

					System.out.println("numero1 : " + numero1);
				
				//guardarlo en otra variable
					
					int suma = numero1+20;
					
					System.out.println("Suma :" + suma);
				
				//División
					
					int division =10/3; //esto nos da un problema de precision porque los operandos son enteros entonces nos devuelve el reusltado de la division entera aunque cambiemos el tipo a double o float lo podemos solucionar pasando uno de los operandos a float
					System.out.println("Division : " + division);
					
					float division2 = 10/3f;
					System.out.println("Division2 : " + division2);
					
				//hacemos un cast en una de las variables para convertirla en este caso a float y tener el resultado con decimales y que sea mas preciso
					
					short n1=10;
					short n2=3;
					float division3 =(float)n1/n2;
					System.out.println("Division3 :" + division3);
					
				//si dividimos entre 0 saltará una excepción	
					
					//int divisionEntreCero  = 10/0; 
					
					//podemos solcionarlo capturando la expcion con un try catch
						
					 try {
								int divisionEntreCero =10/0;
								
						}
						catch (Exception e) {
							System.out.println("Error de Division ");
						}
					 
					
				// modulo resto de la division entera simbolo %
					
					int resto =10%2;
					System.out.println("El Resto de la división es : " + resto); // nos muestra el resto de la division
					int resto2 = 10%3;
					System.out.println("el resto de la division2 es: " + resto2);
	}

					
}
