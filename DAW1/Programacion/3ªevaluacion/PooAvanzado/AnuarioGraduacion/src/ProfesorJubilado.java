
public class ProfesorJubilado extends Profesor implements Graduable {
	
	private Fecha fechaJubilacion;

	public ProfesorJubilado() {
		super();
	}

	public ProfesorJubilado(String nombre, Materia materia, Fecha fechaJubilacion) {
		super(nombre, materia);
		this.fechaJubilacion= fechaJubilacion;
	}

	public Fecha getFechaJubilacion() {
		return fechaJubilacion;
	}

	@Override
	public String toString() {
		return "ProfesorJubilado [fechajubilacion=" + fechaJubilacion
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public Fecha getFecha() {
		return this.getFechaJubilacion();
	}

	@Override
	public String diploma() {
		return this.getNombre() + this.fechaJubilacion + this.getMateria();
	}
	

}