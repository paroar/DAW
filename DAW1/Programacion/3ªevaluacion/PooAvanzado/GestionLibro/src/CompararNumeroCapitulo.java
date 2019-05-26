
public class CompararNumeroCapitulo implements Comparator{

	public int compare(Object o1, Object o2) {
		Capitulo c1 = (Capitulo)o1;
		Capitulo c2 = (Capitulo)o2;
		if(c1.getColocacion() > c2.getColocacion()) {
			return 1;
		}else if(c1.getColocacion() < c2.getColocacion()) {
			return -1;
		}
		return 0;
	}

}
