package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class MainController implements Initializable{

	final MyName my = new MyName();
	
	@FXML
	private Label lbl;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		my.setNumber(0);
		my.numberProperty().addListener(new ChangeListener<Object>() {

			@Override
			public void changed(ObservableValue<? extends Object> observable, Object oldValue, Object newValue) {
				
				lbl.setText(new Double(my.getNumber()).toString());
				
			}
		});
	}
	
	public void btnClick(ActionEvent event){
		my.setNumber(my.getNumber()+1);
	}

}
