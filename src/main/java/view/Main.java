package view;

import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        Login login = new Login();
        Cadastro cadastro = new Cadastro();
        stage.setScene(login.chamarCenaLogin());


        stage.show();








    }
}
