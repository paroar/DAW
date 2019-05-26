import java.util.Map;
import java.util.TreeSet;

public class Carta {

	private Map carta;
	
	public Carta() {
		
	}
	
	public void add(DiaSemana dia, TreeSet menu) {
		this.carta.put(dia, menu);
	}
	
	public Tiempo tiempoMedioMenu(DiaSemana dia) {
		//TODO
		return null;
	}
	
	public Tiempo tiempoMedioCarta() {
		//TODO
		return null;
	}
	
	public double porcentajeVegetariano(DiaSemana dia) {
		//TODO
		return 0.0;
	}
	
	public double porcentajeVegetariano() {
		//TODO
		return 0.0;
	}
	
	public String toString() {
		//TODO
		return null;
	}
	
}
