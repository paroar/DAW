
public class PruebaFacturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente c1 = new Cliente("Pablo","Rodríguez","123",1);
		Comparator c = new CompareFecha();
		Fecha f1 = new Fecha(2000, 1, 1);
		Mensaje m1 = new Mensaje(f1, 0.25);
		Mensaje m2 = new Mensaje(f1, 0.28);
		Fecha f2 = new Fecha(1990, 1, 1);
		Llamada l1 = new Llamada(f2, "626267792", 0.6, 6);
		c1.addOrder(m1, c);
		c1.addOrder(l1, c);
		c1.addOrder(m2, c);
		c1.visualizar();
		System.out.println(c1.importe());
	}

}
