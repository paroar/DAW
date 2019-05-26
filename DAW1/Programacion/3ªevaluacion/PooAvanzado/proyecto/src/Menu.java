import java.util.*;

public class Menu {

	private TreeSet menu;
	
	public Menu(Comparator c) {
		this.menu = new TreeSet(c);
	}
	
	public void add(Object o) {
		Receta r = (Receta)o;
		this.menu.add(r);
	}
		
	public Tiempo tiempoMedioMenu() {
		Iterator it = this.menu.iterator();
		Tiempo t = new Tiempo();
		while(it.hasNext()) {
			Receta r = (Receta)it.next();
			t.suma(r.tiempoTotal());
		}
		int res = t.toMin()/this.menu.size();
		Tiempo medio = new Tiempo(0,res);
		return medio;
	}
	
	public double porcentajeVegetariano() {
		int contador = 0;
		Iterator it = this.menu.iterator();
		while(it.hasNext()) {
			Receta r = (Receta)it.next();
			if(r.isVegetariano()) {
				contador++;
			}
		}
		return (double)contador/this.menu.size();
	}
	
	public String toString() {
		String s = "";
		Iterator it = this.menu.iterator();
		while(it.hasNext()) {
			Receta x = (Receta)it.next();
			s += x.toString();
		}
		return s;
	}
	
}
