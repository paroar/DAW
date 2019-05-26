
import java.util.Comparator;

public class ComparadorAlfabetico implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Anuarioable g1 = (Graduable)o1;
		Anuarioable g2=  (Graduable)o2;
		return g1.getNombre().compareTo(g2.getNombre());		
	}
	
}
