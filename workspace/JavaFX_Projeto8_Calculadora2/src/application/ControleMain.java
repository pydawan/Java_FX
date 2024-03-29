package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ControleMain {
	
	@FXML
	private Label result;
	private String operador = "";
	private Controle controle = new Controle();
	private long num1 = 0;
	private boolean start = true;
	
	@FXML
	public void operadorNumerico(ActionEvent evN){
		
		if(start){
			result.setText("");
			start = false;
		}
		String value = ((Button) evN.getSource()).getText();
		result.setText(result.getText()+value);
	}
	
	public void operadorOper(ActionEvent evOp){
		String value = ((Button) evOp.getSource()).getText();
		if(!value.equals("=")){
			if(!operador.isEmpty()){
				return;
			}
			operador = value;
			num1 = Long.parseLong(result.getText());
			result.setText("");
		}else{
			if(operador.isEmpty()){
				return;
			}
			long num2 = Long.parseLong(result.getText());
			float output = controle.calculator(num1, num2, operador);
			result.setText(String.valueOf(output));
			operador = "";
			start = true;
		}
	}
	
	

}
