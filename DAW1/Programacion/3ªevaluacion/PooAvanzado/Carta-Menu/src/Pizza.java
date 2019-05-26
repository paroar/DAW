
public class Pizza extends Receta implements FastFoodeable {
	
	private Tamaño tamaño;
	
	public Pizza(){
		super();
	}
	
	public Pizza(String nombre) {
		super(nombre);
	}

	public Pizza(Tamaño tamaño) {
		super();
		this.tamaño = tamaño;
	}

	public Pizza(String nombre, String[] ingredientes, int n, Lista pasosPreparacion, Tamaño tamaño) {
		super(nombre, ingredientes, n, pasosPreparacion);
		this.tamaño=tamaño;
	}

	@Override
	public Tiempo tiempoDePreparacion() {
		return this.tiempoDePreparacion();
	}

	@Override
	public boolean isVegetariano() {
		return false;
	}

	@Override
	public Preparacion tipoDePreparación() {
		return Preparacion.ALHORNO;
	}

	@Override
	public String toString() {
		return "Pizza [tamaño=" + tamaño + ", tiempoDePreparacion()=" + this.tiempoDePreparacion() + ", isVegetariano()="
				+ isVegetariano() + ", tipoDePreparación()=" + tipoDePreparación() + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public String getDescripcion() {
		return this.getNombre();
	}
	

}
