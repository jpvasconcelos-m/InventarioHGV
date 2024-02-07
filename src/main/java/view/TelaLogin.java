package view;

import controller.AutenticadorLogin;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TelaLogin extends Application {



    @Override
    public void start(Stage stage) throws Exception {

        Image image = new Image(getClass().getResourceAsStream("/hgv.jpg"));
        ImageView imageView = new ImageView(image);
        imageView.setY(50);


        Label labelTitulo = new Label();
        labelTitulo.getStyleClass().add("titulo");
        labelTitulo.setAlignment(Pos.TOP_CENTER);

        //Área de login.
        TextField campoTextoLogin = new TextField();
        campoTextoLogin.getStyleClass().add("campoTextoLogin");
        Label labelLogin = new Label("Login:");
        labelLogin.getStyleClass().add("labelLoginSenha");

        //Área de senha.
        PasswordField campoSenha = new PasswordField();
        campoSenha.getStyleClass().add("senha");
        Label labelSenha = new Label("Senha:");
        labelSenha.getStyleClass().add("labelLoginSenha");

        Button botaoEntrar = new Button("Entrar");
        botaoEntrar.getStyleClass().add("botaoEntrar");
        botaoEntrar.setOnAction(e ->{
            System.out.println(campoTextoLogin.getText());
            System.out.println(campoSenha.getText());

            AutenticadorLogin.autenticar(campoTextoLogin.getText(),campoSenha.getText());
        });

        Button botaoCadastro = new Button("Cadastre-se");
        botaoCadastro.getStyleClass().add("botaoCadastro");
        botaoCadastro.setOnAction(e -> {
            // Adicione o código para abrir a tela de cadastro aqui
            System.out.println("Abrir tela de cadastro");
        });

        botaoEntrar.setDefaultButton(true);







        GridPane gridpane = new GridPane();
        gridpane.setAlignment(Pos.CENTER);
        gridpane.setVgap(10);
        gridpane.setHgap(10);

        gridpane.add(labelLogin,0 ,0);
        gridpane.add(campoTextoLogin, 1 ,0);

        gridpane.add(labelSenha,0, 1);
        gridpane.add(campoSenha,1,1);

        Image iconeAplicacao = new Image(getClass().getResourceAsStream("/icone.png"));
        stage.getIcons().add(iconeAplicacao);

        Label login = new Label("Login");





        campoTextoLogin.setMaxHeight(160);
        campoTextoLogin.setMaxWidth(160);

        campoSenha.setMaxHeight(200);
        campoSenha.setMaxWidth(200);





        VBox boxPrincipal = new VBox();
        boxPrincipal.getChildren().add(imageView);
        boxPrincipal.setSpacing(28);
        boxPrincipal.getChildren().add(labelTitulo);
        boxPrincipal.getStyleClass().add("vermelha") ;
        boxPrincipal.setAlignment(Pos.CENTER);
        boxPrincipal.getChildren().add(gridpane);
        boxPrincipal.getChildren().add(botaoEntrar);
        boxPrincipal.getChildren().add(botaoCadastro);











        String caminhoCss = getClass().getResource("/telaLogin.css").toExternalForm();
        Scene cenaPrincipal = new Scene(boxPrincipal,400,480);

        cenaPrincipal.getStylesheets().add(caminhoCss);
        cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald");
        cenaPrincipal.setFill(Color.TRANSPARENT);

        stage.setTitle("InventarioHGV");
        stage.setScene(cenaPrincipal);
        stage.show();



    }

    public static void main(String[] args) {
        launch(args);
    }




}


