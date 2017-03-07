package application;

import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
	
	@FXML
	private TextField nome, senha;
	
	@FXML
	private Label lb1;
	
	
	
	public void criar(ActionEvent event){
		Dados d = new Dados();
		Dao dao = new Dao();
		
		d.setNome(nome.getText());
		d.setSenha(senha.getText());
		
		try {
			dao.create(d);
			lb1.setText("Cadastrado");
		} catch (SQLException e) {
			lb1.setText("Não Cadastrado");
			e.printStackTrace();
		}
	}
	

}
