package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import javafx.scene.control.TitledPane;

import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Label;

import javafx.scene.control.ComboBox;

import javafx.scene.image.ImageView;


public class MainController implements Initializable {
	@FXML
	private TitledPane panelOne;
	@FXML
	private ComboBox<String> cb;
	@FXML
	private ListView<String> lvNomes;
	@FXML
	private TextField tfNomes;
	@FXML
	private TitledPane panel3;
	@FXML
	private ImageView img1;
	@FXML
	private Label lbWelcome;
	@FXML
	private TitledPane panel2;
	@FXML
	private ImageView img;
	@FXML
	private TextField tfUser;
	@FXML
	private PasswordField tfPassword;
	@FXML
	private Label labelInfo;

	// panel 1

	ObservableList<String> combo = FXCollections.observableArrayList();

	ObservableList<String> lista = FXCollections.observableArrayList();

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		cb.setItems(combo);
		lvNomes.setItems(lista);

	}
	public void listar(ActionEvent actionEvent){
		
		lista.add(tfNomes.getText());
		
	}
	public void acrescentar(ActionEvent actionEvent){
		if(tfNomes.getText() == null){
			return;
		}
		combo.add(tfNomes.getText());
		lista.add(tfNomes.getText());
	}
	public void sairLista(ActionEvent actionEvent) throws IOException{
		
	}
	public void sairPrograma(ActionEvent actionEvent){
		System.exit(0);
	}
	public void remover(ActionEvent actionEvent){
		combo.remove(cb.getSelectionModel().getSelectedItem());
		lista.remove(lvNomes.getSelectionModel().getSelectedItem());
	}
	

	//panel 2
	public void acessar(ActionEvent event){
		
		if(tfUser.getText().equals("rafael") && tfPassword.getText().equals("rafael")){
			labelInfo.setText("Usuário Logado...");
		}else{
			labelInfo.setText("Usuário ou Senha errados...");
		}
		
	}
}
