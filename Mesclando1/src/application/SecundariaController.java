package application;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SecundariaController {
	
	@FXML
	private Label info;
	@FXML
	private Label numero;
	@FXML
	private TextField txt;
		
	
	public void geradorNumerico(ActionEvent actionEvent){
		
		Random random = new Random();
		int gerar = random.nextInt(50);
		numero.setText(Integer.toString(gerar));
		
		info.setText(info.getText());
	}

}
