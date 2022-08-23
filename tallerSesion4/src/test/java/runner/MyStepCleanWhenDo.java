package runner;

import activities.whenDo.CreateTaskScreen;
import activities.whenDo.MainScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.net.MalformedURLException;

public class MyStepCleanWhenDo {

    MainScreen mainScreen= new MainScreen();
    CreateTaskScreen createTaskScreen = new CreateTaskScreen();
    @Given("I have access to WhenDo1")
    public void iHaveAccessToWhenDo() {
    }

    @When("I create a task with")
    public void iCreateATaskWith() throws MalformedURLException {
        mainScreen.addTask.click();
    }

    @And("I keep the task")
    public void iCreateATaskWitz() throws MalformedURLException {
        createTaskScreen.saveButton.click();
    }

    @And("I write the title:{string}")
    public void yoEscriboElTitulo(String arg0) throws MalformedURLException {
        createTaskScreen.titleTxtBox.setText(arg0);
    }

    @And("I write the detail:{string}")
    public void yoEscriboElDetalle(String arg0) throws MalformedURLException {
        createTaskScreen.detailTxtBox.setText(arg0);
    }

    @Then("the task {string} should be displayed")
    public void theTaskShouldBeDisplayed(String arg0) throws MalformedURLException {
        Assertions.assertEquals(arg0,mainScreen.firstTaskListed.getText(),"ERROR no creo bien");

    }
}
