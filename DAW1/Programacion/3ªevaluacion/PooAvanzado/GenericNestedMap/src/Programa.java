import java.util.*;

public class Programa {
	
	private String curso;
	private Map<String,HorarioSemana> programa;
	
	public Programa() {
		this.programa = new TreeMap<String,HorarioSemana>();
	}
	
	public void add(String k, HorarioSemana v) {
		this.programa.put(k,v);
	}
		
	public String toString() {
		String s = "";
		String a;
		Set k = this.programa.keySet();
		
		Iterator <String>it = k.iterator();
		while(it.hasNext()) {
			a = it.next();
			s += a.toString() + "\n" + this.programa.get(a).toString();
		}
		
		return s;
	}
}
