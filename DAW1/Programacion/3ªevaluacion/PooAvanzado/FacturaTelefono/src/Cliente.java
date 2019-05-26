import java.util.Comparator;

public class Cliente {

	private String nombre;
	private int nCliente;
	private Tipo tipo;
	private Factura factura;
	
	public Cliente(String nombre, int nCliente, Tipo tipo, Fecha fecha, int numFactura) {
		this.nombre = nombre;
		this.nCliente = nCliente;
		this.tipo = tipo;
		this.factura = new Factura(fecha, numFactura);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getnCliente() {
		return nCliente;
	}

	public void setnCliente(int nCliente) {
		this.nCliente = nCliente;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	
	public void addFacturable(Facturable f) {
		this.factura.addFacturable(f);
	}
	
	public double importe() {
		return this.factura.importe();
	}
	
	public String toString() {
		return this.factura.toString();
	}
	
	public void ordenar(Comparator c) {
		this.factura.ordenar(c);
	}
}
