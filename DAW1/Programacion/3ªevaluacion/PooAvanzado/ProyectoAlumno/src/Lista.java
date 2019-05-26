
public class Lista {

	private NodoAsignatura com;

	public Lista() {

	}

	public NodoAsignatura getCom() {
		return com;
	}

	public void setCom(NodoAsignatura com) {
		this.com = com;
	}	
	
	public void addNodoAsignaturaFin(String nombre, double nota) {
		Asignatura nueva_asignatura = new Asignatura(nombre, nota);
		NodoAsignatura nuevo = new NodoAsignatura();
		if(this.com == null) {
			this.com = nuevo;
		}else {
			NodoAsignatura p = this.com;
			while(p.getSig() != null) {
				p = p.getSig();
			}
			p.setSig(nuevo);
		}
	}
	
	public String toString() {
		String s = "";
		NodoAsignatura p = this.com;
		while (p != null) {
			s += p.getAsignatura().toString();
			p = p.getSig();
		}
		return s;
	}
	
	
}
