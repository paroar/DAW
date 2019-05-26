import java.util.*;

public class Horario {

	private TreeSet horario;
	
	public Horario(Hora h){
		this.horario = new TreeSet();
		this.horario.add(h);
	}
	
	public TreeSet getHorario() {
		return this.horario;
	}
	
	public void addHora(Hora h) throws DemasiadasHoras{
		if(this.horario.size()>1) {
			throw new DemasiadasHoras();
		}else {
			this.horario.add(h);
		}
	}

	public String toString() {
		String s = "";
		Hora t;
		Iterator it = this.horario.iterator();
		while(it.hasNext()) {
			t = (Hora)it.next();
			s += t.toString() + "/";
		}
		return s;
	}
}
