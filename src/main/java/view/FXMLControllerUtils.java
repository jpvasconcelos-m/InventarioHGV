package view;

import javafx.scene.image.Image;
import javafx.stage.Stage;

public class FXMLControllerUtils {

     void adicionarIconeHGV(Stage stage){

        Image iconeAplicacao = new Image(getClass().getResourceAsStream("/icone.png"));
        stage.getIcons().add(iconeAplicacao);
    }

}
