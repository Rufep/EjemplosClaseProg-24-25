package sentenciasSeleccion;

public class IfAnidado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//programa que clasifica numero para y mayor que 100
		
			int numero =250;
			
			if(numero >= 100) {
				if(numero %2 ==0) {
					System.out.println("EL numero es mayor que 100 y es par");
				}else {
					System.out.println("El numero es mayor que 100 pero es Impar");
				}//cierre el else numero %2 ==0
			}//cierra el if numero >=100
			else {
				System.out.println("Numero menor que 100");
			}
	}

}
