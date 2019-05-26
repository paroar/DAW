
public class Cliente {

	private String nom;
	private String apes;
	private String cod;
	private Factura factura;
	
	public Cliente(String nom, String apes, String cod, int numFactura) {
		this.nom = nom;
		this.apes = apes;
		this.cod = cod;
		this.factura = new Factura(numFactura);
	}
	
	public double importe() {
		double imp = this.factura.importe();
		return imp;
	}
	
	public void visualizar() {
		String s = this.nom + " "
				 + this.apes + ": "
				 + this.cod;
		System.out.println(s);
		this.factura.visualizar();
	}
	
	public void addOrder(Facturable f, Comparator c) {
		this.factura.addOrder(f, c);
	}
}
