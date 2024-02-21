package view;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Cadastro  extends Application {

    @FXML
    private TextField emailField;
    private String caminhoCss;

    FXMLControllerUtils fxmlControllerUtils = new FXMLControllerUtils();

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Cadastro.fxml"));
        Parent root = loader.load();


        // Inicializar o controller após carregar o FXML
        Cadastro controller = loader.getController();


        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Cadastro InventarioHGV");
        fxmlControllerUtils.adicionarIconeHGV(stage);

        root.requestFocus();
        stage.show();


    }



    private void registrar(){

    }


}
