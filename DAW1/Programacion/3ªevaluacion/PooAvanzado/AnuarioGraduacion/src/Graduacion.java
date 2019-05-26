
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Graduacion {
	
	private Lista graduacion;
	
	public Graduacion(){
		graduacion = new Lista();
	}
	
	public Graduacion (Comparator c){
		graduacion = new Lista();
	}
	
	public void add(Graduable g){
		graduacion.add(g);  
	}
	
	@Override
	public String toString() {
		String s="GRADUADOS";
		Nodo p = this.graduacion.getCom();
		while (p != null){
			s = s + p.getInfo().toString();
			p = p.getSig();
		}
		return s;
	}

}
