package application;


import javafx.beans.property.DoubleProperty;

import javafx.beans.property.SimpleDoubleProperty;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Particle {

	private DoubleProperty x = new SimpleDoubleProperty();
	private DoubleProperty y = new SimpleDoubleProperty();
	
	private Color color;
	private double life = 1.0;
	private boolean active = false;
	
	private Point2D velocidade = Point2D.ZERO;

	public Particle(int x, int y, Color color) {
		this.x.set(x);
		this.y.set(y);
		this.color = color;
	}
	public DoubleProperty xProperty(){
		return x;
	}
	public DoubleProperty yProperty(){
		return y;
	}

	public double getx() {
		return x.get();
	}

	public double gety() {
		return y.get();
	}
	
	public void activate(Point2D velocidade){
		active = true;
		this.velocidade = velocidade;
	}
	
	public boolean isDead(){
		return life == 0;
	}
	
	public boolean isActive(){
		return active;
	}

	public void update() {
		if(!active){
			return;
		}
		life -= 0.017 * 0.75;
		if(life < 0){
			life = 0;
		}
		this.x.set(getx()+velocidade.getX());
		this.y.set(gety()+velocidade.getY());
	}
	
	
	public void draw(GraphicsContext g) {
		g.setFill(color);
		g.setGlobalAlpha(life);
		g.fillOval(getx(), gety(), 1, 1);
	}

}
