package view;

import ViewModel.MainViewModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainView {

@FXML
Button social;
@FXML
Button workouts;
@FXML
Button diets;
@FXML
Button progress;

MainViewModel mainViewModel;

    public void SocialButton(ActionEvent actionEvent) {
        mainViewModel.SocialButtonAction();
    }

    public void WorkoutButton(ActionEvent actionEvent) {
        mainViewModel.WorkoutButtonAction();
    }

    public void DietButton(ActionEvent actionEvent) {
        mainViewModel.DietButtonAction();
    }

    public void ProgressButton(ActionEvent actionEvent) {
        mainViewModel.ProgressButtonAction();
    }

}


