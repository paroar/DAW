import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;



public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> personas = new LinkedList<String>();
		personas.add("Pepe");
		personas.add("Sandra");
		personas.add("Ana");
		personas.add("Laura");
		
		System.out.println(personas.size());
		
		ListIterator<String> it = personas.listIterator();
		it.next();
		it.add("Juan");
		it.previous();
		it.add("Juan2");
		/*while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		for(String persona:personas) {
			System.out.println(persona);
		}
	}

}
