import java.util.*;
public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*TreeSet<String> ordenaPersonas=new TreeSet<String>();
		ordenaPersonas.add("Sandra");
		ordenaPersonas.add("Amanda");
		ordenaPersonas.add("Diana");
		
		System.out.println(ordenaPersonas);*/
		
		TreeSet<Articulo> ordenaPersonas=new TreeSet<Articulo>();
		Articulo uno=new Articulo(1,"Primero");
		Articulo dos=new Articulo(2,"Segundo");
		Articulo tres=new Articulo(3,"Tercero");
		ordenaPersonas.add(dos);
		ordenaPersonas.add(tres);
		ordenaPersonas.add(uno);
		
		System.out.println(ordenaPersonas);
	}

}
