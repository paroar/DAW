import java.util.Comparator;

public class CompararEdad implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		Alumno a1=(Alumno)arg0;
		Alumno a2=(Alumno)arg1;
		int e1=a1.getEdad();
		int e2=a2.getEdad();
		return e1-e2;
	}


}
