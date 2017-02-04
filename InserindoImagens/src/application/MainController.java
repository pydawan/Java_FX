package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class MainController {
	
	@FXML
	private Label lb;
	@FXML
	private PasswordField senha;
	@FXML
	private TextField usuario;
	@FXML
	private ImageView img;
	
	
	public void action(ActionEvent event){
		
		if(usuario.getText().equals("rafael") && senha.getText().equals("rafael")){
			lb.setText("Logado");			
		}else{
			lb.setText("Erro");
		}
	}
}
