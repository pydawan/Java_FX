package application;

import java.io.File;
java.util.ArrayList
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class MainController {
	
	
	@FXML
	private Button btn1;
	
	
	@FXML
	private Button btn2;
	
	@FXML
	private ListView listaV;
	
	
	public void ButtonAction1(ActionEvent event1){
		
		FileChooser fc = new FileChooser();
		fc.setInitialDirectory(new File("C:\\dev"));
		fc.getExtensionFilters().addAll(
				new ExtensionFilter("PDF FILES", "*.pdf"));
		File selectedFile = fc.showOpenDialog(null);
		
		if(selectedFile != null){
			listaV.getItems().addAll(selectedFile.getAbsolutePath());
		}else{
			System.out.println("Arquivo inv�lido");
		}
		
		
	}
	public void ButtonAction2(ActionEvent event2){
		
		FileChooser fc = new FileChooser();
		fc.setInitialDirectory(new File("C:\\dev"));
		fc.getExtensionFilters().addAll(
				new ExtensionFilter("PDF FILES", "*.pdf"));
		java.util.List<File> selectedFiles = fc.showOpenMultipleDialog(null);
		
		if(selectedFiles != null){
			
			for(int i=0; i<selectedFiles.size(); i++){
				
				listaV.getItems().addAll(selectedFiles.get(i).getAbsolutePath());
			}
		}else{
			System.out.println("Arquivo Errado");
		}
		
	}

}