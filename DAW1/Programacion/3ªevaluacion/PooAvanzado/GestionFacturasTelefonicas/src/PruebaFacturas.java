
public class PruebaFacturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factura f = new Factura(1);
		Llamada l1 = new Llamada("919876543", 0.7, 5, 1, 1, 2001);
		Llamada l2 = new Llamada("919876543", 0.7, 5, 2, 2, 2002);
		Llamada l3 = new Llamada("919876543", 0.7, 5, 3, 3, 2000);
		Mensaje m1 = new Mensaje(0.25, 1, 1, 2001);
		Mensaje m2 = new Mensaje(0.25, 2, 2, 2002);
		f.addInOrder(l1);
		f.addInOrder(m1);
		f.addInOrder(l2);
		f.addInOrder(m2);
		f.addInOrder(l3);
		
		System.out.println(f.toString());
		System.out.println(f.importe());
	}

}
