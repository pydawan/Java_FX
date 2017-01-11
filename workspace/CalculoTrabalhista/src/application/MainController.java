package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.scene.control.Label;

public class MainController {
	@FXML
	private Button btnCalc;
	@FXML
	private TextField lbDias;
	@FXML
	private TextField lbFDS;
	@FXML
	private Button btnRecalc;
	@FXML
	private Button btnSair;
	@FXML
	private Label li;
	@FXML
	private Label refPiso;
	@FXML
	private Label refAdic;
	@FXML
	private Label refHoras;
	@FXML
	private Label refHorasSeis;
	@FXML
	private Label refHorasCem;
	@FXML
	private Label bruto;
	@FXML
	private Label vPiso;
	@FXML
	private Label vAdc;
	@FXML
	private Label vHoras;
	@FXML
	private Label vHorasSeis;
	@FXML
	private Label vHorasCem;
	@FXML
	private Label vDSR;	
	@FXML
	private Label vTrans;
	@FXML
	private Label vRef;
	@FXML
	private Label desconto;
	@FXML
	private Label vDesconto;
	@FXML
	private Label refSind;
	@FXML
	private Label refCOnv;
	@FXML
	private Label refVR;
	@FXML
	private Label refVT;
	@FXML
	private Label vSind;
	@FXML
	private Label vConv;
	@FXML
	private Label vVR;
	@FXML
	private Label vVT;
	@FXML
	private Label vInss;
	@FXML
	private Label refInss;
	@FXML
	private Label liquido;
	@FXML
	private Label refDSR;
	@FXML
	private TextField tFT;
	@FXML
	private TextField t100;
	
	
	
	private int diasTrabalhados;
	private int fds;
	private boolean start = true;
	private double piso;
	private double adc;
	private int horas;
	private double horasSeis;
	private double horasCem;
	private double inss;
	private double vt;
	private double vr;
	private double conv;
	private double sind;
	

	public void somar(ActionEvent evento){
		
		
		refPiso.setText("1446.40");
		vPiso.setText(refPiso.getText());
		refAdic.setText("433.92");
		vAdc.setText(refAdic.getText());
		refHoras.setText(lbFDS.getText());
		refHorasSeis.setText("13.66");
		vHorasSeis.setText(refHorasSeis.getText());
		refHorasCem.setText("17.08");
		vHorasCem.setText(refHorasCem.getText());
		refDSR.setText(lbFDS.getText());
		
		//convertendo
		
		piso = Double.parseDouble(refPiso.getText());
		adc = Double.parseDouble(refAdic.getText());
		horasSeis = Double.parseDouble(refHorasSeis.getText());
		horasCem = Double.parseDouble(refHorasCem.getText());
		diasTrabalhados = Integer.parseInt(lbDias.getText());
		fds = Integer.parseInt(lbFDS.getText());
				
		//descontos
		refInss.setText("9");
		refVT.setText("6");
		refVR.setText("5");
		refCOnv.setText("6");
		refSind.setText("1");
		
		//convertendo		
		inss = Double.parseDouble(refInss.getText());
		vt = Double.parseDouble(refVT.getText());
		vr = Double.parseDouble(refCOnv.getText());
		sind = Double.parseDouble(refSind.getText());
		
		//calc bruto
		
		refPiso.setText("1446.40");
		//Calc Adicional
		adc = (piso * 30) / 100;
		//Calc Horas trabalhada
		horas = (diasTrabalhados * 11) -191;
		refHoras.setText(String.valueOf(horas)+" Horas");
		
		//Horas a 60%
		vHorasSeis.setText(refHorasSeis.getText());
		horasSeis = Double.parseDouble(vHorasSeis.getText());
		horasSeis = horas * 13.66;
		vHorasSeis.setText(String.valueOf(horasSeis));
		 
		//horas 100%
		double t1 = Double.parseDouble(t100.getText());
		horasCem = ( t1 * 11) * 17.08;		
		vHorasCem.setText(String.valueOf(horasCem));
				
		//Calc DSR
		double txt = Double.parseDouble(lbFDS.getText());
		double txt1 = (horasSeis / diasTrabalhados) * txt;
		vDSR.setText(String.valueOf(txt1));
		
		//Calc bruto
		
		
		
		
		
		
		
		
		
	}
	

}
