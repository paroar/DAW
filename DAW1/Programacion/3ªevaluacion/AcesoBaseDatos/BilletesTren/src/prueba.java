import java.math.BigInteger;
import java.sql.Connection;
import java.util.Date;
import java.util.UUID;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.sql.*;

public class prueba {

	public static void main(String[] args) {
		// MEN� PABLO EL MAND�N
		Connection c = MisMetodosBD.accesoBD();
		while (true) {
			System.out.println("\n************\n" 
					+ "1.Comprobar disponibilidad\n" 
					+ "2.Mostrar billetes\n" 
					+ "0.Salir\n");
			int option = InputData.readInt();
			switch (option) {
			case 1:
				MisMetodosBD.disponibilidad(c, MisMetodosBD.elegirLinea(c));
				break;
			case 2:
				MisMetodosBD.listarPorLinea(c, MisMetodosBD.elegirLinea(c));
				break;
			default:
				System.exit(1);
			}
		}
	}
}
