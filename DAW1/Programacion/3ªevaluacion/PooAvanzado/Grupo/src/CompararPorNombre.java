import java.util.Comparator;

public class CompararPorNombre implements Comparator{

	public int compare(Object arg0, Object arg1) {
		Asignatura a0 = (Asignatura)arg0;
		Asignatura a1 = (Asignatura)arg1;
		return a0.getNombre().compareTo(a1.getNombre());
	}
}
