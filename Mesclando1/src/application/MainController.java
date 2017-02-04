package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.scene.control.Label;

import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.control.PasswordField;

public class MainController {
	@FXML
	private Button btn;
	@FXML
	private Label lb;
	@FXML
	private ImageView img;
	@FXML
	private TextField usuario;
	@FXML
	private PasswordField senha;
	
	
	
	public void acation(ActionEvent actionEvent){
		if(usuario.getText().equals("rafael") && senha.getText().equals("rafael")){
			lb.setText("Usuário logado...");
			
			try {
				Parent root = FXMLLoader.load(getClass().getResource("/application/Secundaria.fxml"));
				Scene scene = new Scene(root);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());	
				Stage secundaryStage = new Stage();
				secundaryStage.setScene(scene);
				secundaryStage.show();
								
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
