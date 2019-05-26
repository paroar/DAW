
public class Llamada implements Facturable{

	private Fecha fecha;
	private String tfnoDestino;
	private double tarifa;
	private int duracion;
	
	public Llamada(Fecha fecha, String tfnoDestino, double tarifa, int duracion) {
		this.fecha = fecha;
		this.tfnoDestino = tfnoDestino;
		this.tarifa = tarifa;
		this.duracion = duracion;
	}

	@Override
	public double importe() {
		double importe = this.tarifa*((double)this.duracion/60);
		return importe;
	}

	@Override
	public Fecha obtenerFecha() {
		return this.fecha;
	}
	
	@Override
	public String toString() {
		return this.fecha.toString() + " " + this.tfnoDestino + " " + this.tarifa + " " + this.duracion + " " + this.importe();
	}
	
	
}
