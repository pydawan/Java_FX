package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.scene.control.Label;

public class MainController {
	@FXML
	private Button btn;
	@FXML
	private TextField tf1;
	@FXML
	private TextField tf2;
	@FXML
	private Label lb;
	
	
	public void somar(ActionEvent evento){
		
		int n1 = Integer.parseInt(tf1.getText());
		int n2 = Integer.parseInt(tf2.getText());
		
		int soma = n1 + n2;
		
		lb.setText(String.valueOf(soma));
	}
	public void limpar(ActionEvent eventoLimpar){
		
		tf1.setText("");
		tf2.setText("");
		
		lb.setText("");
	}

}
