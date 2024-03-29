package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainController implements Initializable{

	@FXML
	TreeView<String> myTreeView;
	
	Image icon = new Image(
			getClass().getResourceAsStream("/img/images.png"));
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		TreeItem<String> root = new TreeItem<>("root", new ImageView(icon));
		
		TreeItem<String> nodeA = new TreeItem<>("NODE-A");
		TreeItem<String> nodeB = new TreeItem<>("NODE-B");
		TreeItem<String> nodeC = new TreeItem<>("NODE-C");
		TreeItem<String> nodeD = new TreeItem<>("NODE-D");
		//pode usar o addAll().
		root.getChildren().addAll(nodeA,nodeB,nodeC,nodeD);
		
		//deixando os elementos de baixo ir�o duplicar
		/*
		root.getChildren().add(nodeA);
		root.getChildren().add(nodeB);
		root.getChildren().add(nodeC);
		root.getChildren().add(nodeD);
		*/
		
		TreeItem<String> nodeA1 = new TreeItem<>("NODE-A1");
		TreeItem<String> nodeB1 = new TreeItem<>("NODE-B1");
		TreeItem<String> nodeC1 = new TreeItem<>("NODE-C1");
		TreeItem<String> nodeD1 = new TreeItem<>("NODE-D1");
		//pode usar o addAll().
		nodeA.getChildren().addAll(nodeA1,nodeB1,nodeC1, nodeD1);
		
		
		myTreeView.setRoot(root);
		
	}

	
	
	
}
