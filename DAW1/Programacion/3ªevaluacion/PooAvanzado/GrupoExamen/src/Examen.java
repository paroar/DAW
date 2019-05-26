
public class Examen implements Examinable{

	private Fecha fecha;
	private Hora hora;
	private String modulo;
	private int numeroAlumnos;
	
	public Examen(Fecha fecha, Hora hora, String modulo, int numeroAlumnos) {
		this.fecha = fecha;
		this.hora = hora;
		this.modulo = modulo;
		this.numeroAlumnos = numeroAlumnos;
	}
	
	public Fecha getFecha() {
		return fecha;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	public Hora getHora() {
		return hora;
	}

	public void setHora(Hora hora) {
		this.hora = hora;
	}

	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	public int getNumeroAlumnos() {
		return numeroAlumnos;
	}

	public void setNumeroAlumnos(int numeroAlumnos) {
		this.numeroAlumnos = numeroAlumnos;
	}

	@Override
	public int hayAlumnos() throws HayPocos {
		if(numeroAlumnos<10) {
			throw new HayPocos("Hay menos de 10 alumnos");
		}
		return this.numeroAlumnos;
	}
	
	@Override
	public Fecha primerDia() {
		// TODO Auto-generated method stub
		return null;
	}
}
