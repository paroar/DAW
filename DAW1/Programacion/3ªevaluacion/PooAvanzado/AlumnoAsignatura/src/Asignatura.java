
public class Asignatura {

	private String nom;
	private double nota;
	
	public Asignatura(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	@Override
	public String toString() {
		return nom + " : " + nota;
	}
	
	public int compareTo(Object o) {
		Asignatura a = (Asignatura)o;
		return this.nom.compareTo(a.getNom());
	}
}
