package application;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {
	
	@FXML
	private Label lbNumero;
	@FXML
	private Button btnGerador;
	
	public void gerar(ActionEvent eventoGerador){
		
		Random random = new Random();
		int gerador = random.nextInt(50);
		lbNumero.setText(Integer.toString(gerador));		
		
	}

}
