public class Grupo implements Comparable{

	private String nombre;
	private int numeroModulos;
	
	public Grupo(String nombre, int numeroModulos) {
		this.nombre = nombre;
		this.numeroModulos = numeroModulos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroModulos() {
		return numeroModulos;
	}

	public void setNumeroModulos(int numeroModulos) {
		this.numeroModulos = numeroModulos;
	}

	@Override
	public int compareTo(Object arg0) {
		Grupo g = (Grupo)arg0;
		if(this.nombre.compareTo(g.nombre) != 0) {
			return this.nombre.compareTo(g.nombre);
		}else {
			return this.numeroModulos - g.numeroModulos;
		}
	}
	
	
	
}
