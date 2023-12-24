package pages;


import driverHelper.DriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class commonMethods extends DriverHelper {

    // commonMethods.items(option, "a[data-name='ev_cmsComponentLoad']");
    public static void items(String item, String element){
        List<WebElement> elements = driver.findElements(By.cssSelector(element));
        for (WebElement product : elements){
            if (product.getText().equals(item)){
                product.click();
                break;
            }
        }
    }
}
