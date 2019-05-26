
public class Profesor implements Anuarioable {

	private String nombre;
	private Materia materia;
	
	public Profesor(){
		
	}
	
	public Profesor(String nombre, Materia materia){
		this.nombre=nombre;
		this.materia=materia;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Materia getMateria() {
		return materia;
	}
	
	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", materia=" + materia + "]";
	}
	

}
