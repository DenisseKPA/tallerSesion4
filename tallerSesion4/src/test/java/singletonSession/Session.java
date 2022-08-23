package singletonSession;

import factoryDevice.FactoryDevice;
import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;

public class Session {
    // atributo del mismo tipo del singleton privado
    private static Session session = null;
    private AppiumDriver driver;
    // constructor ser privado
    private Session() throws MalformedURLException {
        driver = FactoryDevice.make("android").create();
    }
    // metodo publico estatico de retorne el objeto unico
    // synchronized ---> no utilizarlo pq trae problemas en la ejecucion paralela
    public static Session getInstance() throws MalformedURLException {
        if (session == null)
            session = new Session();
        return session;
    }
    public void closeSession(){
        driver.quit();
        session = null;
    }

    public AppiumDriver getDriver() {
        return driver;
    }

}
