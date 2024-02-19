package view;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;



public class GradeLogin extends GridPane {

    public GradeLogin(){
        setGridLinesVisible(true);
        setVgap(10);
        setHgap(10);
        setAlignment(Pos.CENTER);

        AdicionarLabelsLoginSenha();
    }


    private void AdicionarLabelsLoginSenha (){
        Label login = new Label("Login:");
        Label senha = new Label("Senha:");

        add(login,0,0);
        add(senha,0,1);

    }




}
