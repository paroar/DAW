import java.util.Comparator;

public class Lista {

	private Nodo com;
	
	public Lista() {
		this.com = null;
	}
	
	public Nodo getCom() {
		return this.com;
	}
	
	public void setCom(Nodo n) {
		this.com = n;
	}
	
	public void ordenar(Comparator c) {
		Facturable aux;
		Nodo p = this.com;
		Nodo q;
		while(p.getSig() != null) {
			q = p.getSig();
			while(q != null) {
				if(c.compare(p,q) > 0) {
					aux = p.getInfo();
					p.setInfo(q.getInfo());
					q.setInfo(aux);
				}
				q = q.getSig();
			}
			p = p.getSig();
		}
	}
	
	public void addBegin(Facturable f) {
		Nodo n = new Nodo(f);
		if(this.com == null) {
			this.com = n;
		}else {
			n.setSig(this.com);
			this.com = n;
		}
	}
	
	public double importe() {
		double importe = 0;
		Nodo p = this.com;
		while(p != null) {
			importe += p.getInfo().importe();
			p = p.getSig();
		}
		return importe;
	}
	
	public String toString() {
		String salida = "";
		Nodo p = this.com;
		while(p != null) {
			salida += p.getInfo().toString()+"\n";
			p = p.getSig();
		}
		return salida;
	}
	
}
