import java.util.Comparator;

public class ComparadorPorDescripcionDeRecetas implements Comparator<Receta> {

	@Override
	public int compare(Receta o1, Receta o2) {
		// TODO Auto-generated method stub
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
