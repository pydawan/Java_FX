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
import javafx.scene.control.TextField;

public class MainController implements Initializable {

	@FXML
	public ComboBox<String> combobox;
	@FXML
	private Label myLabel;
	@FXML
	private TextField txt;

	ObservableList<String> lista = FXCollections.observableArrayList();

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		combobox.setItems(lista);

	}

	public void combobox(ActionEvent actionEvent) {

		lista.add(txt.getText());
		// myLabel.setText(combobox.getValue());
	}

}
