package application;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ResultadoController {
	
	MainController mc = new MainController();
	
	TextField text = mc.getNome();
	
	@FXML
	private Label lbResult = mc.getLbResultado();
	@FXML
	private Label lbParabens;
	
	
	
	
	
	
	
	
	

}
