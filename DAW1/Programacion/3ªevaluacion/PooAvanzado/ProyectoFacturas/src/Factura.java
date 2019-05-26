
public class Factura {

	private int numeroFactura;
	private Lista lista;
	
	public Factura(int numero) {
		this.numeroFactura=numero;
		this.lista=new Lista();
	}
	
	public void add(Facturable f) {
		this.lista.add(f);
	}
	
	public double importeTotal() {
		double importe=lista.importeLista();
		return importe;
	}
	
	public String toString() {
		String s="FACTURA\n";
		
	}
}
