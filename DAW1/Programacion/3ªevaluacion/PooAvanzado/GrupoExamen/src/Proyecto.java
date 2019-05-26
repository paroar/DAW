
public class Proyecto implements Examinable{

	private Fecha fecha;
	private Hora hora;
	private String titulo;
	private String[] alumnos;
	
	public Proyecto(Fecha fecha, Hora hora, String titulo) {
		this.fecha = fecha;
		this.hora = hora;
		this.titulo = titulo;
		this.alumnos = new String[50];
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

	@Override
	public String getModulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public int getNumeroAlumnos() {
		return alumnos.length;
	}

	public void setAlumnos(String[] alumnos) {
		this.alumnos = alumnos;
	}

	@Override
	public int hayAlumnos() throws HayPocos {
		// TODO Auto-generated method stub
		if(alumnos.length<10) {
			throw new HayPocos("Hay menos de 10 alumnos");
		}
		return alumnos.length;
	}
	
	@Override
	public Fecha primerDia() {
		// TODO Auto-generated method stub
		return null;
	}

}
