
public class Alumno {

	private String nombre;
	private String apellidos;
	private Lista asignaturas;
	
	public Alumno() {
	
	}

	public Alumno(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.asignaturas = new Lista();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Lista getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(Lista asignaturas) {
		this.asignaturas = asignaturas;
	}
	
	public void addNodoAsignaturaFin(String nombre, double nota) {
		Asignatura nueva_asignatura = new Asignatura(nombre, nota);
		NodoAsignatura nuevo = new NodoAsignatura(nueva_asignatura);
		if(this.getAsignaturas().getCom() == null) {
			this.getAsignaturas().setCom(nuevo);
		}else {
			NodoAsignatura p = this.getAsignaturas().getCom();
			while(p.getSig() != null && !nueva_asignatura.equals(p.getAsignatura())) {
				p = p.getSig();
			}
			if(nueva_asignatura.equals(p.getAsignatura())) {
				System.out.println("Error: ¡La asignatura " + nombre + " ya existe!");
				return;
			}
			p.setSig(nuevo);
		}
	}
	
	public void cambiarNotaAsignatura(String nombre, double nota) {
		Asignatura nueva_asignatura = new Asignatura(nombre, nota);
		NodoAsignatura nuevo = new NodoAsignatura(nueva_asignatura);
		if(this.getAsignaturas().getCom() == null) {
			System.out.println("Error: ¡La asignatura no existe!");
			return;
		}else {
			NodoAsignatura p = this.getAsignaturas().getCom();
			while(p.getSig() != null && !nueva_asignatura.equals(p.getAsignatura())) {
				p = p.getSig();
			}
			if(nueva_asignatura.equals(p.getAsignatura())) {
				p.getAsignatura().setNota(nota);
				System.out.println("Nota de " + nombre + " actualizada");
				return;
			}
			System.out.println("Error: ¡La asignatura no existe!");
		}
	}
	
	public void cambiarNodoNotaAsignatura(String nombre, double nota) {
		Asignatura nueva_asignatura = new Asignatura(nombre, nota);
		NodoAsignatura nuevo = new NodoAsignatura(nueva_asignatura);
		if(this.getAsignaturas().getCom() == null) {
			System.out.println("Error: ¡La asignatura no existe!");
			return;
		}else {
			NodoAsignatura p = this.getAsignaturas().getCom();
			NodoAsignatura q = null;
			while(p.getSig() != null && !nueva_asignatura.equals(p.getAsignatura())) {
				q = p;
				p = p.getSig();
			}
			if(nueva_asignatura.equals(p.getAsignatura())) {
				nuevo.setSig(p.getSig());
				q.setSig(nuevo);
				System.out.println("Nota de " + nombre + " actualizada");
				return;
			}
			System.out.println("Error: ¡La asignatura no existe!");
		}
	}
	
	public void borrarAsignatura(String nombre) {
		Asignatura nueva_asignatura = new Asignatura(nombre);
		if(this.getAsignaturas().getCom() == null) {
			System.out.println("Error: ¡La asignatura " +nombre+ " no existe!");
			return;
		}else {
			NodoAsignatura p = this.getAsignaturas().getCom();
			NodoAsignatura q = null;
			while(p.getSig() != null && !nueva_asignatura.equals(p.getAsignatura())) {
				q = p;
				p = p.getSig();
			}
			if(nueva_asignatura.equals(p.getAsignatura())) {
				q.setSig(p.getSig());
				System.out.println("Asignatura " + nombre + " eliminada");
				return;
			}
			System.out.println("Error: ¡La asignatura " +nombre+ " no existe!");
		}
	}

	public String toString() {
		return nombre + " " + apellidos + "\n" + asignaturas.toString();
	}
	
	public double mediaAsignaturas() {
		double suma = 0;
		int num = 0;
		NodoAsignatura p = this.getAsignaturas().getCom();
		while(p != null) {
			suma += p.getAsignatura().getNota();
			num++;
			p = p.getSig();
		}
		double media = suma / num;
		return media;
		
	}
	
	
	
	
	
	
}
