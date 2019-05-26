
public class Sandwich extends Receta implements FastFoodeable {
	
	private Tipo tipo;
	
	public Sandwich(Tipo tipo) {
		super();
		this.tipo = tipo;
	}

	public Sandwich() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sandwich(String nombre, String[] ingredientes, int n, Lista pasosPreparacion, Tipo tipo) {
		super(nombre, ingredientes, n, pasosPreparacion);
		// TODO Auto-generated constructor stub
	}

	public Sandwich(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Tiempo tiempoDePreparacion() {
		// TODO Auto-generated method stub
		return this.tiempoDePreparacion();
	}

	@Override
	public boolean isVegetariano() {
		// TODO Auto-generated method stub
		if(this.tipo==Tipo.FRIO)return true;
		else  return false;
	}

	@Override
	public Preparacion tipoDePreparación() {
		// TODO Auto-generated method stub
		if(this.tipo==Tipo.FRIO) return Preparacion.CRUDO;
		else if (this.tipo==Tipo.MIXTO) return Preparacion.ALHORNO;
		else return Preparacion.FRITO;
	}

	@Override
	public String toString() {
		return "Sandwich [tipo=" + tipo + ", toString()=" + super.toString() + "]";
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return this.getNombre();
	}
	

}
