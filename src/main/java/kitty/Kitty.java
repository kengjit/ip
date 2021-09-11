package kitty;

import kitty.task.Task;
import kitty.userinterface.Ui;
import kitty.userinterface.UiHandler;
import java.util.ArrayList;

public class Kitty {
    public static ArrayList<Task> tasks = new ArrayList<>();

    public static void main(String[] args) {
        // Initialise Data
        try {
            Ui.initData();
        } catch (KittyException e) {
            Ui.printErrorMessage();
            Ui.exit();
        }

        // Start App
        Ui.greet();
        UiHandler.startApp();
    }
}
