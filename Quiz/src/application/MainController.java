package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.stage.Stage;

public class MainController {

	@FXML
	private TextField r1, r2, r3, r4, r5, r6, r7, r8, r9, r10;

	@FXML
	private TitledPane q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;

	@FXML
	private Label lbResultado;
	
	@FXML
	private TextField nome;
	
	private int mais;
	
	
	public Label getLbResultado() {
		return lbResultado;
	}
	public void setLbResultado(Label lbResultado) {
		this.lbResultado = lbResultado;
	}
	public TextField getNome() {
		return nome;
	}
	public void setNome(TextField nome) {
		this.nome = nome;
	}
	
	
	
	

	public void verResultado(ActionEvent event) {
		
		if (r1.getText().equals("e")) {
			this.mais++;
		}
		if (r2.getText().equals("e")) {
			this.mais++;
		}
		if (r3.getText().equals("c")) {
			this.mais++;
		}
		if (r4.getText().equals("e")) {
			this.mais++;
		}
		if (r5.getText().equals("a")) {
			this.mais++;
		}
		if (r6.getText().equals("e")) {
			this.mais++;
		}
		if (r7.getText().equals("b")) {
			this.mais++;
		}
		if (r8.getText().equals("d")) {
			this.mais++;
		}
		if (r9.getText().equals("e")) {
			this.mais++;
		}
		if (r10.getText().equals("c")) {
			this.mais++;
		}

		informar();
/*
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/application/Resultado.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Stage secundaryStage = new Stage();
			secundaryStage.setScene(scene);
			secundaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.exit(0);
*/
	}

	public void informar() {
		
		if (this.mais == 10) {
			lbResultado.setText("10 Acertos ");
		}
		if (this.mais == 9) {
			lbResultado.setText("9 Acertos ");
		}
		if (this.mais == 8) {
			lbResultado.setText("8 Acertos ");
		}
		if (this.mais == 7) {
			lbResultado.setText("7 Acertos ");
		}
		if (this.mais == 6) {
			lbResultado.setText("6 Acertos ");
		}
		if (this.mais == 5) {
			lbResultado.setText("5 Acertos ");
		}
		if (this.mais == 4) {
			lbResultado.setText("4 Acertos ");
		}
		if (this.mais == 3) {
			lbResultado.setText("3 Acertos ");
		}
		if (this.mais == 2) {
			lbResultado.setText("2 Acertos ");
		}
		if (this.mais == 1) {
			lbResultado.setText("1 acerto ");
		}
		if (this.mais == 0) {
			lbResultado.setText("Zero Acerto ");
		}
	}

}
