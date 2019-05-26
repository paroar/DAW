
public class CompareFecha implements Comparator{

	public int compare(Object o1, Object o2) {
		NodoFactura n1 = (NodoFactura)o1;
		NodoFactura n2 = (NodoFactura)o2;
		Facturable f1 = n1.getInfo();
		Facturable f2 = n2.getInfo();
		Fecha fecha1 = f1.obtenerFecha();
		Fecha fecha2 = f2.obtenerFecha();
		return fecha1.compareTo(fecha2);
	}
}
