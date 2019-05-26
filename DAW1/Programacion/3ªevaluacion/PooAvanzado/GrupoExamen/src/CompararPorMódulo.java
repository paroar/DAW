import java.util.Comparator;

public class CompararPorMódulo implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		Examinable e1 = (Examinable)arg0;
		Examinable e2 = (Examinable)arg1;
		String s1 = e1.getModulo();
		String s2 = e2.getModulo();
		return s1.compareTo(s2);
	}

}
