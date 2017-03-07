package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;

public class MainController {
	
	
	@FXML
	private TextField r1, r2, r3, r4, r5;
		
	@FXML
	private TitledPane q1,q2,q3,q4,q5;
	
	@FXML
	private Label lbResultado;


	private int mais;
	
	
	
	public void verResultado(ActionEvent event){
		
		if(r1.getText().equals("e")){
			this.mais ++;
		}
		if(r2.getText().equals("e")){
			this.mais ++;
		}
		if(r3.getText().equals("c")){
			this.mais ++;
		}
		if(r4.getText().equals("e")){
			this.mais ++;
		}
		if(r5.getText().equals("a")){
			this.mais ++;
		}
		
		
		informar();
		
		
	}
	public void informar(){
        if(this.mais == 5){
           lbResultado.setText("5 Acertos ");
        }
        if(this.mais == 4){
        	 lbResultado.setText("4 Acertos ");
        }
        if(this.mais == 3){
        	 lbResultado.setText("3 Acertos ");
        }
        if(this.mais == 2){
        	 lbResultado.setText("2 Acertos ");
        }
        if(this.mais == 1){
        	 lbResultado.setText("1 acerto ");
        }
        if(this.mais == 0){
        	 lbResultado.setText("Zero Acerto ");
        }
      }

}
