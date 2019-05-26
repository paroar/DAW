import java.util.*;

public class HorarioAsignatura {

	private TreeMap horarioAsignatura;
	
	public HorarioAsignatura() {
		this.horarioAsignatura = new TreeMap();
	}

	public void addDia(DiaSemana dS) {
		this.horarioAsignatura.put(dS, new TreeSet());
	}
	
	public void addHora(DiaSemana dS, Hora hora) throws DemasiadasHoras {
		TreeSet tS = (TreeSet)this.horarioAsignatura.get(dS);
		if(tS == null) {
			this.addDia(dS);
		}
		tS = (TreeSet)this.horarioAsignatura.get(dS);
		if(tS.size()<3) {
			tS.add(hora);
		}else if(tS.size()>=3) {
			throw new DemasiadasHoras();
		}
	}
	
	public String visualizarDias() {
		String s = "";
		DiaSemana dS;
		Set k = this.horarioAsignatura.keySet();
		Iterator it = k.iterator();
		while(it.hasNext()) {
			dS = (DiaSemana)it.next();
			s += dS.toString()+" ";
		}
		return s;
	}
	
	public String visualizarHorarioAsignatura() {
		String s = "";
		DiaSemana dS;
		Hora h;
		TreeSet tS;
		Set k = this.horarioAsignatura.keySet();
		Iterator it = k.iterator();
		while(it.hasNext()) {
			dS = (DiaSemana)it.next();
			s += dS.toString()+" ";
			tS = (TreeSet)this.horarioAsignatura.get(dS);
			Iterator itTS = tS.iterator();
			while(itTS.hasNext()) {
				h = (Hora)itTS.next();
				s += h.toString()+" ";				
			}
		}
		return s;
	}
	
	
}
