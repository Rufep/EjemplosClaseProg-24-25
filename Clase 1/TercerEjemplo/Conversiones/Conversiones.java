package principal;

public class Conversiones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//conversiones Explicitas
		//pobrema al sumar dos variables de tipo distinto
		
		byte n1=90;
		int n2=10;
		//byte resultado = n1 + n2;//dos solucioones
		
		//solucion una forzar conversion a byte , conversion explicita
		
			byte resultado =(byte)(n1 + n2);//peligro de overflow (desvordamiento) si el resultado supera el espacio que puede manejar el tipo de variable
			System.out.println("Resultado : " + resultado);
			
		//solucion 2 : guardar el resultado en un Entero
			
			int resultado2 = n1 +n2;
			System.out.println("Resultado2 : " + resultado2);
			
		// esto da errro porque las variable mas pequeñas se convierten a int al usar los operadores asi que o casteo o guardo el resultado en un int	
		short x1=9 , x2=90;
			//short resultado3 = x1+x2;
		int resultado3 =x1+x2;
		System.out.println("Resultado3 : " + resultado3);
		
		//Conversiones Implicitas ( se hacen de manera automatica)
		
			//byte --> short --> int --> long (son totalmente seguras)
		
				byte b1 = 100;
				int i1=b1; // le estoy diciendo que me guarde el valor de b1 en i1 me hace una copia de ese valor no es igual a i1 si no que copia su valor
				b1=20; // aqui modificamos el valor de b1
				
				System.out.println("i1 = " + i1);
				System.out.println("b1 = " + b1 );

	}

}
