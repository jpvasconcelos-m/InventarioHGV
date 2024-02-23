package view;

import controller.AutenticadorLogin;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Login extends Application {




    @FXML
    private Button bttnEntrar;
    @FXML
    private Button bttnCadastro;
    @FXML
    private TextField loginField;
    @FXML
    private PasswordField passwordField;

    //Objeto de utilitários para evitar repetitividade
    FXMLControllerUtils fxmlControllerUtils = new FXMLControllerUtils();
    boolean autenticou;



    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("InventarioHGV");
        stage.setScene(chamarCenaLogin());
        //Adiciona icone padrão da aplicação
        fxmlControllerUtils.adicionarIconeHGV(stage);



        stage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }

    @FXML
    private boolean entrarUsuario(ActionEvent event) throws IOException {
        System.out.println("botao entrar pressionado!");

       boolean autenticou = AutenticadorLogin.autenticar(loginField.getText(),passwordField.getText());
        System.out.println(autenticou);

        //Retorna se o login ocorreu ou não.
        return autenticou;

    }


    public Scene chamarCenaLogin() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/Login.fxml"));
        Scene scene = new Scene(root);






        return scene;


    }




}




