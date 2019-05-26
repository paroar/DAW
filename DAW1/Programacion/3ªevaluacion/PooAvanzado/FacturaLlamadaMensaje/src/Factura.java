
public class Factura {

	private int numFactura;
	private Lista lista;
	
	public Factura(int numFactura) {
		this.numFactura = numFactura;
		this.lista = new Lista();
	}
	
	public double importe() {
		double imp = this.lista.importe();
		return imp;
	}
	
	public void visualizar() {
		this.lista.visualizar();
	}
	
	public void addOrder(Facturable f, Comparator c) {
		this.lista.addOrder(f, c);
	}
}
