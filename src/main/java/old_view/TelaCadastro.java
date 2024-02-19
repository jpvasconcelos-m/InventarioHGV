package old_view;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TelaCadastro extends Application {

    @Override
    public void start(Stage primaryStage) {




        primaryStage.setTitle("Cadastro");
        primaryStage.setResizable(false);

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20, 20, 20, 20));
        grid.setVgap(10);
        grid.setHgap(10);

        // Labels
        Label nameLabel = new Label("Nome Completo:");
        GridPane.setConstraints(nameLabel, 0, 0);

        Label loginLabel = new Label("Login:");
        GridPane.setConstraints(loginLabel, 0, 1);

        Label senhaLabel = new Label("Senha:");
        GridPane.setConstraints(senhaLabel, 0, 2);

        // Text Fields
        TextField nameField = new TextField();
        GridPane.setConstraints(nameField, 1, 0);

        TextField loginField = new TextField();
        GridPane.setConstraints(loginField, 1, 1);

        PasswordField senhaField = new PasswordField();
        GridPane.setConstraints(senhaField, 1, 2);

        // Checkbox
        CheckBox adminCheckBox = new CheckBox("É administrador?");
        GridPane.setConstraints(adminCheckBox, 1, 3);

        // Button
        Button cadastrarButton = new Button("Cadastrar");
        cadastrarButton.getStyleClass().add("botaoCadastro");

        cadastrarButton.setDefaultButton(true);
        GridPane.setConstraints(cadastrarButton, 1, 4);
        cadastrarButton.setOnAction( e->{
            System.out.println("Nome: " + nameField.getText());
            System.out.println("Login: " + loginField.getText());
            System.out.println("Senha: " +senhaField.getText());
            System.out.println("Admin: " +adminCheckBox.isSelected());

        });


        grid.getChildren().addAll(nameLabel, nameField, loginLabel, loginField, senhaLabel, senhaField, adminCheckBox, cadastrarButton);

        Scene scene = new Scene(grid, 300, 200);


        Image iconeAplicacao = new Image(getClass().getResourceAsStream("/icone.png"));
        primaryStage.getIcons().add(iconeAplicacao);


        String caminhoCss = getClass().getResource("/telaLogin.css").toExternalForm();
        scene.getStylesheets().add(caminhoCss);



        primaryStage.setScene(scene);
        primaryStage.show();


    }

}
