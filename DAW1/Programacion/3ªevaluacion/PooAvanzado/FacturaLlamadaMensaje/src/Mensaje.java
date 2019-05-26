
public class Mensaje implements Facturable{

	private Fecha fecha;
	private double precio;
	
	public Mensaje(Fecha fecha, double precio) {
		this.fecha = fecha;
		this.precio = precio;
	}
	
	public double importe() {
		return this.precio;
	}
	
	public Fecha obtenerFecha() {
		return this.fecha;
	}
	
	public void visualizar() {
		String s = this.fecha.toString() + "\n"
				 + this.precio;
		System.out.println(s);
	}
}
