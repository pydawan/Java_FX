package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Label;

import javafx.scene.control.PasswordField;

public class MainController {
	@FXML
	private PasswordField pass;
	@FXML
	private TextField user;
	@FXML
	private Button btnAction;
	@FXML
	private Label login;
	
	
	public void acessar(ActionEvent event){
		
		if(user.getText().equals("rafael") && pass.getText().equals("rafael")){
			login.setText("Usuário Logado com Sucesso!!!");
			try {
				Parent root = FXMLLoader.load(getClass().getResource("/application/Segunda.fxml"));
				Scene scene = new Scene(root);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				Stage secundaryStage = new Stage();
				secundaryStage.setScene(scene);
				secundaryStage.show();	
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}else{
			login.setText("Usuário ou Senha Errada");
		}
	}
	public void voltar(ActionEvent event){
		
	System.exit(0);
		
		
	}
	
	
	
	

}
