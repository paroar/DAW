
public class DemasiadasHoras extends Exception{
	
	private Hora hora;
	private DiaSemana dia;
	private String asignatura;
	
	public DemasiadasHoras() {

	}

	public Hora getHora() {
		return hora;
	}

	public void setHora(Hora hora) {
		this.hora = hora;
	}

	public DiaSemana getDia() {
		return dia;
	}

	public void setDia(DiaSemana dia) {
		this.dia = dia;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	@Override
	public String toString() {
		return asignatura + dia + hora;
	}
	
	

}
