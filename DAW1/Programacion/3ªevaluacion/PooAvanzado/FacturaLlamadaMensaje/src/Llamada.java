
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
	
	public double importe() {
		return this.tarifa * this.duracion;
	}
	
	public Fecha obtenerFecha() {
		return this.fecha;
	}
	
	public void visualizar() {
		String s = fecha.toString() + "\n"
				 + this.tfnoDestino + "\n"
				 + this.tarifa + "\n"
				 + this.duracion;
		System.out.println(s);
	}
}
