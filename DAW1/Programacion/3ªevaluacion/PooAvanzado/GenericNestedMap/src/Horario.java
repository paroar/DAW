import java.util.*;

public class Horario {

	private TreeSet <Tiempo>horario;
	
	public Horario() {
		this.horario = new TreeSet<Tiempo>();
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
		
		Iterator <Tiempo>it = this.horario.iterator();
		while(it.hasNext()) {
			t = it.next();
			s += t.toString() + "/";
		}
		
		return s;
	}
}
