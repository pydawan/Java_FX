package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainController {
	
	@FXML
	ResController res = new ResController();
	
	
	public void som(){
		res.somar();
	}
	

}
