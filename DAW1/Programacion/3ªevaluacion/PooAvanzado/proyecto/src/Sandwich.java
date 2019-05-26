
public class Sandwich extends Receta implements FastFoodeable{
	private Preparacion tipo; //Modificado por Pilar
	
	public Preparacion getTipo() { //Modificado por Pilar
		return tipo;
	}

	public void setTipo(Preparacion tipo) { //Modificado por Pilar
		this.tipo = tipo;
	}

	@Override
	public Tiempo tiempoDePreparacion() {
		// TODO Auto-generated method stub
		return null;
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


	//public String toString
	
}
