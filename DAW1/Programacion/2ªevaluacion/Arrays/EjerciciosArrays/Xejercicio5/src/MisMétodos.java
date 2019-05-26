
public class MisM�todos {

	public static int monta�aRusa(Lista monta�a) {
		int acumulador = monta�a.getComienzo().getDato();
		Nodo p = monta�a.getComienzo();
		Nodo q = monta�a.getComienzo().getSig();
		while(q != null) {
			if(q.getDato() < p.getDato()) {
				acumulador -= q.getDato();
			}
			if(q.getDato() > p.getDato()) {
				acumulador += q.getDato();
			}
			p = p.getSig();
			q = q.getSig();
		}
		return acumulador;
	}
}
