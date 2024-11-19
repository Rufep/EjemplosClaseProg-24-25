package clases;

public class Principal {

	public static void main(String[] args) {

		//La clase Object es la clase base de todos los objetos en Java, todos los objetos heredan de Object
		
		Object o = new Object();
		
		// podria escribir esto object a1 = new Autor();
		
		//Declaracion de variable de tipo autor
			Autor a1;
		//creacion del objeto autor
			a1= new Autor();
		//acceder a los atributos del objeto autor
			a1.nombre="Ken Follet";
			String nombre= a1.nombre;
			System.out.println("Autor: "+ a1.nombre);
			
		//Autores con el segundo Constructor
			Autor a2 = new Autor("Stephen King","USA", 55);
			Autor a3 = new Autor("Herman Hesse","Alemania", 90);
			
			System.out.println(a2.nombre);

			
		//mostrar por pantalla info de un autor
			
			System.out.println(a3.toString());
			
			a3.printAutor();//imprimiento el autor con mi propio metodo
		
		//Acceso con get y set
			
			int edad = a3.getEdad();
			a3.setEdad(34);
			
			System.out.println("******************************");
			System.out.println(a3);
	}

}
