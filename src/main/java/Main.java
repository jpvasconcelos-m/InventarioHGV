import javafx.stage.Stage;
import old_view.TelaLogin;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Main {

    //Ainda não testei as alterações do listener.

    static TelaLogin tl = new TelaLogin();
    static PropertyChangeListener listener = new PropertyChangeListener() {
        @Override
        public void propertyChange(PropertyChangeEvent evt) {
            System.out.println(evt.getPropertyName());
            System.out.println(evt.getNewValue());
            System.out.println(evt.getOldValue());
        }
    };

        public static void main(String[] args) {
            tl.addPropertyChangeListener(listener);

            try {
                tl.start(new Stage());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }


        }

    }




