
public class Pizza extends Receta implements FastFoodeable {
	
	private Tama�o tama�o;
	
	public Pizza(){
		super();
	}
	
	public Pizza(String nombre) {
		super(nombre);
	}

	public Pizza(Tama�o tama�o) {
		super();
		this.tama�o = tama�o;
	}

	public Pizza(String nombre, String[] ingredientes, int n, Lista pasosPreparacion, Tama�o tama�o) {
		super(nombre, ingredientes, n, pasosPreparacion);
		this.tama�o=tama�o;
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
	public Preparacion tipoDePreparaci�n() {
		return Preparacion.ALHORNO;
	}

	@Override
	public String toString() {
		return "Pizza [tama�o=" + tama�o + ", tiempoDePreparacion()=" + this.tiempoDePreparacion() + ", isVegetariano()="
				+ isVegetariano() + ", tipoDePreparaci�n()=" + tipoDePreparaci�n() + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public String getDescripcion() {
		return this.getNombre();
	}
	

}
