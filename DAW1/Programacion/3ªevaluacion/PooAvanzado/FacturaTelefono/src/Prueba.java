import java.util.Comparator;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente c1 = new Cliente("Santiago", 1, Tipo.A, new Fecha(1,1,2019),1);
		c1.addFacturable(new Llamada(new Fecha(11,5,2019), "626267792", 0.06, 120));
		c1.addFacturable(new Llamada(new Fecha(10,1,2019), "555555555", 0.06, 20));
		c1.addFacturable(new Mensaje(new Fecha(25,3,2019), 0.16));
		
		System.out.println(c1.toString());
		Comparator c = new CompararPorFecha();
		c1.ordenar(c);
		System.out.println(c1.toString());
		System.out.println(c1.importe());
	}

}
