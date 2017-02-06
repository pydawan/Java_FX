package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.ListView;


public class MainController implements Initializable{
	@FXML
	private TextField lbNome;
	@FXML
	private TextField lbEmpresa;
	@FXML
	private TextField lbVeiculo;
	@FXML
	private TextField lbPlaca;
	@FXML
	private ListView<String> listView;
	
	ObservableList<String> lista = FXCollections.observableArrayList();
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		listView.setItems(lista);
		
		
	}
	public void salvar(ActionEvent actionEvent){
		
		lista.addAll("Nome: "+lbNome.getText()+" Empresa: "+lbEmpresa.getText()+" Marca do veículo: "+lbVeiculo.getText()+" Número da placa: "+lbPlaca.getText());
		
	}
	public void remover(ActionEvent actionEvent){
		 lista.remove(listView.getSelectionModel().getSelectedItem());
	}
	public void limpar(ActionEvent event){
		lista.clear();
	}
	public void sair(ActionEvent actionEvent){
		System.exit(0);
	}
	
	

}
