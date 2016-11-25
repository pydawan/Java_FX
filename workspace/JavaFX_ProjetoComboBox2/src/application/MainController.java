package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;


public class MainController implements Initializable{
	
	@FXML
	private Label myLabel;

	@FXML
	private ComboBox<String> combo;
	
	ObservableList<String> lista = FXCollections.observableArrayList("rafael", "rose", "vitor", "Heitor");

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	public void comboChanged(ActionEvent event){
		
		combo.getItems().addAll("rafael", "rose", "vitor", "Heitor");
		
	}

}
