
public class Lista {

	private Nodo comienzo;
	
	public Lista() {
		this.comienzo = null;
	}
	
	public void addBegin(int dato) {
		Nodo nuevo = new Nodo(dato);
		if(this.comienzo == null) {
			this.comienzo = nuevo;
		}else {
			nuevo.setSig(this.comienzo);
			this.comienzo = nuevo;
		}
	}
	
	public void addEnd(int dato) {
		Nodo nuevo = new Nodo(dato);
		if(this.comienzo == null) {
			this.comienzo = nuevo;
		}else {
			Nodo p = this.comienzo;
			while(p.getSig() != null) {
				p = p.getSig();
			}
			p.setSig(nuevo);
		}
	}
	
	public void addOrder(int dato) {
		Nodo nuevo = new Nodo(dato);
		Nodo p = this.comienzo;
		if(this.comienzo == null) {
			this.comienzo = nuevo;
		}else if(p.getSig() == null) {
			if(dato > this.comienzo.getDato()) {
				this.addEnd(dato);
			}else {
				this.addBegin(dato);
			}
		}else {
			Nodo q = this.comienzo.getSig();
			while(q != null && q.getDato() < dato) {
				p = p.getSig();
				q = q.getSig();
			}
			nuevo.setSig(q);
			p.setSig(nuevo);
		}
	}
	
	public void borrarPrincipio() {
		Nodo p = this.comienzo;
		if(this.comienzo == null) {
			return;
		}else if(this.comienzo.getSig() == null) {
			this.comienzo = null;
		}else {
			this.comienzo = this.comienzo.getSig();
		}
	}
	
	public void borrarFinal() {
		Nodo p = this.comienzo;
		if(this.comienzo == null) {
			return;
		}else if(this.comienzo.getSig() == null) {
			this.comienzo = null;
			return;
		}
		while(p.getSig().getSig() != null) {
			p = p.getSig();
		}
		p.setSig(null);
	}
	
	public void borrarDato(int dato) {
		Nodo p = this.comienzo;
		while(p.getSig() != null) {
			if(p.getSig().getDato() == dato) {
				p.setSig(p.getSig().getSig());
			}else {
				p = p.getSig();
			}
		}
		if(this.comienzo.getDato() == dato) {
			this.comienzo = this.comienzo.getSig();
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
	
	public void ordenarBurbuja() {
		Nodo p = this.comienzo;
		boolean repetir = true;
		while(repetir) {
			repetir = false;
			while(p.getSig() != null) {
				if(p.getDato() > p.getSig().getDato()) {
					int aux = p.getDato();
					p.setDato(p.getSig().getDato());
					p.getSig().setDato(aux);
					repetir = true;
				}
				p = p.getSig();
			}
			p = this.comienzo;
		}
	}
	
	public void ordenarSeleccion() {
		Nodo p = this.comienzo;
		Nodo q = this.comienzo.getSig();
		while(p.getSig() != null) {
			q = p.getSig();
			while(q != null) {
				if(p.getDato() > q.getDato()) {
					int aux = p.getDato();
					p.setDato(q.getDato());
					q.setDato(aux);
				}
				q = q.getSig();
			}
			p = p.getSig();
		}
	}
	
	public void invertir() {
		if(this.comienzo == null || this.comienzo.getSig() == null) {
			return;
		}
		Nodo p = this.comienzo;
		Nodo q = this.comienzo.getSig();
		Nodo r;
		while(q.getSig() != null) {
			q = q.getSig();
		}
		while(p != q && q.getSig() != p) {
			int aux = p.getDato();
			p.setDato(q.getDato());
			q.setDato(aux);
			r = p;
			while(r.getSig() != q) {
				r = r.getSig();
			}
			q = r;
			p = p.getSig();
		}
	}
}
