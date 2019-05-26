import java.util.*;

public class Prueba {

	public static void main(String[] args) {
		
		Alumno a = new Alumno("Pepe", "Gotera", "00022", 44);
		Alumno b = new Alumno("Otilio", "Gotera", "00087", 36);
		Iterator<Alumno> it;
		Alumno x;
		Fecha f;
		Map<Alumno,Fecha> s=new HashMap<Alumno,Fecha>();
		Fecha f1=new Fecha(1,1,1);
		Fecha f2=new Fecha(2,2,2);
		
		s.put(a,f1);
		s.put(b,f2);
		
		Set<Alumno> k=s.keySet();

		it=k.iterator();
		while(it.hasNext()) {
			x=it.next();
			f=s.get(x);
			System.out.println(x+"->"+f);
		}
		
		

	}

}
