package Model.Services;

import ViewModel.SocialViewModel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import view.SocialView;

import java.io.IOException;

public class DialogService implements IDialogService {

    @Override
    public void openSocialWindow() {
        FXMLLoader loader = new FXMLLoader();
        try {
            Pane root = FXMLLoader.load(getClass().getClassLoader().getResource("resources/SocialView.fxml"));
            //get generated view object
            SocialView view = loader.getController();
            //create viewModel and pass to view
            SocialViewModel viewModel = new SocialViewModel();
            //TODO: Set the view model here
//            view.setViewModel(viewModel);

            //Create stage and show
            Scene newScene = new Scene(root);
            Stage newStage = new Stage();
            newStage.setScene(newScene);
            newStage.show();

        } catch (IOException exception) {
            //TODO log error (logging service?)
        }
    }

    @Override
    public void openWorkOutsWindow() {

    }

    @Override
    public void openDietsWindow() {

    }

    @Override
    public void openProgressWindow() {

    }
}
