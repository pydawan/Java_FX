package application;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ControleRandom {
	
	@FXML
	private Label label;
	public void generateRandom(ActionEvent evento){
		
		Random random = new Random();
		int myRandom = random.nextInt(70)+1;
		label.setText(Integer.toString(myRandom));
	}

}
