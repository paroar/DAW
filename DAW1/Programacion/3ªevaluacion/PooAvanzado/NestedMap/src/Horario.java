import java.util.*;

public class Horario {

	private TreeSet horario;
	
	public Horario() {
		this.horario = new TreeSet();
	}
	
	public Horario(TreeSet t) {
		this.horario = t;
	}
	
	public void add(Tiempo t) {
		this.horario.add(t);
	}
	
	public String toString() {
		String s = "";
		Tiempo t;
		
		Iterator it = this.horario.iterator();
		while(it.hasNext()) {
			t = (Tiempo)it.next();
			s += t.toString() + "/";
		}
		
		return s;
	}
}
