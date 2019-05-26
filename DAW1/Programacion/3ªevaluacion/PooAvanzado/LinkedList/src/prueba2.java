import java.util.LinkedList;
import java.util.ListIterator;

public class prueba2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> paises=new LinkedList<String>();
		
		paises.add("España");
		paises.add("Colombia");
		paises.add("México");
		paises.add("Perú");
		
		LinkedList<String> capitales=new LinkedList<String>();
		
		capitales.add("Madrid");
		capitales.add("Bogotá");
		capitales.add("Ciudad de México");
		capitales.add("Lima");
		capitales.add("París");
		
		System.out.println(paises);
		System.out.println(capitales);
		
		ListIterator<String> itp=paises.listIterator();
		ListIterator<String> itc=capitales.listIterator();
		
		while(itc.hasNext()) {
			if(itp.hasNext()) {
				itp.next();
			}
			itp.add(itc.next());
		}
		
		System.out.println(paises);
		
		itc=capitales.listIterator();
		while(itc.hasNext()) {
			itc.next();
			if(itc.hasNext()) {
				itc.next();
				itc.remove();
			}
		}
		
		System.out.println(capitales);
		
	}

}
