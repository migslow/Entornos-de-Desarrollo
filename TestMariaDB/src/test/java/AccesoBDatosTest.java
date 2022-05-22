import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import programa.AccesoBD;

class AccesoBDatosTest {

	@Test
	void testConexionBuena() throws SQLException {
		AccesoBD abd = new AccesoBD("src/main/resources/bd.Properties.properties");
		abd.conectar();
		assertTrue(abd.testConexion());
		abd.desconectar();
	}
	
	@Test
	void testConexionMala() throws SQLException {
		AccesoBD abd = new AccesoBD("src/main/resources/bd.PropertiesMalo.properties");
		abd.conectar();
		assertTrue(abd.testConexion());
		abd.desconectar();
	}

}
