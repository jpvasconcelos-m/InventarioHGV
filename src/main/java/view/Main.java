package view;

import javafx.application.Application;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.stage.Stage;


public class Main extends Application {

    public ChangeListener getChangeListener() {
        return changeListener;
    }

    public void setChangeListener(ChangeListener changeListener) {
        this.changeListener = changeListener;
    }

     ChangeListener changeListener= new ChangeListener() {
        @Override
        public void changed(ObservableValue observableValue, Object o, Object t1) {
            System.out.println("valor mudou main");
        }
    };



    @Override
    public void start(Stage stage) throws Exception {



        Login login = new Login(this);
        login.booleanProperty.addListener(this.changeListener);


        login.booleanProperty.addListener((observableValue, aBoolean, t1) -> System.out.println("aaaaaa"));
        stage.setScene(login.chamarCenaLogin(this));


        stage.show();


    }


}
