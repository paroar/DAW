
public class AlumnoRepetidor extends Alumno{

	private double mediaAnterior;
	
	public AlumnoRepetidor(String nombre, String numeroMatricula, String ciclo) {
		super(nombre, numeroMatricula, ciclo);
		this.mediaAnterior = 0;
	}
	
}
