
public class MisMétodos {

	public static int montañaRusa(Lista montaña) {
		int acumulador = montaña.getComienzo().getDato();
		Nodo p = montaña.getComienzo();
		Nodo q = montaña.getComienzo().getSig();
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
