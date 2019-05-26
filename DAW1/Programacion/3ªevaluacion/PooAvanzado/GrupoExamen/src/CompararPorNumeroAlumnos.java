import java.util.Comparator;

public class CompararPorNumeroAlumnos implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Examinable e1 = (Examinable)o1;
		Examinable e2 = (Examinable)o2;
		int n1 = e1.getNumeroAlumnos();
		int n2 = e2.getNumeroAlumnos();
		return n1-n2;
	}

	
}
