package application;

import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainController implements Initializable{

	
	Image icone = new Image(
			getClass().getResourceAsStream("/img/sa.png"));
	
	
	
	@FXML
	TreeView<String> tree;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		TreeItem<String> root = new TreeItem<>("root", new ImageView(icone));
		root.setExpanded(true);
	
		TreeItem<String> a = new TreeItem<>("familia");
		TreeItem<String> b = new TreeItem<>("A");
		TreeItem<String> c = new TreeItem<>("A");
		TreeItem<String> d = new TreeItem<>("A");
		root.getChildren().addAll(a,b,c,d);
		a.setExpanded(true);
		
		TreeItem<String> rose = new TreeItem<>("ROSE");
		TreeItem<String> vitor = new TreeItem<>("VITOR");
		TreeItem<String> heitor = new TreeItem<>("HEITOR");
		a.getChildren().addAll(rose, vitor, heitor);
		
		tree.setRoot(root);
	}
	public void mouseClick(MouseEvent me){
		
		TreeItem<String> item = tree.getSelectionModel().getSelectedItem();
		System.out.println(item.getValue());
	}

}
