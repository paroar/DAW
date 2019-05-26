
public class PruebaFraccion {

	public static void main(String[] args) {
			
		Fraccion w=new Fraccion();
		Fraccion x=new Fraccion();
		
		w.readFraction();
		x.readFraction();
		
		w.simplificarFraccion(w);
		x.simplificarFraccion(x);
		
		System.out.println(w);
		System.out.println(x);
		
		boolean iguales;
		iguales=w.equals(x);
		System.out.println(iguales);
		
		Fraccion v=new Fraccion();
		
		v.sumaDosFracciones(w,x);
		v.simplificarFraccion(v);
		System.out.println(v);
		
	}

}
