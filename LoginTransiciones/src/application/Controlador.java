package application;

import javafx.fxml.FXML;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class Controlador {
	@FXML
	private MediaView mV;

	@FXML
	public void initialize() {
		Media video = new Media(getClass().getResource("video1.mp4").toExternalForm());
		MediaPlayer reproductor = new MediaPlayer(video);
		mV.setMediaPlayer(reproductor);
		reproductor.setVolume(0.5);
		reproductor.play();

	}

}
