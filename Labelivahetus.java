package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Kristo on 27/01/2016.
 */
public class Labelivahetus extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Stage lava= new Stage();
        VBox pane = new VBox();
        Scene stseen = new Scene(pane, 300,200);
        lava.setScene(stseen);

        Label silt = new Label("dsg");
        TextField kiri = new TextField("sisesta");

        kiri.setOnAction(event -> {
            String b = kiri.getText();
            System.out.println(b);
            silt.setText(b);
        });

        pane.getChildren().add(silt);
        pane.getChildren().add(kiri);
        lava.show();

    }
}
