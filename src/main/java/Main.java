import lord.dic1.communication.App;
import lord.dic1.communication.configs.ConfigurationManager;

public class Main {
    public static void main(String[] args) {
        App app = new App(ConfigurationManager.getInstance());
        app.run();
    }

}
