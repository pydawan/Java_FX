package application;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controle {
	
	@FXML
	private Label minhaMen;
	public void generateRandom(ActionEvent evento){
		
		Random rand = new Random();
		int myRand = rand.nextInt(100)+1;
		minhaMen.setText(Integer.toString(myRand));
	}

}
