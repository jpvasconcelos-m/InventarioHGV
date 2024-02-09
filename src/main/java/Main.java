import javafx.application.Application;
import javafx.stage.Stage;
import view.TelaLogin;

public class Main {

    static TelaLogin tl = new TelaLogin();

    public static void main(String[] args) {
        try {
            tl.start(new Stage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



}
