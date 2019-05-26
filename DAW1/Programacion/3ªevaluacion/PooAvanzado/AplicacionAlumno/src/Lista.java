
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
	
	public String toString() {
		String s = "Lista ";
		NodoAsignatura p = this.com;
		while (p != null) {
			s += p.toString();
			p = p.getSig();
		}
		return s;
	}

	public void recorrer() { //corregido
		NodoAsignatura p;
		p = this.com;
		while (p != null) {
			System.out.println(p.getInfo());
			p = p.getSig();
		}
	}

	
	public void addBegin(Asignatura dato) { //corregido
		NodoAsignatura nodo = new NodoAsignatura(dato);
		nodo.setSig(this.com);
		//this.com = nodo;
		this.setCom(nodo);
	}
	
	public void addEnd(Asignatura dato) { //corregido
		NodoAsignatura p;
		NodoAsignatura nodo = new NodoAsignatura(dato);
		if (this.com == null)
			this.addBegin(dato);
		else {
			p=this.com;
			while (p.getSig() != null)
				p = p.getSig();
			p.setSig(nodo);
		}
	}
	
	public void add(Asignatura dato) { // ??
		NodoAsignatura p;
		NodoAsignatura nodo = new NodoAsignatura(dato);
		if (this.com == null) {
			System.out.println("Por el principio");
		} else {
			if (dato.compareTo(this.com.getInfo()) <= 0) {
				System.out.println("Por el principio");
			} else {
				p = this.com;
				while (p.getSig() != null) {
					p = p.getSig();
				}
				if (dato.compareTo(p.getInfo()) > 0) {
					System.out.println("Por el final");
				} else {
					System.out.println("Por el medio");
				}
			}
		}
	}
	
	public void addOrdenado(Asignatura dato) { //corregido
		NodoAsignatura p, q, nodo;
		nodo = new NodoAsignatura(dato);
		if (this.com == null || this.com.getInfo().compareTo(dato) > 0){
			nodo.setSig(this.com);
			this.com = nodo;
		}else{
			p = this.com;
			q = p.getSig(); // es lo mismo que this.com.getSig()
			while (q != null && q.getInfo().compareTo(dato) < 0){ // Ojo con el orden!! q y q.getSig() es lo mismo para comprobar null??
				p = p.getSig();
				q = q.getSig();
			}
			if (q == null){
				p.setSig(nodo);
			}else{
				nodo.setSig(p.getSig());
				p.setSig(nodo);
			}
		}	
	}
	
	public void addOrdenado2(Asignatura dato) { //corregido
		NodoAsignatura p, q, nuevoNodo;
		nuevoNodo = new NodoAsignatura(dato);
		if (this.com == null || this.com.getInfo().compareTo(dato.getNombre()) > 0)
			this.addBegin(dato);
		else {
			p = this.com;
			q = p.getSig();
			while (q != null && q.getInfo().compareTo(dato.getNombre()) < 0) {
				p = p.getSig();
				q = q.getSig();
			}
			if (q == null)
				p.setSig(nuevoNodo);
			else {
				nuevoNodo.setSig(p.getSig());
				p.setSig(nuevoNodo);
			}
		}
	}
	
	public boolean borrar(Asignatura dato) {
		boolean encontrado;
		NodoAsignatura p, q;
		
		if (this.com == null) {
			return false;
		} else {
			p = this.com;
			q = this.com.getSig();
			encontrado = false;
			if (this.com.getInfo().compareTo(dato.getNombre()) == 0) {
				this.com = this.com.getSig();
				return true;
			} else {
				while (q != null && encontrado == false) {
					if (q.getInfo().compareTo(dato.getNombre()) == 0) {
						encontrado = true;
					} else {
						p = p.getSig();
						q = q.getSig();
					}
				}
			}
			if (encontrado == true) {
				p.setSig(q.getSig());
				return true;
			}
		}
		return false;
	}
	
	
	public void ordenarLista() {
		NodoAsignatura p = this.com;
		NodoAsignatura q;
		Asignatura aux;
		
		while (p.getSig() != null) {
			q = p.getSig();
			
			while (q != null) {
				if (p.getInfo().compareTo(q.getInfo()) > 0) {
					aux = p.getInfo();
					p.setInfo(q.getInfo());
					q.setInfo(aux);
				}
				q = q.getSig();
			}
			p = p.getSig();
		}
		
	}
	
	
	
	
	
	
	
	
}
