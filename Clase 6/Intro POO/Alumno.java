package introPOO;

public class Alumno {

	//DNI,Nombre,Email,Edad
	
	String dni;
	String nombre;
	String email;
	int edad;
	float notas[];//inicializar este Array
	Curso curso;
	
	//constructor por defecto
	public Alumno() {
		dni=null;
		nombre=null;
		email=null;
		edad=0;
		notas=new float[10]; // inicializaciojn del array
		//añadir notas al array
		for(int i =0 ; i<notas.length; i++) {
			notas[i]=-1;
		}
		
	}
	
	//añadir notas a un  alumno
	
	public void addNota(float nota){
		for(int i=0; i<notas.length;i++) {
			if(notas[i]==-1) {
				notas[i]=nota;
				break;
			}
		}
		
		
	}
	
	
}
