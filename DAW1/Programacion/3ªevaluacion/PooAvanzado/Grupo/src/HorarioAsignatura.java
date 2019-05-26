import java.util.*;

public class HorarioAsignatura {

	private SortedMap horario;
		
	public HorarioAsignatura(DiaSemana d, Hora h){
		this.horario = new TreeMap();
		this.add(d, new Horario(h));
	}
	
	public SortedMap getHorario() {
		return this.horario;
	}
	
	public int contarHoras() {
		int suma = 0;
		Horario horario;
		Collection ho = this.horario.values();
		Iterator it = ho.iterator();
		while(it.hasNext()) {
			horario = (Horario)it.next();
			suma += horario.getHorario().size();
		}
		return suma;
	} 
	
	public void add(DiaSemana d, Horario h) {
		this.horario.put(d,h);
	}
	
	public void addHorarioAsignatura(DiaSemana d, Hora h) throws DemasiadasHoras{
		Horario horario = (Horario)this.horario.get(d);
		if(horario != null) {
			horario.addHora(h);
		}else {
			this.add(d, new Horario(h));
		}
	}
		
	public String toString() {
		String s = "";
		DiaSemana d;
		Set par = this.horario.keySet();
		Iterator it = par.iterator();
		while(it.hasNext()) {
			d = (DiaSemana)it.next();
			s += d.toString() + "->" + this.horario.get(d).toString() + "\n";
		}
		return s + "\n";
	}
}


