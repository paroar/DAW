
public class Asignatura implements Comparable {
	private String nombre;
	private float nota;
	
	public Asignatura() {
		
	}

	public Asignatura(String nombre) {
		this.nombre = nombre;
		this.nota = 0;
	}
	
	public Asignatura(String nombre, float nota) {
		this.nombre = nombre;
		this.nota = nota;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public String toString() {
		return "Asignatura: " + this.nombre + ", nota: " + this.nota;
	}

	@Override
	public int compareTo(Object o) {
		Asignatura a = (Asignatura)o;
		return this.getNombre().compareTo(a.nombre);
	}
	
	

}
