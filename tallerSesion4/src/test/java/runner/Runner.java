package runner;
// HOOKS

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import singletonSession.Session;

import java.net.MalformedURLException;

@RunWith(Cucumber.class)
public class Runner {
    @Before
    public void setup(){
        System.out.println("este es mi HOOK before");
    }
    @After
    public void cleanup() throws MalformedURLException {
        //Session.getInstance().closeSession();
        System.out.println("este es mi HOOK after");
    }

}
