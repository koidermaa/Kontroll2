package Main;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LaevadFX extends Application {
    Stage lava;
    GridPane laud;
    int lauaPikkus = 4;
    int laevaServPx =100;
    int lauaserv = lauaPikkus*laevaServPx;
    StackPane maailm;
    Image minion = new Image("Main/minions.jpg");
    ImagePattern minions = new ImagePattern(minion);


    public void start(Stage primaryStage) throws Exception {
        lava = primaryStage;
        seadistalava();
        paigutaLaevad();
        reageeriKlikile();

    }

    private void reageeriKlikile() {
        laud.setOnMouseClicked(event -> {
            Rectangle ruut = (Rectangle) event.getTarget();
            String ruuduId = ruut.getId();
            if (ruuduId.equals("laev")) {
                ruut.setFill(minions);
                ruut.setId("pihtas");
            } else if (ruuduId.equals("meri")) {
                ruut.setFill(Color.DARKBLUE);
            } else if (ruuduId.equals("pihtas")) {
                System.out.println("Tulistad laipa");
            }
            if (!laevuOnAlles()) {
                gameOver();
            }

        });
    }

    private void gameOver() {
        Label lopp = new Label("Võitsid");
        lopp.setTextFill(Color.WHITE);
        lopp.setFont(new Font(30));
        maailm.getChildren().add(lopp);

    }

    private boolean laevuOnAlles() {
        for (Node ruut: laud.getChildren()){
            if (ruut.getId().equals("laev")){
                return true;
            }
        }
        return false;
    }

    private void paigutaLaevad() {
        for (int i = 0; i < lauaPikkus; i++) {
            for (int j = 0; j < lauaPikkus; j++) {
                Rectangle ruut = new Rectangle(laevaServPx, laevaServPx);
                int random = (int)(Math.random()*2);
                if (random == 1){
                    ruut.setId("laev");
                } else if (random == 0){
                    ruut.setId("meri");
                }
                ruut.setStroke(Color.BLACK);
                ruut.setFill(Color.BLUE);
                laud.add(ruut, i,j);
            }
        }
    }

    private void seadistalava() {
        laud = new GridPane();
        maailm = new StackPane();
        maailm.getChildren().add(laud);

        Scene mangustseen = new Scene(maailm, lauaserv, lauaserv);
        lava.setScene(mangustseen);
        lava.show();
        lava.setOnCloseRequest(event -> System.exit(0));

    }
}
