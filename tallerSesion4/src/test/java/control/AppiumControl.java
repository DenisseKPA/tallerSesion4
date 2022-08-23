package control;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import singletonSession.Session;

import java.net.MalformedURLException;
import java.time.Duration;

public class AppiumControl {
    private By locator;
    public WebElement control;

    public AppiumControl(By locator){
        this.locator=locator;
    }

    public void find() throws MalformedURLException {
        control= Session.getInstance().getDriver().findElement(this.locator);
    }

    public void click() throws MalformedURLException {
        this.find();
        this.control.click();
    }

    public boolean isControlDisplayed(){
        try {
            this.find();
            return this.control.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void swipe (AppiumControl finalControl) throws MalformedURLException {

        TouchAction action = new TouchAction((PerformsTouchActions) Session.getInstance().getDriver());
        this.find();
        finalControl.find();
        WebElement elementA=this.control;
        WebElement elementB=finalControl.control;

        int firstX= elementA.getLocation().getX();
        int firstY= elementA.getLocation().getY();

        int secondX= elementB.getLocation().getX();
        int secondY= elementB.getLocation().getY();

        //swipe
        action.press(PointOption.point(firstX,firstY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(secondX,secondY))
                .release().perform();
    }

    public String getText() throws MalformedURLException {
        this.find();
        return this.control.getText();
    }
}
