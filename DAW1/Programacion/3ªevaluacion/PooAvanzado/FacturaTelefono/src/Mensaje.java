
public class Mensaje implements Facturable {

	private Fecha fecha;
	private double precio;
	
	public Mensaje(Fecha fecha, double precio) {
		this.fecha = fecha;
		this.precio = precio;
	}

	@Override
	public double importe() {
		return this.precio;
	}

	@Override
	public Fecha obtenerFecha() {
		return this.fecha;
	}
	
	@Override
	public String toString() {
		return this.fecha.toString() + " " + this.precio;
	}
	
	
}
