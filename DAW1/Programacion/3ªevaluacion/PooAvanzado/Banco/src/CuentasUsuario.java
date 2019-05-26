import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CuentasUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cl1 = new Cliente("Antonio","1",2000);
		Cliente cl2 = new Cliente("Rafael","2",6000);
		Cliente cl3 = new Cliente("Penelope","3",10000);
		Cliente cl4 = new Cliente("Julio","4",100);
		Cliente cl5 = new Cliente("Antonio","1",2000);
		
		Set<Cliente> clientesBanco = new HashSet<Cliente>();
		clientesBanco.add(cl1);
		clientesBanco.add(cl2);
		clientesBanco.add(cl3);
		clientesBanco.add(cl4);
		clientesBanco.add(cl5);
		
		/*for (Cliente cliente : clientesBanco) {
			System.out.println(cliente);
		}*/
		
		Iterator<Cliente> it = clientesBanco.iterator();
		while(it.hasNext()) {
			String nombre_cliente = it.next().getNombre();
			System.out.println(nombre_cliente);
		}
	}

}
