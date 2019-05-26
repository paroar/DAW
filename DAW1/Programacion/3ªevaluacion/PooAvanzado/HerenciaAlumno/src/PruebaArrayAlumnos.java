import java.util.Arrays;

public class PruebaArrayAlumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno[] a = new Alumno[3];
		a[0] = new Alumno("A","qwe","1",1);
		a[1] = new Alumno("C","qwe","3",3);
		a[2] = new Alumno("B","qwe","2",2);
		
		CompararAlumnosPorDni c = new CompararAlumnosPorDni();
		OrdenarArray.burbuja(a, 3, c);
		System.out.println(Arrays.toString(a));

	}

}
