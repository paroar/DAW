
public class Anuario {
	
	private Lista grupo;
	private int a�o;
	
	public Anuario(){
		grupo=new  Lista();
	}
	
	public void add(Anuarioable a){
		grupo.add(a);
		grupo.ordenar(new ComparadorAlfabetico());
	}
	
	@Override
	public String toString() {
		return "Anuario [grupo=" + grupo.toString() + ", a�o=" + a�o + "]";
	}
	

}
