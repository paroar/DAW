
public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno a1 = new Alumno("Pablo","Rodr�guez");
		Comparator c = new CompararAsignaturaNombre();
		a1.addAsignaturaOrder("Sistemas", c);
		a1.addAsignaturaOrder("Bases", c);
		a1.addAsignaturaOrder("Formaci�n", c);
		a1.addAsignaturaOrder("Programaci�n", c);
		
		a1.borrarAsignatura("Sistemas");
		
		System.out.println(a1);
		
	}

}
