package ViewModel;


import Model.Services.DialogService;
import Model.Services.IDialogService;

public class MainViewModel {

    IDialogService dialogService;

    public MainViewModel(){
        dialogService = new DialogService();
    }

    public void SocialButtonAction() {
        System.out.println("Test");
        dialogService.openSocialWindow();

    }

    public void WorkoutButtonAction() {
    }

    public void DietButtonAction() {
    }

    public void ProgressButtonAction() {
    }
}
