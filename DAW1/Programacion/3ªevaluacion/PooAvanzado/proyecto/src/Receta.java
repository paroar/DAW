import java.util.Arrays;

public class Receta {
	
	private String nombre;
	private String[] ingredientes;
	private int n;
	private Lista pasosPreparacion;
	private boolean vegetariano;
	
	public Receta() {
		this.ingredientes = new String[10];
		this.n = 0;
		this.pasosPreparacion = new Lista();
	}
	
	public Receta(String nombre, String[] ingredientes, int n, Lista pasosPreparacion) {
		this.nombre = nombre;
		this.ingredientes = ingredientes;
		this.n = n;
		this.pasosPreparacion = pasosPreparacion;
	}
	
	public Receta(String nombre) {
		this.nombre = nombre;
		this.ingredientes = new String[10];
		this.n = 0;
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
	
	public boolean isVegetariano() {
		return vegetariano;
	}

	public void setVegetariano(boolean vegetariano) {
		this.vegetariano = vegetariano;
	}

	
	public Tiempo tiempoTotal() {
		return this.pasosPreparacion.tiempoTotal();
	}
	
	public int compareTo(Receta r) {
		return this.nombre.compareTo(r.getNombre());
	}
	
	public void addIngrediente(String ingrediente) {
		this.ingredientes[this.n] = ingrediente;
		this.n++;
	}
	
	public void addPaso(Paso paso) {
		this.pasosPreparacion.add(paso);
	}

	@Override
	public String toString() {
		return "Receta [nombre=" + nombre + ", ingredientes=" + Arrays.toString(ingredientes) + ", n=" + n
				+ ", pasosPreparacion=" + pasosPreparacion + ", vegetariano=" + vegetariano + "]";
	}

}
