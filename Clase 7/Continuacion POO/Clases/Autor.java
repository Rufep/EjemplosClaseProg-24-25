package clases;

public class Autor {

	//definicion de una nueva variable
		 String nombre;
		 String pais;
		private int edad;
	
	//constructor
	//si no añadimos un constructor se añade uno por defecto
	//caracteristicas del constructor: no tienen tipo de retorno y se llaman igual que la clase
		
		public Autor() {
			
			//este constructor por defecto pone las variables complejas a null y las variables numericas a 0 no hace falta escribirlas
			nombre=null;
			pais=null;
			edad=0;
		}
	//nos interesa sobrecargar el constructor para programar otro metodo Constructor y pasarle Argumentos
	//por combenio los nombres de los argumentos seran igual al de los atributos
	//con la palabra reservada this apuntamos al objeto que se esta instanciando
		public Autor(String nombre, String pais, int edad) {
			
			this.nombre=nombre;
			this.pais=pais;
			setEdad(edad);
			
		}
		
	//Metodos de Acceso get (lectura) set (escritura) En este ejemplo lo hacemos para el atributo edad
		
		public int getEdad() {
			return this.edad;
		}
		
		public void setEdad(int edad) {
			if(edad>=0 && edad<=150) {
				this.edad=edad;
				}
			}
		
	//modificamos sobrescribimos un metodo que estamos heredando en este caso el metodo "To String"
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.nombre + " " + this.pais + " " + this.edad;
		}
		
	//metodo propio que printe por consola la info del Autor
		
		public void printAutor() {
			System.out.println(this.nombre + " " + this.pais + " " + this.edad);
		}
}
