import java.util.Arrays;

public class Pizza extends Receta implements FastFoodeable{
	
	private Preparacion tipo; //Modificado por Pilar
	
	public Pizza() {
		super();
	}
	
	
	public Pizza(String nombre, String[] ingredientes, int n, Lista pasosPreparacion) {
		super(nombre, ingredientes, n, pasosPreparacion);
		// TODO Auto-generated constructor stub
	}



	public Pizza(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}



	public Preparacion getTipo() { //Modificado por Pilar
		return tipo;
	}

	public void setTipo(Preparacion tipo) { //Modificado por Pilar
		this.tipo = tipo;
	}
	
	@Override
	public Tiempo tiempoDePreparacion() {
		return this.tiempoTotal();
	}

	@Override
	public boolean isVegetariano() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Preparacion tipoPreparacion() { //Modificado por Pilar
		return this.getTipo();
	}

	@Override
	public String toString() {
		return "Pizza [tipo=" + tipo + ", getTipo()=" + getTipo() + ", tiempoDePreparacion()=" + tiempoDePreparacion()
				+ ", isVegetariano()=" + isVegetariano() + ", tipoPreparacion()=" + tipoPreparacion() + super.toString() + "]";
	}
	
	

}
