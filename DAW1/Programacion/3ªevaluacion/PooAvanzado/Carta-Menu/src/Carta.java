import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Carta {
	
	private String titulo;
	private Map <DiaSemana,Menu>carta;
	
	public Carta(String titulo) {
		this.titulo = titulo;
		this.carta = new HashMap<DiaSemana,Menu>();
	}
	
	public Carta(String titulo, Map carta) {
		this.titulo = titulo;
		this.carta = carta;
	}
	
	public void add(DiaSemana d,Menu m){
		this.carta.put(d, m);
	}
	
	public Tiempo tiempoTotal(){
		Tiempo t=new Tiempo(0,0);
		DiaSemana d;
		Menu menu;
		Set s=this.carta.keySet();
		
		Iterator  <DiaSemana>it= s.iterator();
		while (it.hasNext()){
			d= it.next();
			menu = this.carta.get(d);
			t.suma(menu.tiempoDePreparacion());
		}
		
		return t;
	}
	
	public Tiempo tiempoMedio (){
		Tiempo t=new Tiempo(0,0);
		DiaSemana d;
		Menu menu;
		int cont=0;
		Set s=this.carta.keySet();
		
		Iterator <DiaSemana>it= s.iterator();
		while (it.hasNext()){
			cont++;
			d= it.next();
			menu = this.carta.get(d);
			t.suma(menu.tiempoDePreparacion());
		}
		
		t.division(cont); 
		return t;
	}
	
	public Tiempo tiempoMedioMenu(DiaSemana d){
		Menu m=this.carta.get(d);  //es un Object sin parametrizar
		return m.tiempoMedio();
	}
	
	public int porcentajeVegetarianos(){
		int vegetarianos=0;
		DiaSemana d;
		Menu menu;
		int cont=0;
		Set s=this.carta.keySet();
		
		Iterator  <DiaSemana>it= s.iterator();
		while (it.hasNext()){
			cont++;
			d= it.next();    //es un Object sin parametrizar
			menu = this.carta.get(d);  //es un Object sin parametrizar
			vegetarianos=vegetarianos+menu.porcentajeVegetarianos();
		}
		
		int porcentaje = vegetarianos/cont;//la media de todos los prcentajes
		return porcentaje;
	}
	
	public int porcentajeVegetarianosMenu(DiaSemana d){
		Menu m=this.carta.get(d);  //es un Object sin parametrizar
		return m.porcentajeVegetarianos();
	}
}
