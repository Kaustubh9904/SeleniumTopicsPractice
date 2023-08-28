package EcommAppAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class protoCommerceAssignment {
    //Assignment for Dropdowns,EditBoxes,Error Valdiation)
    public static void main(String[] args) {
        EdgeOptions options = new EdgeOptions();
        //options.setBinary("D:\\edgedriver_win32\\msedgedriver");
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new EdgeDriver(options);
        System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win32\\msedgedriver");
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().window().maximize();
        driver.findElement(By.name("name")).sendKeys("Kaustubh Thakare");
        driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Password");
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
        Select dropDown = new Select(staticDropdown);
        dropDown.selectByVisibleText("Male");
        driver.findElement(By.id("inlineRadio2")).click();
        driver.findElement(By.name("bday")).sendKeys("12-12-2012");
        driver.findElement(By.xpath("//input[contains(@class,'btn-success')]")).click();
        System.out.println(driver.findElement(By.cssSelector("div[class*='alert-success']")).getText());
        driver.quit();
    }
}
