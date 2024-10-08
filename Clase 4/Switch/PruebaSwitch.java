package ejemploSwitch;

import java.util.Scanner;

public class PruebaSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion=1;
		Scanner scan = new Scanner(System.in);
		opcion = scan.nextInt();
		
		switch(opcion) {
		
			case 1:
			
				//Mostrar por Pantalla
				System.out.println("Opcion = " + opcion);
				break;
		
			case 2:
				
				//le sumamos 10
				opcion = opcion+10;
				System.out.println("Opcion = " + opcion);
				break;
				
			case 3:
				
				//multiplicamos por 5
				opcion *=5; // opcion = opcion * 5
				System.out.println("Opcion = " + opcion);
				break;
				
			default:
				
				System.out.println("Opcion Erronea");
				break;
		}
	}

}
