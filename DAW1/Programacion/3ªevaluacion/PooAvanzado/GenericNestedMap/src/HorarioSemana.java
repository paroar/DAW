import java.util.*;

public class HorarioSemana {

	private SortedMap<DiaSemana,Horario> horario;
		
	public HorarioSemana() {
		this.horario = new TreeMap<DiaSemana,Horario>();
	}
	
	public void add(DiaSemana d, Horario h) {
		this.horario.put(d,h);
	}
	
	public void addHora(DiaSemana d, Tiempo t) {
		Horario h = this.horario.get(d);
		if(h == null) {
			TreeSet ts = new TreeSet<Tiempo>();
			ts.add(t);
			h = new Horario(ts);
			this.add(d, h);
		}
		else {
			h.add(t);
		}
	}
		
	public String toString() {
		String s = "";
		DiaSemana d;
		Set par = this.horario.keySet();
		
		Iterator <DiaSemana>it = par.iterator();
		while(it.hasNext()) {
			d = it.next();
			s += d.toString() + "->" + this.horario.get(d).toString() + "\n";
		}
		
		return s + "-----------\n";
	}
}


