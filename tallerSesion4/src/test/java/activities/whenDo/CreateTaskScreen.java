package activities.whenDo;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class CreateTaskScreen {

    public TextBox titleTxtBox = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
    public TextBox detailTxtBox = new TextBox(By.xpath("//android.widget.EditText[@text='Notes']"));
    public Button saveButton = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));

}
