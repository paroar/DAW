import java.util.Comparator;

public class CompararPorFecha implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		Nodo n1 = (Nodo)arg0;
		Nodo n2 = (Nodo)arg1;
		Fecha f1 = n1.getInfo().obtenerFecha();
		Fecha f2 = n2.getInfo().obtenerFecha();
		return f1.compareTo(f2);
	}

	
}
