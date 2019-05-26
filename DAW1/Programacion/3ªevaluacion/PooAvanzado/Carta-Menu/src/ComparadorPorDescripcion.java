import java.util.Comparator;

public class ComparadorPorDescripcion implements Comparator<FastFoodeable> {

	@Override
	public int compare(FastFoodeable f1, FastFoodeable f2) {
		// TODO Auto-generated method stub
		//debemos incluir getDescripción en la interfaz FastFoodeable
		return f1.getDescripcion().compareTo(f2.getDescripcion());
	}

}
