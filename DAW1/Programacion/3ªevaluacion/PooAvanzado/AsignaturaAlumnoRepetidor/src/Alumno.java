
public class Alumno {
	
	private String nombre;
	private String numeroMatricula;
	private String ciclo;
	private Lista lista;
	
	public Alumno(String nombre, String numeroMatricula, String ciclo) {
		this.nombre = nombre;
		this.numeroMatricula = numeroMatricula;
		this.ciclo = ciclo;
		this.lista = new Lista();
	}
}
