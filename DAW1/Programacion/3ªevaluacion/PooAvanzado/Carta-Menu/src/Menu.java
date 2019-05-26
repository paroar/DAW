import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Menu implements FastFoodeable{
	
	private String titulo;
	private TreeSet <FastFoodeable>menu;
	
	public Menu(String titulo) {
		this.titulo = titulo;
		this.menu = new TreeSet<FastFoodeable>(new ComparadorPorDescripcion());
	}
	
	public Menu(String titulo, Comparator c) {
		this.titulo = titulo;
		this.menu = new TreeSet<FastFoodeable>(c);
	}
	
	public Menu(String titulo, TreeSet menu) {
		super();
		this.titulo = titulo;
		this.menu = menu;
	}
	
	public void add(FastFoodeable f){
		this.menu.add(f);
		
	}
	
	@Override
	public Tiempo tiempoDePreparacion() {
		// TODO Auto-generated method stub
		Tiempo t = new Tiempo (0,0);
		FastFoodeable f;
		Iterator<FastFoodeable> it= this.menu.iterator();
		while (it.hasNext()){
			f= it.next();
			t.suma(f.tiempoDePreparacion());
		}
		
		return t;
	}
	@Override
	public boolean isVegetariano() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Preparacion tipoDePreparación() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return null;
	}
	public Tiempo tiempoMedio(){
		Tiempo t= new Tiempo(0,0);
		FastFoodeable f;
		int cont=0;
		Iterator <FastFoodeable>it= this.menu.iterator();
		while(it.hasNext()){
			cont++;
			f=it.next();
			t.suma(f.tiempoDePreparacion());
			
		}
		t.division(cont);
		return t;
	}
	public int porcentajeVegetarianos(){
		FastFoodeable f;
		int vegetarianos=0;
		int cont=0;
		Iterator <FastFoodeable>it= this.menu.iterator();
		while(it.hasNext()){
			cont++;
			f=it.next();
			if(f.isVegetariano()){
				vegetarianos++;
			}
			
		}
		return vegetarianos*100/cont;
	}
	

}
