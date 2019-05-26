
public class Anuario {
	
	private Lista grupo;
	private int año;
	
	public Anuario(){
		grupo=new  Lista();
	}
	
	public void add(Anuarioable a){
		grupo.add(a);
		grupo.ordenar(new ComparadorAlfabetico());
	}
	
	@Override
	public String toString() {
		return "Anuario [grupo=" + grupo.toString() + ", año=" + año + "]";
	}
	

}
