import io.cucumber.java.After;
import io.cucumber.java.Before;

import static driverHelper.DriverHelper.*;


public class Hooks {


    @Before
    public void setup(){
        initializeDriver();
        maximizeBrowser();
        getUrl("https://www.argos.co.uk/");
        implicitWait();
    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
