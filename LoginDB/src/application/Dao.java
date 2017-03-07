package application;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class Dao {
	
	public void create(Dados d) throws SQLException{
		
		StringBuilder sql = new StringBuilder();
		
		sql.append("INSERT INTO dados (nome, senha) value (?, ?)");
		
		Connection conec = Conexao.conectar();
		
		PreparedStatement strt = (PreparedStatement) conec.prepareStatement(sql.toString());
		
		strt.setString(1, d.getNome());
		strt.setString(2, d.getSenha());
		
		strt.executeUpdate();
	
	}

}
