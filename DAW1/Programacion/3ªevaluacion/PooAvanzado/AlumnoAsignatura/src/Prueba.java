
public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno a1 = new Alumno("Pablo","Rodríguez");
		Comparator c = new CompararAsignaturaNombre();
		a1.addAsignaturaOrder("Sistemas", c);
		a1.addAsignaturaOrder("Bases", c);
		a1.addAsignaturaOrder("Formación", c);
		a1.addAsignaturaOrder("Programación", c);
		
		a1.borrarAsignatura("Sistemas");
		
		System.out.println(a1);
		
	}

}
