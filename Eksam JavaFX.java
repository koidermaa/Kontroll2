import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

/**
 * Joonista Ellipse, mille ringjoone paksust saab kasutaja slideriga muuta.
 */
public class JavaFX extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {

        Stage lava= new Stage();
        Pane pane = new Pane();
        Scene stseen = new Scene(pane, 300,200);
        lava.setScene(stseen);

        final Ellipse elips = new Ellipse();
        elips.setRadiusX(30);
        elips.setRadiusY(40);
        elips.setCenterX(100);
        elips.setCenterY(100);

        Slider slider = new Slider(0,100,1);
        slider.setShowTickLabels(true);
        slider.valueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> ov,
                                Number old_val, Number new_val) {
                elips.setRadiusX(new_val.doubleValue());
            }
        });

        pane.getChildren().add(slider);
        pane.getChildren().add(elips);

        lava.show();
    }
}
