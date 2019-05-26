import java.util.*;

public class ExamenesFinales {

	private Map calendario;
	
	public ExamenesFinales(Comparator c) {
		this.calendario = new TreeMap(c);
	}

	public ExamenesFinales(Map calendario) {
		this.calendario = calendario;
	}

	public Map getCalendario() {
		return calendario;
	}

	public void setCalendario(Map calendario) {
		this.calendario = calendario;
	}
	
	public void add(Grupo g, Examenes e) {
		this.calendario.put(g, e);
	}
	
	public int numeroAlumnos(Grupo g) throws HayPocos {
		Examinable e;
		int n = 0;
		Grupo p = this.contieneGrupo(g);
		if(p != null) {
			e = (Examinable)this.calendario.get(g);
			n = e.hayAlumnos();
		}
		return n;
	}
	
	public Grupo contieneGrupo(Grupo g) {
		Grupo g2;
		Set k = this.calendario.keySet();
		Iterator it = k.iterator();
		while(it.hasNext()) {
			g2 = (Grupo)it.next();
			if(g.compareTo(g2) == 0) {
				return g;
			}
		}
		return null;
	}
	
}
