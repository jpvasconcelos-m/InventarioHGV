package view;

import controller.AutenticadorLogin;
import javafx.application.Application;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javassist.Loader;

import java.io.IOException;
import java.util.EventListener;

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

    SimpleBooleanProperty booleanProperty = new SimpleBooleanProperty();

    public ChangeListener getChangeListener() {
        return changeListener;
    }

    public Login(Main main){
        this.main = main;
        booleanProperty.addListener(changeListener);



    }
    public Login(){

    }


    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;

    }
    private Main main;

    private ChangeListener changeListener= new ChangeListener() {
        @Override
        public void changed(ObservableValue observableValue, Object o, Object t1) {
            System.out.println("valor mudou");
        }
    };

   {
       if((booleanProperty.getValue()==true) && (this.getMain()!=null)){
           booleanProperty.addListener(this.getMain().getChangeListener());

           this.getMain().getChangeListener().changed(booleanProperty,false,true);
       }
       else {
           System.out.println("problema");
       }

    }





    @Override
    public void start(Stage stage) throws Exception {

        chamarCenaLogin(this.main);



        stage.setTitle("InventarioHGV");
        stage.setScene(chamarCenaLogin( ));
        //Adiciona icone padrão da aplicação
        fxmlControllerUtils.adicionarIconeHGV(stage);



        stage.show();


    }


    public static void main(String[] args) {


        launch(args);
    }

    @FXML
    private void entrarUsuario(ActionEvent event) throws IOException {

       main = new Main();

        System.out.println(this.getMain());
        System.out.println("botao entrar pressionado!");






       autenticou = AutenticadorLogin.autenticar(loginField.getText(),passwordField.getText());
        System.out.println(autenticou);

        changeListener.changed(booleanProperty,false,autenticou);
        main.getChangeListener().changed(booleanProperty,false,autenticou);



        booleanProperty.set(autenticou);
        System.out.println(booleanProperty);





    }


    public Scene chamarCenaLogin(Main main) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/Login.fxml"));
        Scene scene = new Scene(root);



        System.out.println(main);
        return scene;


    } public Scene chamarCenaLogin() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/Login.fxml"));
        Scene scene = new Scene(root);


        return scene;


    }





}




