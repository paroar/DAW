import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class MisMetodosBD {

	public static Connection accesoBD() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String sourceURL = "jdbc:mysql://localhost/vagones";
			String user = "root";
			String password = "";
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/vagones", user, password);
			return con;
		} catch (ClassNotFoundException e) {
			System.out.println(e);

		} catch (SQLException e) {
			System.out.println(e);
		}
		return null;
	}

	public static void mostrarLineas(Connection c) {
		Statement stmt;
		try {
			stmt = c.createStatement();
			String sql = "select Nombre from lineas";
			ResultSet res = stmt.executeQuery(sql);
			while (res.next()) {
				System.out.println(res.getObject("Nombre"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("************");

	}

	public static String elegirLinea(Connection c) {
		mostrarLineas(c);
		System.out.println("Introduce la l�nea: \n");
		return InputData.readString();
	}

	public static void listarPorLinea(Connection c, String linea) {
		try {
			Statement stmt = c.createStatement();
			String sql = "SELECT * FROM billetes,lineas where Nombre='" + linea + "' and billetes.IdLinea=lineas.IdLinea";
			ResultSet res = stmt.executeQuery(sql);

			while (res.next()) {
				int idBillete = (int) res.getObject("IdBillete");
				int idVagon = (int) res.getObject("IdVagon");
				String nombre = (String) res.getObject("NombreViajero");
				String pago = (String) res.getObject("Pago");
				String estado = (String) res.getObject("Estado");

				System.out.println(""
						+ "IdBillete: " + idBillete 
						+ "/ IdVagon: " + idVagon 
						+ "/ Nombre: " + nombre
						+ "/ Pago: " + pago 
						+ "/ Estado: " + estado);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void disponibilidad(Connection c, String linea) {
		try {
			Statement stmt = c.createStatement();
			String sql = "SELECT * FROM vagonesEnLinea,lineas where vagonesEnLinea.IdLinea=lineas.IdLinea and Nombre='" + linea + "'";
			ResultSet res = stmt.executeQuery(sql);

			while (res.next()) {

				int plazasLibres = (int) res.getObject("PlazasLibres");
				int IdLinea = (int) res.getObject("IdLinea");
				int IdVagon = (int) res.getObject("IdVagon");

				if (plazasLibres > 0) {
					System.out.print("" + "L�nea " + res.getObject("Nombre") + "/ N�mero de vag�n "
							+ res.getObject("NumeroVagon") + "/ Plazas libres " + res.getObject("PlazasLibres") + "\n");

					System.out.println("�Desea hacer una reserva? S / N");
					String reserva = InputData.readString();
					reserva = reserva.toUpperCase();

					if (reserva.equals("S")) {

						String IdBillete = UUID.randomUUID().toString().replaceAll("[^0-9]", "").substring(0, 7);

						SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						String FechaExpedicion = "'" + sdf.format(new Date()) + "'";

						System.out.println("Nombre del viajero: ");
						String NombreViajero = "'" + InputData.readString() + "'";

						System.out.println("Pago en efectivo: Pulse 1\n" + "Pago con tarjeta: Pulse 2");
						int pago = InputData.readInt();

						System.out.println("Recoja su reserva... \n"
								+ NombreViajero + " " + FechaExpedicion);

						stmt.executeUpdate(
								"INSERT INTO billetes (IdBillete,IdLinea,IdVagon,NombreViajero,Pago,Estado,FechaExpedicion)"
										+ "VALUES" + "(" + IdBillete + "," + IdLinea + "," + IdVagon + ","
										+ NombreViajero + "," + pago + "," + "1" + "," + FechaExpedicion + ")");

						plazasLibres--;
						stmt.executeUpdate(
								"UPDATE vagonesenlinea set PlazasLibres=" + plazasLibres + " where IdVagon=" + IdVagon);

						System.out.println("Reserva realizada con �xito");
						break;
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
