import java.util.Comparator;

public class CompararPorHora implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Examinable e1 = (Examinable)o1;
		Examinable e2 = (Examinable)o2;
		Hora h1 = e1.getHora();
		Hora h2 = e2.getHora();
		return h1.compareTo(h2);
	}

}
