package programa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class AccesoBD {

	Connection conexion;
	String ficheroProperties;

	public AccesoBD(String ficheroProperties) {
		super();
		this.ficheroProperties = ficheroProperties;
	}

	public boolean testConexion() {
		boolean retorno = false;
		try {
			retorno = conexion.isValid(3);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return retorno;
	}

	public void conectar() {
		Properties bdProp = new Properties();
		InputStream fichero;
		try {
			fichero = new FileInputStream("src/main/resources/bdProperties.properties");
			bdProp.load(fichero);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			System.out.println(bdProp.getProperty("user"));
			conexion = DriverManager.getConnection("jdbc:mariadb://bd.iesguara.cf:3306/DAM1Alu15_Personas", bdProp);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void desconectar() throws SQLException {
		System.out.println("Intentando la desconexión...");
		conexion.close();
	}

	public int insertarPersona(String nombre, String apellidos, int edad) throws SQLException {
		PreparedStatement ps = conexion.prepareStatement("INSERT INTO Persona VALUES (?,?,?)");
		ps.setString(1, nombre);
		ps.setString(2, apellidos);
		ps.setInt(3, edad);

		return ps.executeUpdate();
	}
}
