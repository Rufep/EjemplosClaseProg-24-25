package sentenciasSeleccion;

public class EjemploIfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//Programa qque califca una nota como:
			//Suspenso si es <5
			///aprobado si es >=5 y <7
			//sobresaliente si es >=7
		
		int nota =4;
		if(nota<5){
			
			System.out.println("suspenso");
		
		}else if(nota<7){
			
			System.out.println("Aprobado");
			
		}else if (nota <=10){
			
			System.out.println("Sobresaliente");
			
		}else {
			
			System.out.println("Error en la Nota");
		}
		
		System.out.println("FIN DEL PROGRAMA");
		
	//programa que dice si uin numero es positivo o negativo
		
		
		int numero=5;
		boolean positivo = numero >=0;
		
		
		//!positivo es igual positivo ==false
		if(!positivo) {
			
			System.out.println("Numero Negativo");
		}else {
			System.out.println("Numero Positivo");
		}
		
	}
	

}
