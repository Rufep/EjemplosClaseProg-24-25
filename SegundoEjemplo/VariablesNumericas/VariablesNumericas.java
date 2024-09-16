package principal;

public class VariablesNumericas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declarción de Variables(siempre en minusculas)
		
			//Variables Numéricas (Enteros)
				
				byte edad;  //-128 a 127
				short premio;//-32768 a 32767
				int grados;//2*10a la 9 muy altos
				long atomos;// muy muy altos
				
					//Declaración e Inicializacion de las variables
				
						short limiteSuperior=100; //variable declarada e inicializada
		
					//Declarcion de varias variables en una misma linea
				
						short primerPremio,segundoPremio,tercerPremio;
		
					//Declarcion e inicialización de varias variables en una misma linea
	
						short Premio1=100,Premio2=50,Premio3=25;
					
					//java nos permite separar con un guion bajo para mejorar la lectura de un numero
						long valorAlto=100_000_000l;
				
			//Variables Numéricas (Decimales)
				
				float temperatura=4.5f;//al float hay que añadirle una f al final al darle un valor
				double tiempoDeLlegada;

		//Mostrar por pantalla los valores de estas variables
				System.out.println("La temperatura es de: " + temperatura + " Grados");// si escribo sysou ya me muestra el system, con el + concateno el texto con el valor de la variable
				
	}

}
