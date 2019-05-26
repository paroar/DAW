import java.util.Arrays;

public class Receta {
	
	private String nombre;
	private String [] ingredientes;
	private int n;
	private Lista pasosPreparacion;
	
	public Receta(){
		this.ingredientes=new String[10];
		this.n=0;
		this.pasosPreparacion=new Lista();
	}
	
	public Receta(String nombre){
		this.nombre=nombre;
		this.ingredientes=new String[10];
		this.n=0;
		this.pasosPreparacion=new Lista();
	}
	
	public Receta(String nombre, String[] ingredientes, int n, Lista pasosPreparacion) {
		super();
		this.nombre = nombre;
		this.ingredientes = ingredientes;
		this.n = n;
		this.pasosPreparacion = pasosPreparacion;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void addIngrediente(String ingrediente){
		this.ingredientes[this.n]=ingrediente;
		this.n++;
	}
	
	public void addPaso(Paso paso){
		this.pasosPreparacion.add(paso);
	}
	
	@Override
	public String toString() {
		return "Receta [nombre=" + nombre + ", ingredientes=" + Arrays.toString(ingredientes) + ", n=" + n
				+ ", pasosPreparacion=" + pasosPreparacion.toString() + "]";
	}
	

}
