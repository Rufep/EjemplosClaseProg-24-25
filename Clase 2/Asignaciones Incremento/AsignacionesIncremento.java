package operadores;

public class AsignacionesIncremento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//sumarle 2 a x
		
		int x=10;
		x =x +2;
		
		//maneras abrevidadas de suma resta multiplicacion
		
		x+=2;
		x-=2;
		x*=2;
		
		// ++ y -- post incremento o preincrementoi
		
		int y = 1;
		x++;
		y++;//y=y+1; y+=1
		++y;
		System.out.println("y ="+ y);;
		int z= y++;
		System.out.println("z ="+ z +"\n" + "y ="+ y);;
		
	}

}
