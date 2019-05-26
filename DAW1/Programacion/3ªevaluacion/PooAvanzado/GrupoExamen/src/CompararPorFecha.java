import java.util.Comparator;

public class CompararPorFecha implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Examinable e1 = (Examinable)o1;
		Examinable e2 = (Examinable)o2;
		Fecha f1 = e1.getFecha();
		Fecha f2 = e2.getFecha();
		return f1.compareTo(f2);
	}

	
}
