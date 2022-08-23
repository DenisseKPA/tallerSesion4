package activities.whenDo;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class MainScreen {

    public Button addTask = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
    public Label firstTaskListed = new Label(By.id("com.vrproductiveapps.whendo:id/home_list_item_text"));
}