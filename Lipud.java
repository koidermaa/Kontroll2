package Main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Lipud extends Application{

    public void start(Stage primaryStage) throws Exception {
        eestiLipp();
        jaapaniLipp();

    }
    private void jaapaniLipp() {
        Stage lava= new Stage();
        Pane pane = new Pane();
        Scene stseen = new Scene(pane, 300,200);  // numbrid n‰itavad kasti suurust
        lava.setScene(stseen);

        Rectangle kast = new Rectangle(300,200);   //esimesed on kaugused ‰‰res, siis laius, siis kırgus
        kast.setFill(Color.WHITESMOKE);
        pane.getChildren().add(kast);

        Circle kast2 = new Circle(150,100,50);   //esimesed kaks on kaugused, siis viimane raadius
        kast2.setFill(Color.RED);
        pane.getChildren().add(kast2);

        lava.show();
    }

    private void eestiLipp() {
        Stage lava= new Stage();
        Pane pane = new Pane();
        Scene stseen = new Scene(pane, 500,500);  // numbrid n‰itavad kasti suurust
        lava.setScene(stseen);

        Rectangle kast = new Rectangle(100,100,300,100);   //esimesed on kaugused ‰‰res, siis laius, siis kırgus
        kast.setFill(Color.BLUE);
        pane.getChildren().add(kast);

        Rectangle kast2 = new Rectangle(100,200,300,100);   //esimesed on kaugused ‰‰res, siis laius, siis kırgus
        kast2.setFill(Color.BLACK);
        pane.getChildren().add(kast2);

        lava.show();
    }
}
