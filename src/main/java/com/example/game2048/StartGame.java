package com.example.game2048;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class StartGame extends Application  {



    // launch the application
    public void start(Stage stage) throws IOException {
        // set title for the stage
        stage.setTitle("GAME 2048");

        // create a stack pane
        StackPane r = new StackPane();

        // create a scene
        Scene sc = new Scene(r, 900, 900);


        // create radiobuttons
//        RadioButton r1 = new RadioButton("DARK");
//        RadioButton r2 = new RadioButton("LIGHT");
//    r1.setLayoutX(100);
//       r1.setLayoutX(100);
//        r1.setFont(Font.font(80));
//    r2.setLayoutX(200);
//    r2.setLayoutX(100);
//    r2.setFont(Font.font(80));
//
//        r.getChildren().add(r1);
//        r.getChildren().add(r2);

        // create a button
        Button b = new Button("Start");
    b.setFont(Font.font(20));


        // add button
        r.getChildren().add(b);


        r.setStyle("-fx-background-color: yellow;");
        b.relocate(400,400);
//        Text text = new Text("Start Game");
//        text.setLayoutX(100);
//        text.setLayoutX(100);
//        text.setFont(Font.font(80));
//        r.getChildren().add(text);
// action event
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                r.getChildren().clear();

                Main m = new Main();
              //  Platform.exit();
                stage.close();
                m.start(new Stage());

            }
        };

        // when button is pressed
        b.setOnAction(event);
        // set the scene
        stage.setScene(sc);

        stage.show();
    }

   public static void main(String args[])
    {
        // launch the application
        launch(args);
    }
}
