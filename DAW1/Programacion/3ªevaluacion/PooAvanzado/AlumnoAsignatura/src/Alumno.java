
public class Alumno {

	private String nom;
	private String apes;
	private Lista lista;
	
	public Alumno(String nom, String apes) {
		this.nom = nom;
		this.apes = apes;
		this.lista = new Lista();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getApes() {
		return apes;
	}

	public void setApes(String apes) {
		this.apes = apes;
	}

	public Lista getLista() {
		return lista;
	}

	public void setLista(Lista lista) {
		this.lista = lista;
	}
	
	public void addAsignaturaBegin(String nom) {
		Asignatura a = new Asignatura(nom);
		this.lista.addAsignaturaBegin(a);
	}
	
	public void addAsignaturaEnd(String nom) {
		Asignatura a = new Asignatura(nom);
		this.lista.addAsignaturaEnd(a);
	}
	
	public void addAsignaturaOrder(String nom, Comparator c) {
		Asignatura a = new Asignatura(nom);
		this.lista.addAsignaturaOrder(a, c);
	}

	@Override
	public String toString() {
		String s = this.lista.toString();
		return nom + " " + apes + "\n" + s;
	}
	
	public String mostrarAsignatura(String nom) {
		String s = this.lista.mostrarAsignatura(nom);
		return s;
	}
	
	public void modificarNota(String nom, double nota) {
		this.lista.modificarNota(nom, nota);
	}
	
	public void borrarAsignatura(String nom) {
		this.lista.borrarAsignatura(nom);
	}
	
	public double mediaAsignaturas() {
		double media = this.lista.mediaAsignaturas();
		return media;
	}
	
}
