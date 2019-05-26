
import java.util.Comparator;

public class ComparadorFechaNombre implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Graduable g1 = (Graduable) o1;
		Graduable g2= (Graduable) o2;
		
		if(g1.getFecha().compareTo(g2.getFecha())==1) return 1;
		else if (g1.getFecha().compareTo(g2.getFecha())==-1)  return -1;
		else return g1.getNombre().compareTo(g2.getNombre());
	}

}
