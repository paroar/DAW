
public class Receta {

	private String nombre;
	private String[] ingredientes;
	private Lista pasosPreparacion;
	
	public Receta() {
		this.pasosPreparacion = new Lista();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String[] getIngredientes() {
		return this.ingredientes;
	}
	
	public void setIngredientes(String[] ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	public Lista getPasosPreparacion() {
		return this.pasosPreparacion;
	}
	
	public void setPasosPreparacion(Lista pasosPreparacion) {
		this.pasosPreparacion = pasosPreparacion;
	}
	
	public Tiempo tiempoTotal() {
		Tiempo = this.pasosPreparacion.tiempoTotal();
	}
}
