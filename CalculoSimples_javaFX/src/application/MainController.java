package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
	
	@FXML
	private TextField lb1;
	
	@FXML
	private TextField lb2;
	
	@FXML
	private Label painel;
	
	@FXML
	private Button btn;
	
	private Calc calc = new Calc();
	private boolean start = true;
	private long number1 = 0;
	

	@FXML
	public void calcular(ActionEvent evento){
		
		
	}
	@FXML
	public void operadorCalc(ActionEvent eventoOp){
		if(start){
			painel.setText("");
			start = false;
		}else{
			String valor = ((TextField) eventoOp.getSource()).getText();
			painel.setText(painel.getText()+valor);
		}
		
		number1 = Long.parseLong(painel.getText());
		painel.setText("");
		
		float num2 = Integer.parseInt(painel.getText());
		float saida = calc.calcular(number1, num2);
		
		painel.setText(String.valueOf(saida));
		
		
	}
	

}
