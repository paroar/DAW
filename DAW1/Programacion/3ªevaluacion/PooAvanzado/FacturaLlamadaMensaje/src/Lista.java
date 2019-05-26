
public class Lista {
	
	private NodoFactura com;
	
	public Lista() {
		this.com = null;
	}
	
	public double importe() {
		double imp = 0;
		NodoFactura p = this.com;
		while(p != null) {
			imp += p.getInfo().importe();
			p = p.getSig();
		}
		return imp;
	}
	
	public void visualizar() {
		NodoFactura p = this.com;
		while(p != null) {
			p.getInfo().visualizar();
			p = p.getSig();
		}
	}
	
	public void addBegin(Facturable f) {
		NodoFactura n = new NodoFactura(f);
		if(this.com == null) {
			this.com = n;
			return;
		}
		n.setSig(this.com);
		this.com = n;
	}
	
	public void addEnd(Facturable f) {
		NodoFactura n = new NodoFactura(f);
		if(this.com == null) {
			this.com = n;
			return;
		}
		NodoFactura p = this.com;
		while(p.getSig() != null) {
			p = p.getSig();
		}
		p.setSig(n);
	}
	
	public void addOrder(Facturable f, Comparator c) {
		NodoFactura n = new NodoFactura(f);
		if(this.com == null) {
			this.com = n;
			return;
		}
		NodoFactura p = this.com;
		NodoFactura q = null;
		if(c.compare(p, n) >= 0) {
			this.addBegin(f);
			return;
		}
		while(p != null && c.compare(p, n) < 0) {
			q = p;
			p = p.getSig();
		}
		if(p == null) {
			this.addEnd(f);
			return;
		}else {
			n.setSig(p);
			q.setSig(n);
		}
	}
}
