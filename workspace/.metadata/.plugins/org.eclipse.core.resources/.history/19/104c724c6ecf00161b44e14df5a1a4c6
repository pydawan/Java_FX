package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;

public class MainController {
	
	@FXML PieChart pieChart;
	
	
	public void btn1(ActionEvent event){
		ObservableList<Data> list = FXCollections.observableArrayList(
				
				new PieChart.Data("Java", 50),
				new PieChart.Data("C++", 80),
				new PieChart.Data("Js", 90),
				new PieChart.Data("angular", 20),
				new PieChart.Data("php", 50),
				new PieChart.Data("python", 80)				
				);
		pieChart.setData(list);
	}

}
