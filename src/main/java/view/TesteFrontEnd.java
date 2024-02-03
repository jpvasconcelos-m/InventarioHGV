package view;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TesteFrontEnd extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Label labelTitulo = new Label("Tela Login");
        labelTitulo.getStyleClass().add("texto");
        labelTitulo.setAlignment(Pos.TOP_CENTER);

        Label login = new Label("Login");

        TextField campoTextoLogin = new TextField();
        PasswordField campoSenha = new PasswordField();

        campoTextoLogin.setMaxHeight(200);
        campoTextoLogin.setMaxWidth(200);

        campoSenha.setMaxHeight(200);
        campoSenha.setMaxWidth(200);

        VBox boxCampos = new VBox();
        boxCampos.setAlignment(Pos.CENTER);
        boxCampos.setSpacing(10);


        boxCampos.getChildren().add(campoTextoLogin);
        boxCampos.getChildren().add(campoSenha);



        VBox boxPrincipal = new VBox();
        boxPrincipal.setSpacing(45);
        boxPrincipal.getChildren().add(labelTitulo);
        boxPrincipal.getStyleClass().add("vermelha") ;
        boxPrincipal.setAlignment(Pos.CENTER);
        boxPrincipal.getChildren().add(boxCampos);










        String caminhoCss = getClass().getResource("/telaLogin.css").toExternalForm();
        Scene cenaPrincipal = new Scene(boxPrincipal,400,400);

        cenaPrincipal.getStylesheets().add(caminhoCss);
        cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald");

        stage.setScene(cenaPrincipal);
        stage.show();



    }

    public static void main(String[] args) {
        launch(args);
    }




}


