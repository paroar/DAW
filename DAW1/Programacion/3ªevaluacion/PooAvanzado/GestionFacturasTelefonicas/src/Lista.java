
public class Lista {

	private NodoFacturable com;

	public Lista() {
		
	}

	public Lista(NodoFacturable com) {
		this.com = com;
	}

	public void addFin(Facturable f) {
		NodoFacturable n = new NodoFacturable(f);
		if(this.com == null) {
			this.com = n;
			return;
		}
		NodoFacturable p = this.com;
		while(p.getSig() != null) {
			p = p.getSig();
		}
		p.setSig(n);
	}
	
	public void addPrincipio(Facturable f) {
		NodoFacturable n = new NodoFacturable(f);
		if(this.com == null) {
			this.com = n;
			return;
		}
		n.setSig(this.com);
		this.com = n;
	}
	
	public void addInOrder(Facturable f) {
		NodoFacturable n = new NodoFacturable(f);
		if(this.com == null) {
			this.com = n;
			return;
		}
		NodoFacturable p = this.com;
		NodoFacturable q = null;
		if(p.getInfo().compareTo(f) >= 0) {
			this.addPrincipio(f);
			return;
		}
		while(p != null && p.getInfo().compareTo(f) <= 0) {
			q = p;
			p = p.getSig();
		}
		if(p == null) {
			this.addFin(f);
		}else {
			n.setSig(p);
			q.setSig(n);
		}
		
	}
	
	public String toString() {
		String s = "";
		NodoFacturable p = this.com;
		while(p != null) {
			s += p.getInfo().toString()+"\n";
			p = p.getSig();
		}
		return s;
	}
	
	public double importe() {
		double importe = 0;
		NodoFacturable p = this.com;
		while(p != null) {
			importe += p.getInfo().importe();
			p = p.getSig();
		}
		return importe;
	}
	
}
