import java.util.*;

public abstract class Examenes implements Examinable{

	private Set examenes;
	
	public Examenes(Set examenes) {
		this.examenes = examenes;
	}
	
	public Examenes(Comparator c) {
		this.examenes = new TreeSet(c);
	}

	public Set getExamenes() {
		return examenes;
	}

	public void setExamenes(Set examenes) {
		this.examenes = examenes;
	}

	@Override
	public int hayAlumnos() throws HayPocos{
		Examinable ex;
		int n = 0;
		Iterator it = this.examenes.iterator();
		while(it.hasNext()) {
			ex = (Examinable)it.next();
			n += ex.getNumeroAlumnos();
		}
		if(n < 10) {
			throw new HayPocos("Hay pocos alumnos");
		}
		return n;	
	}

	@Override
	public Fecha primerDia() {
		Fecha f1 = null;
		Examinable e;
		Iterator it = this.examenes.iterator();
		while(it.hasNext()) {
			e = (Examinable)it.next();
			if(this.obtenerClase(e)) {
				return e.getFecha();
			}
		}
		return f1;
	}
	
	public boolean obtenerClase(Examinable e) {
		if(e.getClass().equals("class Examen")) {
			return true;
		}
		return false;
	}

	@Override
	public abstract String getModulo();

	@Override
	public abstract Fecha getFecha();

	@Override
	public abstract Hora getHora();

	@Override
	public abstract int getNumeroAlumnos();
	
}
