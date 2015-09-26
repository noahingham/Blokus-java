package comp1140.ass2.Scenes;

import comp1140.ass2.Blokus;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

/**
 * Created by nosha on 25/09/15.
 */
public class Instructions extends Scene {
    public Instructions(Group root, double width, double height, Blokus parent) {
        super(root, width, height, Color.LIGHTBLUE);
        getStylesheets().add("comp1140/ass2/Assets/main.css");
        parent.setTitle("Blokus: Instructions");

        final ImageView imv1 = new ImageView();
        final Image image3 = new Image(Blokus.class.getResourceAsStream("Assets/blokusbg.png"));
        imv1.setImage(image3);
        imv1.setLayoutX(0); imv1.setLayoutY(0);
        imv1.setFitWidth(700);
        imv1.setPreserveRatio(true);
        root.getChildren().add(imv1);


        final ImageView imv = new ImageView();
        final Image image2 = new Image(Blokus.class.getResourceAsStream("Assets/Blokus.png"));
        imv.setImage(image2);
        imv.setFitWidth(400);
        imv.setPreserveRatio(true);
        imv.setLayoutX(350-200); imv.setLayoutY(40);
        root.getChildren().add(imv);



        Button button2 = new Button("Back");
        button2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                parent.toMenu();
            }
        });
        button2.setMinSize(160, 40);
        button2.setLayoutX(100 - button2.getMinWidth() / 2); button2.setLayoutY(10);
        button2.getStyleClass().add("button");
        root.getChildren().add(button2);

        Label label = new Label("Instructions");
        label.setMinSize(160, 40);
        label.setLayoutX(350 - label.getMinWidth() / 2); label.setLayoutY(300);
        root.getChildren().add(label);

    }
}