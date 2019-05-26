
public class Lista {

	private NodoCapitulo com;
	
	public Lista() {
		this.com = null;
	}
	
	public NodoCapitulo getCom() {
		return this.com;
	}
	
	public int obtenerNumeroPaginas() {
		int sum = 0;
		NodoCapitulo p = this.com;
		while(p != null) {
			sum += p.getInfo().obtenerNumeroPaginas();
			p = p.getSig();
		}
		return sum;
	}
	
	public String imprimir() {
		String salida = "";
		NodoCapitulo p = this.com;
		while(p != null) {
			salida += p.getInfo().imprimir();
			p = p.getSig();
		}
		return salida;
	}
	
	public String imprimirCapitulo(int n) {
		String salida = "";
		NodoCapitulo p = this.com;
		while(p != null && p.getInfo().getColocacion() != n) {
			p = p.getSig();
		}
		salida = p.getInfo().imprimirCapitulo() +
				 "-----------------------";
		return salida;
	}
	
	public void addBegin(Capitulo c) {
		NodoCapitulo n = new NodoCapitulo(c);
		if(this.com == null) {
			this.com = n;
			return;
		}
		NodoCapitulo p = this.com;
		n.setSig(p);
		this.com = n;
	}
	
	public void addEnd(Capitulo c) {
		NodoCapitulo n = new NodoCapitulo(c);
		if(this.com == null) {
			this.com = n;
			return;
		}
		NodoCapitulo p = this.com;
		NodoCapitulo q = null;
		while(p != null) {
			q = p;
			p = p.getSig();
		}
		q.setSig(n);
	}
	
	public void addOrdenado(Capitulo c, Comparator comp) {
		NodoCapitulo n = new NodoCapitulo(c);
		if(this.com == null) {
			this.com = n;
			return;
		}
		if(comp.compare(this.com.getInfo(), c) >= 0){
			this.addBegin(c);
			return;
		}else if(comp.compare(this.com.getInfo(), c) < 0) {
			NodoCapitulo p = this.com;
			NodoCapitulo q = null;
			while(p != null && comp.compare(p.getInfo(), c) < 0) {
				q = p;
				p = p.getSig();
			}
			if(p != null) {
				this.addBegin(c);
			}else {
				n.setSig(p);
				q.setSig(n);
			}
		}
	}
	
	
}
