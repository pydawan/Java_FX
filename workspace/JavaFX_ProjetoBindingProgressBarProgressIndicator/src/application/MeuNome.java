package application;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.value.WritableDoubleValue;

public class MeuNome {
	
	private DoubleProperty number;

	public double getNumber() {
		if(number != null)
		return number.get();
		return 0;
	}

	public void setNumber(double num) {
		this.numberProperty().set(num);
	}

	public final DoubleProperty numberProperty(){
		if(number == null){
			number = new SimpleDoubleProperty(0);
		}
		return number;
	}
}
