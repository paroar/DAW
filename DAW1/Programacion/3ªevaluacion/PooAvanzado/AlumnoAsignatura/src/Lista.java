
public class Lista {
	
	private NodoAsignatura com;
	
	public Lista() {
		this.com = null;
	}

	public NodoAsignatura getCom() {
		return com;
	}

	public void setCom(NodoAsignatura com) {
		this.com = com;
	}
	
	public void addAsignaturaBegin(Object o) {
		Asignatura a = (Asignatura)o;
		NodoAsignatura n = new NodoAsignatura(a);
		if(this.com == null) {
			this.com = n;
			return;
		}
		n.setSig(this.com);
		this.com = n;
	}
	
	public void addAsignaturaEnd(Object o) {
		Asignatura a = (Asignatura)o;
		NodoAsignatura n = new NodoAsignatura(a);
		if(this.com == null) {
			this.com = n;
			return;
		}
		NodoAsignatura p = this.com;
		while(p.getSig() != null) {
			p = p.getSig();
		}
		p.setSig(n);
	}
	
	public void addAsignaturaOrder(Object o, Comparator c) {
		Asignatura a = (Asignatura)o;
		NodoAsignatura n = new NodoAsignatura(a);
		if(this.com == null) {
			this.com = n;
			return;
		}
		NodoAsignatura p = this.com;
		while(p != null && c.compare(p, n) < 0) {
			p = p.getSig();
		}
		if(p == null) {
			this.addAsignaturaEnd(a);
		}else if(p == this.com){
			this.addAsignaturaBegin(a);
		}else {
			NodoAsignatura q = this.prevNodoAsignatura(p);
			n.setSig(p);
			q.setSig(n);
		}
	}
	
	public void borrarAsignatura(String nom) {
		NodoAsignatura p = this.com;
		while(p != null && !p.getInfo().getNom().equals(nom)) {
			p = p.getSig();
		}
		if(p == this.com) {
			this.com = p.getSig();
		}else if(p != null){
			NodoAsignatura q = this.prevNodoAsignatura(p);
			q.setSig(p.getSig());
		}
	}
	
	public NodoAsignatura prevNodoAsignatura(NodoAsignatura p) {
		NodoAsignatura q = this.com;
		while(q.getSig() != p) {
			q = q.getSig();
		}
		return q;
	}
	
	@Override
	public String toString() {
		String s = "";
		NodoAsignatura p = this.com;
		while(p != null) {
			s += p.getInfo().toString() + "\n";
			p = p.getSig();
		}
		return s;
	}
	
	public String mostrarAsignatura(String nom) {
		String s = "";
		NodoAsignatura p = this.com;
		while(p != null) {
			if(p.getInfo().getNom() == nom) {
				s += p.getInfo().toString();
				return s;
			}
			p = p.getSig();
		}
		return s;
	}
	
	public void modificarNota(String nom, double nota) {
		NodoAsignatura p = this.com;
		while(p != null) {
			if(p.getInfo().getNom() == nom) {
				p.getInfo().setNota(nota);
				return;
			}
			p = p.getSig();
		}
	}
	

	public double mediaAsignaturas() {
		int n = 0;
		double sum = 0;
		NodoAsignatura p = this.com;
		while(p != null) {
			n++;
			sum += p.getInfo().getNota();
			p = p.getSig();
		}
		double media = sum/n; 
		return media;
	}
}
