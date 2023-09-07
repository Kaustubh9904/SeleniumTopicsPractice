package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class actionDemo {
    public static void main(String[] args) {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.msedge.driver","D:\\edgedriver_win32\\msedgedriver");
        WebDriver driver = new EdgeDriver(options);
        driver.get("https://amazon.in/");
        driver.manage().window().maximize();
        WebElement move = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav-link-accountList']"));
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
//Create object a of the Actions class
        Actions a = new Actions(driver) ;
//.build() and .perform are necessary to execute the step
        a.moveToElement(searchBox).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
        a.moveToElement(move).contextClick().build().perform();


    }
}
