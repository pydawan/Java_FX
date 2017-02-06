package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class MainController implements Initializable{
	
	@FXML
	public ListView<String> lista;
	@FXML
	private Label lb;
	@FXML
	private TextField tf;
	
	ObservableList<String>lv = FXCollections.observableArrayList();

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		lista.setItems(lv);	
		
	}
	public void click(ActionEvent actionEvent){
		lv.addAll(tf.getText());
		lb.setText(tf.getText());		
	}
	public void limpa(ActionEvent actionEvent){
		lv.clear();
	}
	public void remover(ActionEvent actionEvent){
		lv.remove(lista.getSelectionModel().getSelectedItem());
	}

}
