import java.io.*;
import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(true) {
			int id;
			System.out.println("\n--------------------\n"
					+"Elige una opci�n:\n"
					+"1. A�adir empleado\n"
					+"2. Eliminar empleado\n"
					+"3. Buscar empleado\n"
					+"4. Mostrar todos los empleados\n"
					+"5. Eliminar base de datos\n"
					+"0. Salir\n");
			int option = scanner.nextInt();
			switch(option) {
				case 1: 
					MisMetodos.a�adirEmpleado();
					break;
				case 2:
					System.out.println("Introduce id del empleado a eliminar: ");
					id = scanner.nextInt();
					MisMetodos.eliminarEmpleado(id);
					break;
				case 3:
					System.out.println("Introduce id del empleado a buscar: ");
					id = scanner.nextInt();
					MisMetodos.buscarEmpleado(id);
					break;
				case 4: 
					MisMetodos.mostrarEmpleados();
					break;
				case 5: 
					MisMetodos.eliminarBaseDatos();
					break;
				default:
					System.exit(1);
			}
		}
	}

}
