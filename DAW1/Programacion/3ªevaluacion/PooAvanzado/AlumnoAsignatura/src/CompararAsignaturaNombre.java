
public class CompararAsignaturaNombre implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		NodoAsignatura n1 = (NodoAsignatura)o1;
		NodoAsignatura n2 = (NodoAsignatura)o2;
		if(n1.getInfo().getNom().compareTo(n2.getInfo().getNom()) > 0) {
			return 1;
		}else if(n1.getInfo().getNom().compareTo(n2.getInfo().getNom()) < 0){
			return -1;
		}		
		return 0;
	}

}
