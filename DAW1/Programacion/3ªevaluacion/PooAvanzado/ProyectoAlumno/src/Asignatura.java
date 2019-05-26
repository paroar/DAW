
public class Asignatura {

	private String nombre;
	private double nota;
	
	public Asignatura() {

	}
	
	public Asignatura(String nombre) {
		this.nombre = nombre;
	}
	
	public Asignatura(String nombre, double nota) {
		this.nombre = nombre;
		this.nota = nota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return nombre + " = " + nota + "\n";
	}

	@Override
	public boolean equals(Object obj) {
		Asignatura other = (Asignatura) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
	
	
	
}
