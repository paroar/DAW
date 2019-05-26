
public class Lista {

	private Nodo comienzo;
	
	public Lista() {
		this.comienzo = null;
	}
	
	public void addBegin(int dato) {
		Nodo nuevo = new Nodo(dato);
		nuevo.setSig(this.comienzo);
		this.comienzo = nuevo;
	}
	
	public void addEnd(int dato) {
		Nodo nuevo = new Nodo(dato);
		Nodo p = this.comienzo;
		if(p == null) {
			this.comienzo = nuevo;
		}else {
			while(p.getSig() != null) {
				p = p.getSig();
			}
			p.setSig(nuevo);
		}
	}
	
	public String mostrarLista() {
		String salida = "";
		if(this.comienzo == null) {
			return salida;
		}
		Nodo p = this.comienzo;
		while(p.getSig() != null) {
			salida += p.getDato() + "-->";
			p = p.getSig();
		}
		salida += p.getDato();
		return salida;
	}
	
	public int maximaDistancia(int info) {
		int max = -1;
		Retorno r;
		Nodo p = this.comienzo;
		this.distancia(p, info);
		p = p.getSig();
		while(p != null) {
			r = this.distancia(p, info);
			p = r.getNodo();
			if(r.getDist() > max) {
				max = r.getDist();
			}
		}
		return max;
	}
	
	public Retorno distancia(Nodo p, int info) {
		int dist = 0;
		while(p != null && p.getDato() != info) {
			p = p.getSig();
			dist++;
		}
		if(p == null) {
			return new Retorno(-1, p);
		}else {
			return new Retorno(dist, p.getSig());
		}
	}
	
	public void invertir() {
		Nodo p = this.comienzo;
		Nodo q = this.comienzo.getSig();
		Nodo r = this.comienzo;
		while(r.getSig() != null) {
			r = r.getSig(); 
		}
		while(p != r) {
			int aux;
			while(q.getSig() != r) {
				q = q.getSig();
			}
			aux = r.getDato();
			r.setDato(p.getDato());
			p.setDato(aux);
			p = p.getSig();
			r = q;
			q = p.getSig();
		}	
	}
	
	public Nodo buscar(int dato) {
		Nodo p = this.comienzo;
		while(p != null && p.getDato() != dato) {
			p = p.getSig();
		}
		if(p == null) {
			return null;
		}else {
			return p;
		}
	}
	
	public void borrar(Nodo q) {
		Nodo p = this.comienzo;
		if(p == q) {
			this.comienzo = p.getSig();
			return;
		}
		while(p.getSig() != q) {
			p = p.getSig();
		}
		p.setSig(q.getSig());
	}
}
