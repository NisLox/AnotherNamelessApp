package Model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.MainView;

public class StartApplication extends Application{


    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("resources/MainView.fxml"));


        Scene scene = new Scene(root, 300, 275);
        scene.getStylesheets().add("resources/CSS/Theme.css");

        stage.setTitle("Nameless App");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
