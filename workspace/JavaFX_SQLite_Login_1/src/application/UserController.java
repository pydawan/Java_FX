package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class UserController implements Initializable{
	
	@FXML
	private Label userLbl;
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	public void GetUser(String user){
		
		
		userLbl.setText(user);
	}

}