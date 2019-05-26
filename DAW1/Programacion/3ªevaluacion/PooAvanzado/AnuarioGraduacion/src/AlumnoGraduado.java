
public class AlumnoGraduado extends Alumno implements Graduable {
	
	private Fecha fechaGraduacion;
	private Calificacion calificacion;
	
	public AlumnoGraduado() {
		super();
	}
	
	public AlumnoGraduado(String nombre, Ciclo ciclo, double media,Fecha fechaGraduacion) {
		super(nombre, ciclo, media);
		this.fechaGraduacion=fechaGraduacion;
		if (media >= 9){
			this.calificacion=Calificacion.SOBRESALIENTE;
		}else{
			if(media>=7){
				this.calificacion=Calificacion.NOTABLE;
			}else{
				this.calificacion=Calificacion.APROBADO;
			}
		}
	}
	
	public Fecha getFechaGraduacion() {
		return fechaGraduacion;
	}
	
	@Override
	public String toString() {
		return "AlumnoGraduado [fechaGraduacion=" + fechaGraduacion
				+ ", calificacion=" + calificacion +  super.toString() + "]";
	}
	
	@Override
	public Fecha getFecha() {
		return this.getFechaGraduacion();
	}
	
	@Override
	public String diploma() {
		return this.getNombre() +  this.fechaGraduacion + this.calificacion;
	}
		

}
