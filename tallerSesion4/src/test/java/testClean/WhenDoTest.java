package testClean;

import activities.whenDo.CreateTaskScreen;
import activities.whenDo.MainScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import singletonSession.Session;

import java.net.MalformedURLException;

public class WhenDoTest {
    MainScreen mainScreen= new MainScreen();
    CreateTaskScreen createTaskScreen = new CreateTaskScreen();

    @Test
    public void verifyCreateTask() throws MalformedURLException {
        String nameTask="Group3";
        String detailTask="Este es el Group3";
        mainScreen.addTask.click();
        createTaskScreen.titleTxtBox.setText(nameTask);
        createTaskScreen.detailTxtBox.setText(detailTask);
        createTaskScreen.saveButton.click();
        Assertions.assertEquals(nameTask,mainScreen.firstTaskListed.getText(),"ERROR la nota no se creo correctamente");

        String nameTask1="Denisse";
        String detailTask1="Mi nombre es Denisse Palomino";
        mainScreen.addTask.click();
        createTaskScreen.titleTxtBox.setText(nameTask1);
        createTaskScreen.detailTxtBox.setText(detailTask1);
        createTaskScreen.saveButton.click();
        Assertions.assertEquals(nameTask1,mainScreen.firstTaskListed.getText(),"ERROR la nota no se creo correctamente");

        String nameTask2="Anahi";
        String detailTask2="Mi nombre es Anahi Velasquez";
        mainScreen.addTask.click();
        createTaskScreen.titleTxtBox.setText(nameTask2);
        createTaskScreen.detailTxtBox.setText(detailTask2);
        createTaskScreen.saveButton.click();
        Assertions.assertEquals(nameTask2,mainScreen.firstTaskListed.getText(),"ERROR la nota no se creo correctamente");
    }
    @AfterEach
    public void closeApp() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
