
public class Factura {

	private int numFactura;
	private Lista lista;
	
	public Factura() {
		this.lista = new Lista();
	}

	public Factura(int numFactura) {
		this.numFactura = numFactura;
		this.lista = new Lista();
	}

	public int getNumFactura() {
		return numFactura;
	}

	public void setNumFactura(int numFactura) {
		this.numFactura = numFactura;
	}

	public Lista getLista() {
		return lista;
	}

	public void setLista(Lista lista) {
		this.lista = lista;
	}
	
	public void addFin(Facturable f) {
		this.lista.addFin(f);
	}
	
	public void addInOrder(Facturable f) {
		this.lista.addInOrder(f);
	}
	
	public String toString() {
		String s = "";
		s += "NumFactura: " + numFactura + "\n" + this.lista.toString();
		return s;
	}
	
	public double importe() {
		double importe = this.lista.importe();
		return importe;
	}
	
	
}
