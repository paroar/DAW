import java.util.ArrayList;
import java.util.Iterator;

public class PruebaIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ArrayList a = new ArrayList();
		a.add("Pepe");
		a.add("Juan");
		
		Iterator it = a.iterator();
		while(it.hasNext()) {
			String x = (String) it.next();
			System.out.println(x);
		}*/
		
		String x;
		Iterator <String>it;
		ArrayList <String>a = new ArrayList<String>();
		
		it = a.iterator();
		a.add("Pepe");
		a.add("Juan");
		while(it.hasNext()) {
			x = it.next();
			System.out.println(x);
		}
	}

}
