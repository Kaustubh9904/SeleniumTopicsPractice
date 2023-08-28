package misc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignmentFillForm {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\edgedriver_win32\\msedgedriver");
        WebDriver driver = new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        driver.manage().window().maximize();
        driver.findElement(By.className("form-control.ng-pristine.ng-invalid.ng-touched")).sendKeys("rahul shetty");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("rahlshetty@123.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("12345");
        driver.findElement(By.cssSelector("input[id='exampleCheck1']")).click();
        driver.findElement(By.id("#exampleFormControlSelect1")).click();
        Thread.sleep(1000);
        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByIndex(2);
        driver.findElement(By.cssSelector(""));
        driver.quit();
    }

}
