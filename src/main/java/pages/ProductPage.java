package pages;

import driverHelper.DriverHelper;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class ProductPage extends DriverHelper {

    public void productPage(String product){
        WebElement productPage = driver.findElement(By.cssSelector("div[class='browse__content-area'] h1"));
        String productName = productPage.getText();
        System.out.println(productName);
        assertEquals(productName, product);
    }

    public void selectItem(String item){
        commonMethods.items(item, "li [data-el='category-item'] a");
    }

    public void onItemPage(String item){
        WebElement itemPage = driver.findElement(By.cssSelector("div[data-el='search-title'] h1"));
        String itemName = itemPage.getText();
        System.out.println(itemName);
        assertEquals(itemName, item);
    }

    public void selectPrice(String price){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        commonMethods.items(price, "div[class='checkboxWrapper'] span span");
    }

    public void numberOfProducts(){
        WebElement number = driver.findElement(By.cssSelector("div[data-el='search-toolbar'] span"));
        String num = String.valueOf(number.getText().split(" products"));
        System.out.println(num);
    }
}
