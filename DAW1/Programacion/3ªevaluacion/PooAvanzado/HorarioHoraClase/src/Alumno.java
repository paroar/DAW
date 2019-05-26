
public class Alumno {

	private String nombre;
	private String apellido;
	private Fecha fechaNacimiento;
	private Horario horario;
	
	public Alumno(String nombre, String apellido, Fecha fechaNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.horario = new Horario();
	}
	
}
