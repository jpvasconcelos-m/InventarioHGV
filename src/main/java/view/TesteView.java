package view;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TesteView extends Application {


    @Override
    public void start(Stage stage) throws Exception {

        GradeLogin gl = new GradeLogin();

        Scene scene = new Scene(gl,800,600);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
