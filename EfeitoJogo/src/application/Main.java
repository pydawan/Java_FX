package application;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javafx.animation.AnimationTimer;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;
import javafx.scene.image.PixelReader;

public class Main extends Application {

	private double time = 0;
	private GraphicsContext g;
	private List<Particle> particle = new ArrayList<>();

	private Parent createContent() {
		Pane root = new Pane();

		Canvas canvas = new Canvas(1000, 600);
		root.getChildren().add(canvas);

		g = canvas.getGraphicsContext2D();

		Image image = new Image(getClass().getResource("/img/halo2.png").toExternalForm());
		g.drawImage(image, 700, 50);

		desintegrate(image);

		AnimationTimer timer = new AnimationTimer() {

			@Override
			public void handle(long now) {
				time += 0.017;
				//if (time > 2) 
				update();
				

			}
		};
		timer.start();

		Timeline timeline = new Timeline();
		timeline.setDelay(Duration.seconds(2));
		timeline.setCycleCount(5);
		timeline.setAutoReverse(true);

		List<KeyValue> values = new ArrayList<>();

		particle.forEach(p -> {
			values.add(new KeyValue(p.xProperty(), p.getx() - 700 + 100 /*Interpolator.DISCRETE*/));
		});
		
		Collections.shuffle(values);
		
		
		int chuckSize = 50;
		int chucks = values.size() / chuckSize + 1;

		for (int i = 0; i < chucks; i++) {
			timeline.getKeyFrames()
					.add(new KeyFrame(Duration.seconds(Math.random() * 3),
							values.subList(i * chuckSize, i == chucks - 1 ? values.size() : (i + 1) * chuckSize)
									.toArray(new KeyValue[0]))

			);
		}
		timeline.play();

		return root;

	}

	private void update() {
		g.clearRect(0, 0, 1280, 720);

		// particle.removeIf(particle::isDead);
		//particle.parallelStream().filter(p -> !p.isActive())
		//		.forEach(p -> p.activate(new Point2D(+Math.random() * 10, Math.random() * 10)));
		
		particle.forEach(p -> {
			//p.update();
			p.draw(g);
		});
	}

	private void desintegrate(Image image) {
		List<Particle> list = new ArrayList<>();
		PixelReader pixelReader = image.getPixelReader();

		for (int y = 0; y < image.getHeight(); y++) {
			for (int x = 0; x < image.getWidth(); x++) {
				Color color = pixelReader.getColor(x, y);

				if (!color.equals(Color.TRANSPARENT)) {
					Particle p = new Particle(x + 700, y + 50, color);
					particle.add(p);
				}
			}
		}
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Scene scene = new Scene(createContent());
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
