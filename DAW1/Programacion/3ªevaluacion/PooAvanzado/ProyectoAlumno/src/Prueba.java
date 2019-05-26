
public class Prueba {

	public static void main(String[] args) {
		Alumno a = new Alumno("Pablo","Rodríguez");
		a.addNodoAsignaturaFin("Sistemas informáticos", 10);
		a.addNodoAsignaturaFin("Programación", 9);
		a.addNodoAsignaturaFin("Formación y orientación laboral", 8);
		a.addNodoAsignaturaFin("Lenguaje de marcas", 7);
		a.addNodoAsignaturaFin("Entornos de desarrollo", 6);
		a.addNodoAsignaturaFin("Bases de datos", 5);
		a.addNodoAsignaturaFin("Sistemas informáticos", 1);
		a.cambiarNotaAsignatura("Sistemas informáticos", 1);
		a.cambiarNodoNotaAsignatura("Entornos de desarrollo", 10);
		a.borrarAsignatura("Bases de datos");
		a.borrarAsignatura("Bases de datos");
		System.out.println(a.toString());
		System.out.println(a.mediaAsignaturas());
	}

}
