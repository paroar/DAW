import java.util.Comparator;

public class Factura implements Facturable{

	private Fecha fecha;
	private int numFactura;
	private Lista factura;
	
	public Factura(Fecha fecha, int numFactura) {
		this.fecha = fecha;
		this.numFactura = numFactura;
		this.factura = new Lista();
	}

	@Override
	public double importe() {
		return this.factura.importe();
	}

	@Override
	public Fecha obtenerFecha() {
		return this.fecha;
	}
	
	@Override
	public String toString() {
		return this.factura.toString();
	}
	
	public void addFacturable(Facturable f) {
		this.factura.addBegin(f);
	}
	
	public void ordenar(Comparator c) {
		this.factura.ordenar(c);
	}
}
