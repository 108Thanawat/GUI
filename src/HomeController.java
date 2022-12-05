import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HomeController {
    @FXML
    public Label l_Output;
    @FXML
    public TextField tf_input;

    @FXML
    public void Enter() {
        String number = tf_input.getText();
        String txt = "";
        if (checkNumber(number)) {
            int i = Integer.parseInt(number);
            for (int j = 1; j <= 12; j++) {
                txt += j + " X " + i + " = " + (i * j) + "\n";
            }
            l_Output.setText(txt);
        } else {
            l_Output.setText("Cant calculate");
        }
    }

    public boolean checkNumber(String s) {
        try {
            int i = Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
