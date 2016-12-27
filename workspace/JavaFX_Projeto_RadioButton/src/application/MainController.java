package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class MainController {
	
	@FXML
	private RadioButton rb1;
	
	@FXML
	private RadioButton rb2;
	
	@FXML
	private Label lb1;
	
	public void radioSelect(ActionEvent evento){
		
		String mensagens = "";
		if(rb1.isSelected()){
			lb1.setText("Radio Bot�o 1");
		}
		if(rb2.isSelected()){
			lb1.setText("Radio Bot�o 2");
		}
		if(rb1.isSelected()){
			mensagens += rb1.getText()+"\n";
		}
		if(rb2.isSelected()){
			mensagens += rb2.getText()+"\n";
		}
		lb1.setText(mensagens);
	}

}
