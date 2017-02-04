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
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;

public class MainController implements Initializable {

	@FXML
	public ComboBox<String> combobox;
	@FXML
	public ListView<String> listView;
	@FXML
	private Label myLabel;
	@FXML
	private TextField txt;

	ObservableList<String> lista = FXCollections.observableArrayList();

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		//combobox.setItems(lista);
		listView.setItems(lista);
		listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

	}

	public void combobox(ActionEvent actionEvent) {

		lista.add(txt.getText());
		//smyLabel.setText(combobox.getValue());
	}

	public void listar(ActionEvent actionEvent) {
			
		//lista.add(combobox.getValue());
		ObservableList<String> nome;
		nome = listView.getSelectionModel().getSelectedItems();
		for(String nomes : nome){
			System.out.println(nomes);
		}
		
	}

}
