import java.util.Comparator;

public class CompararAlumnosPorDni implements Comparator {
	
	public int compare(Object o1, Object o2) {
		Alumno a1 = (Alumno) o1;
		Alumno a2 = (Alumno) o2;
		
		String dniA1 = a1.getDni();
		String dniA2 = a2.getDni();
		
		return dniA1.compareTo(dniA2);
	}
}
