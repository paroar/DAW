import java.util.Comparator;

public class ComparadorPorTiempoPreparacion implements Comparator<FastFoodeable> {

	@Override
	public int compare(FastFoodeable o1, FastFoodeable o2) {
		// TODO Auto-generated method stub
		Tiempo t1 =o1.tiempoDePreparacion();
		Tiempo t2 = o2.tiempoDePreparacion();
		return  t1.compareTo(t2);
	}

}
