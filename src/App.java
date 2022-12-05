import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("home.fxml"));

        HomeController home = new HomeController();
        loader.setController(home);

        Parent root = loader.load();

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("First Program");
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
