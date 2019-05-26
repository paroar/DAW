
public class Alumno implements Anuarioable {
	
	private String nombre;
	private Ciclo ciclo;
	private double media;
	
	public Alumno(){
		
	}
	
	public Alumno(String nombre, Ciclo ciclo, double media){
		this.nombre=nombre;
		this.ciclo=ciclo;
		this.media=media;
	}
	  
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", ciclo=" + ciclo + ", media="
				+ media + "]";
	}
	

}
