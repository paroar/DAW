
public class Paso {
	private String descripcion;
	private Tiempo tiempoPreparacion;
	
	public Paso() {
		this.tiempoPreparacion = new Tiempo();
	}

	public Paso(String descripcion, Tiempo tiempoPreparacion) {
		this.descripcion = descripcion;
		this.tiempoPreparacion = tiempoPreparacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Tiempo getTiempoPreparacion() {
		return tiempoPreparacion;
	}

	public void setTiempoPreparacion(Tiempo tiempoPreparacion) {
		this.tiempoPreparacion = tiempoPreparacion;
	}
	
	

}
