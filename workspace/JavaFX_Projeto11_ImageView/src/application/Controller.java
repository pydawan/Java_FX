package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {
	
	@FXML
	private Label result;
	
	@FXML
	private TextField txt;
	
	@FXML
	private PasswordField senha;
	
	
	public void entrar(ActionEvent evento) throws Exception{
		
		if(txt.getText().equals("rafael") && senha.getText().equals("rafael")){
			result.setText("OK");
			
			Stage primaryStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
			Scene sena = new Scene(root);
			sena.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(sena);
			primaryStage.show();
		}else{
			result.setText("SENHA E LOGIN ERRADOS");
		}
	}

}
