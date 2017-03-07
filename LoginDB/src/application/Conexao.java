package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	private static final String URL = "jdbc:mysql://localhost/login";
	private static final String SENHA = "q1w2e3r4";
	private static final String USER = "root";
	
	
	
	public static Connection conectar() throws SQLException{
		
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		Connection cone = DriverManager.getConnection(URL, USER, SENHA);
		return cone;
		
		
	}

}
