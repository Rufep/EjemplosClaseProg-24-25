package Tema2Ejemplos;

import java.util.Random;

public class ClaseMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//calcular la raiz cuadrada
		
			int numero =10;
			double raiz =Math.sqrt(numero);// el.sqrt entre parentesis nos pide el dato como argumento que debemos pasarle y pasando por encima nos dice el dato que nos devuelve en el return 
			System.out.println("El resultado de la raiz de "+numero+ " es = "+raiz);
		
		//calcular potencias
		
			int x=2;
			double potencia = Math.pow(x, 5); //primer argumento es la base y el segundo la potencia 
			System.out.println("el resultado de la potencia de "+ x +" Elevado a 5 es = "+potencia);
		
			
			// a =4*raiz(b)*c5/2*c ejercicio de ejemplo
		
			int b=8 ,c=2;
			double a;
			double numerador= (4*Math.sqrt(b)*Math.pow(c, 5));
			a= numerador / (2*c);
			System.out.println("a es =" + a);
			
			//redondea al entero más cercano por debajo
				
				double roundAporDebajo = Math.floor(a);
				System.out.println("redonde al entero mas cercano por debajo es = " + roundAporDebajo);
				
			//redonde al entero mas cercano por arriba
				
				double roundAporariba = Math.ceil(a);
				System.out.println("redonde al entero mas cercano por arriba es = " + roundAporariba);
			
			//redondeo al mas cercano
				
				double roundMasCercano = Math.round(a);
				System.out.println("redonde al entero mas cercano = " + roundMasCercano);
		
		//calcula la longitud de una circunferencia
			
			//longitur =2+PI+radio;
			
			double longitud, radio =2;
			longitud = 2*Math.PI*radio;
		
		//definir constante LImite
		
			final int LIMITE = 10;
		
		//Valor Minimo
			
			float n1=9, n2=8;
			float minimo = Math.min(n1, n2);
			System.out.println("Minimo = " + minimo);
			
		//Generar numeros aleatorios
			
			double aleatorio = Math.round(Math.random()*10);
			System.out.println("el numero Aleatorio es = " + aleatorio);
		
		// una manera mas comoda de generar numeros aleatorios es usar la clase Random (hay que importar esta clase)
			
			Random generador=new Random();
			int aleatorio2  = generador.nextInt();
			int aleatorio3 = generador.nextInt(10);// sobrecarga para generar numeros de 0 a 9
			int aleatorio4 = generador.nextInt(10, 21);//sobrecarga genera de 10 a 20
			System.out.println("el numero aleatorio generado con la clase Random es = " + aleatorio2);
			System.out.println("el numero aleatorio generado con la clase Random es = " + aleatorio3);
			System.out.println("el numero aleatorio generado con la clase Random es = " + aleatorio4);

	}

}
