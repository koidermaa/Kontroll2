package Main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Logimine extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox vbox = new VBox();
        Scene stseen = new Scene(vbox, 600, 200);
        primaryStage.setScene(stseen);
        primaryStage.show();

        Label kasutajaNimi = new Label("Kasutajanimi");
        TextField kasutajaInput = new TextField();
        Label parooliNimi = new Label("Parool");
        PasswordField parooolInput = new PasswordField();
        Button nupp = new Button("Logi sisse");

        Label teadeLabel = new Label();
        vbox.getChildren().addAll(kasutajaNimi, kasutajaInput, parooliNimi, parooolInput, nupp, teadeLabel);

        nupp.setOnAction( event -> {
            String kasutajaSisu = kasutajaInput.getText();
            String parooliSisu= parooolInput.getText();
                    if (kasutajaSisu.equals("kristo")&&parooliSisu.equals("krissu2")){
                        System.out.println("Logisid sisse");
                    } else {
                        teadeLabel.setText("Ei saa sisse!!");
                        teadeLabel.setTextFill(Color.RED);
                    }
                }
        );

    }
}
