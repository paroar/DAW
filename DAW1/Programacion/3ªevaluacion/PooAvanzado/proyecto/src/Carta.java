import java.util.*;

public class Carta {

	private Map carta;
	
	public Carta() {
		this.carta = new HashMap();
	}
	
	public void add(DiaSemana dia, Menu menu) {
		this.carta.put(dia, menu);
	}
	
	public Tiempo tiempoMedioMenu(DiaSemana dia) {
		Menu m = (Menu)this.carta.get(dia);
		return m.tiempoMedioMenu();
	}
	
	public Tiempo tiempoMedioCarta() {
		Set k = this.carta.keySet();
		Tiempo t = new Tiempo();
		Iterator it = k.iterator();
		while(it.hasNext()) {
			Menu m = (Menu)it.next();
			Tiempo n = m.tiempoMedioMenu();
			t.suma(n);
		}
		int res = t.toMin()/k.size();
		Tiempo medio = new Tiempo(0,res);
		return medio;
	}
	
	public double porcentajeVegetariano(DiaSemana dia) {
		Menu m = (Menu)this.carta.get(dia);
		return m.porcentajeVegetariano();
	}
	
	public double porcentajeVegetariano() {
		Set k = this.carta.keySet();
		int contador = 0;
		int total = 0;
		Iterator it = k.iterator();
		while(it.hasNext()) {
			Iterator it2 = ((TreeSet) it).iterator();
			while(it.hasNext()) {
				Receta r = (Receta)it2.next();
				if(r.isVegetariano()){
					contador++;
				}
				total++;
				it2.next();
			}
			it.next();
		}
		return (double)contador/total;
	}
	
	public String toString() {
		String s = "";
		Set k = this.carta.keySet();
		Iterator it = k.iterator();
		while(it.hasNext()) {
			DiaSemana d = (DiaSemana)it.next();
			Menu t = (Menu)this.carta.get(d);
			s += d.toString()+t.toString();
		}
		return s;
	}
	
}