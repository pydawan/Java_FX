package application;

import java.io.File;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.FileChooser;

public class MainController {
	
	
	@FXML
	private Button btn1;
	
	
	@FXML
	private Button btn2;
	
	@FXML
	private ListView<String> listaV;
	
	
	public void ButtonAction1(ActionEvent event1){
		
		FileChooser fc = new FileChooser();
		fc.setInitialDirectory(new File("C:\\dev"));
		File selectedFile = fc.ShowOpenDialog(null);
		
		if(selectedFile != null){
			listaV.getItems().addAll(selectedFile.getAbsolutePath());
		}else{
			System.out.println("Arquivo inv�lido");
		}
		
		
	}
	public void ButtonAction2(ActionEvent event2){
		
	}

}
