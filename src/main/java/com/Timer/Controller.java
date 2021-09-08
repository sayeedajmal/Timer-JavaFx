package com.Timer;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class Controller implements Initializable {
    @FXML
    public Text timer;

    Time time = new Time("00:00:01");

    /*
     * private TextField alarmTime;
     */
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), e -> {
        /*
         * if (time.getCurrentTime().equals(alarmTime.getText())) {
         * System.out.println("ALARM!"); }
         */
        time.oneSecondPassed();
        timer.setText(time.getCurrentTime());
    }));

    /* STOP BUTTON FOR PAUSE */
    public void stop() {
        System.out.println("You Pressed Stop");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        timer.setText(time.getCurrentTime());
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

    }
}
