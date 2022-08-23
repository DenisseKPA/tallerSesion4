package factoryDevice;

public class FactoryDevice {
    public static IDevice make(String type){
        IDevice device;
        switch (type.toLowerCase()){
            case "android":
                device =  new Android();
                break;
            case "ios":
                device = new Ios();
                break;
            case "cloud":
                device= new Cloud();
                break;
            default:
                device = new FirefoxOS();
                break;
        }
        return device;

    }

}

