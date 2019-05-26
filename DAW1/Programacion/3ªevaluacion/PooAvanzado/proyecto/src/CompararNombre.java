import java.util.Comparator;

public class CompararNombre implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		Receta r1 = (Receta)arg0;
		Receta r2 = (Receta)arg1;
		return r1.compareTo(r2);
	}

}
