import java.util.*;

public class Programa {
	
	private String curso;
	private SortedMap programa;
	
	public Programa(String curso) {
		this.curso = curso;
		this.programa = new TreeMap();
	}
	
	public void add(String k, HorarioSemana v) {
		this.programa.put(k,v);
	}
		
	public String toString() {
		String s = this.curso + "\n" + "******" + "\n";
		String a;
		Set k = this.programa.keySet();
		
		Iterator it = k.iterator();
		while(it.hasNext()) {
			a = (String)it.next();
			s += a.toString() + "\n" + this.programa.get(a).toString();
		}
		
		return s;
	}
}
